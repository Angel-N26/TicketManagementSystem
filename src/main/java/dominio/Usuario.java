package dominio;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * @author angel
 **/
public class Usuario {
    
    private String usuario;
    private String contrasena;
    private Date ultimaConexion;
    private int idAsociacion;
    
    public Usuario(String usuario, String contrasena, int idAsociacion){
        this.usuario = usuario;
        this.contrasena = contrasena;//hash(contrasena);
        this.idAsociacion = idAsociacion;
    }
    
    public Usuario(String usuario, String contrasena, Date ultimaConexion, int idAsociacion){
        this.usuario = usuario;
        this.contrasena = contrasena;//hash(contrasena);
        this.ultimaConexion = ultimaConexion;
        this.idAsociacion = idAsociacion;
    }
    
    public Usuario(){
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }
    
    public int getIdAsociacion() {
        return idAsociacion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public void setIdAsociacion(int idAsociacion) {
        this.idAsociacion = idAsociacion;
    }

    public String hash(String pass){
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
            
        String passEncoded = "";
        
        try {
            KeySpec spec = new PBEKeySpec(pass.toCharArray(), salt, 65536, 128);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hash = factory.generateSecret(spec).getEncoded();
            passEncoded = new String(hash);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return passEncoded;
    }
    
    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", nombreAsociacion=" + idAsociacion + '}';
    }      
}