package dominio;

/**
 * @author angel
 **/
public class Cargo {
    
    private String nombre;
    private String idSocio;
    private int idAsoc;
    
    public Cargo(String nombre, String idSocio, int idAsoc){
        this.nombre = nombre;
        this.idSocio = idSocio;
        this.idAsoc = idAsoc;
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

    public int getIdAsoc() {
        return idAsoc;
    }

    public void setIdAsoc(int idAsoc) {
        this.idAsoc = idAsoc;
    }
     
    @Override
    public String toString() {
        return "JuntaDirectiva{" + "cargo=" + nombre + ", idSocio=" + idSocio + '}';
    }
}