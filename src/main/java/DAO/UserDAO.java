package Services;

import Schemas.User;
import Utils.DataSourceConfig;
import Utils.DbConnection;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    static String noConeccion = "No se pudo conectar a la BD";
    private List<User> users;

    public void  getAllUsers () {
        String SELECT_QUERY = "SELECT * FROM usuario";
        try (Connection connection = DataSourceConfig.getDataSource().getConnection()){
            if (!connection.isValid(0)) {
                System.out.println(noConeccion);
                System.exit(0);
            }
            PreparedStatement selectStatement = connection.prepareStatement(SELECT_QUERY);
            ResultSet rs = selectStatement.executeQuery();
            while (rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                int id_empreso = rs.getInt("id_empresa");
                String nombre_usuario = rs.getString("nombre_usuario");
                String direccion_usuario = rs.getString("direccion_usuario");
                String telefono_usuario = rs.getString("telefono_usuario");
                String correo_usuario = rs.getString("correo_usuario");
                String contraseña_usuario = rs.getString("contraseña_usuario");
                String tipo_usuario = rs.getString("tipo_usuario");
                Timestamp created_at = rs.getTimestamp("created_at");
                
                users.add(new User(rs.getInt(columnaId),rs.getString(columnaCorreo)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
