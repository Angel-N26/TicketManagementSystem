package dominio;

/**
 * @author angel
 **/
public class Usuario {
    
    private String usuario;
    private String contraseña;
    private String nombreAsociacion;
    
    public Usuario(String usuario, String contraseña, String nombreAsociacion){
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombreAsociacion = nombreAsociacion;
    }
    
    public Usuario(){
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String getNombreAsociacion() {
        return nombreAsociacion;
    }

    public void setNombreAsociacion(String nombreAsociacion) {
        this.nombreAsociacion = nombreAsociacion;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", nombreAsociacion=" + nombreAsociacion + '}';
    }      
}