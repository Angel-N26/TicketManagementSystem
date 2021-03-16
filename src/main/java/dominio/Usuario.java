package dominio;

/**
 * @author angel
 **/
public class Usuario {
    
    private String usuario;
    private String contrasena;
    private int idAsociacion;
    
    public Usuario(String usuario, String contrasena, int idAsociacion){
        this.usuario = usuario;
        this.contrasena = contrasena;
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
    
    public int getIdAsociacion() {
        return idAsociacion;
    }

    public void setIdAsociacion(int idAsociacion) {
        this.idAsociacion = idAsociacion;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", nombreAsociacion=" + idAsociacion + '}';
    }      
}