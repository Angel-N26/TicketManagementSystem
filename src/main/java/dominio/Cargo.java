package dominio;

/**
 * @author angel
 **/
public class Cargo {
    
    private String nombre;
    private String idSocio;
    
    public Cargo(String nNombre, String nIdSocio){
        this.nombre = nNombre;
        this.idSocio = nIdSocio;
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
     
    @Override
    public String toString() {
        return "JuntaDirectiva{" + "cargo=" + nombre + ", idSocio=" + idSocio + '}';
    }
}