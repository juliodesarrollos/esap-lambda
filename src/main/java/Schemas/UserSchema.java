package Schemas;

import java.sql.Timestamp;

public class User {
    private int id_usuario;
    private int id_empresa;
    private String nombre_usuario;
    private String direccion_usuario;
    private String telefono_usuario;
    private String correo_usuario;
    private String contraseña_usuario;
    private String tipo_usuario;
    private Timestamp created_at;
    private int created_by;

    public User(int id_usuario, int id_empresa, String nombre_usuario, String direccion_usuario, String telefono_usuario, String correo_usuario, String contraseña_usuario, String tipo_usuario, Timestamp created_at, int created_by) {
        this.id_usuario = id_usuario;
        this.id_empresa = id_empresa;
        this.nombre_usuario = nombre_usuario;
        this.direccion_usuario = direccion_usuario;
        this.telefono_usuario = telefono_usuario;
        this.correo_usuario = correo_usuario;
        this.contraseña_usuario = contraseña_usuario;
        this.tipo_usuario = tipo_usuario;
        this.created_at = created_at;
        this.created_by = created_by;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getDireccion_usuario() {
        return direccion_usuario;
    }

    public void setDireccion_usuario(String direccion_usuario) {
        this.direccion_usuario = direccion_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setContraseña_usuario(String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }
}
