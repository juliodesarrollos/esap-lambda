package security;

import org.junit.jupiter.api.Test;

class passwordTest {
    @Test
    void testEncryptatioPWD () {
        Password passwordManager = new Password();
        String password = "Juli0";
        byte[] encryptedPass;
        try {
            encryptedPass = passwordManager.cifrar(password);
            System.out.println("Password: " + password);
            System.out.println("encrypted password: " + encryptedPass);
            System.out.println("Decrypted password: " + passwordManager.descifrar(encryptedPass));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}