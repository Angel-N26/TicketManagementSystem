package dominio;

/**
 * @author angel
 **/
public class Cargo {
    
    private String nombre;
    private String idSocio;
    private String nombreAsoc;
    
    public Cargo(String nombre, String idSocio, String nombreAsoc){
        this.nombre = nombre;
        this.idSocio = idSocio;
        this.nombreAsoc = nombreAsoc;
    }

    public Cargo() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdSocio() {
        return idSocio;
    }
    
    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombreAsoc() {
        return nombreAsoc;
    }

    public void setNombreAsoc(String nombreAsoc) {
        this.nombreAsoc = nombreAsoc;
    }
     
    @Override
    public String toString() {
        return "JuntaDirectiva{" + "cargo=" + nombre + ", idSocio=" + idSocio + '}';
    }
}