package dominio;

/**
 * @author angel
 **/
public class Membresia{
    
    private int id_membresia;
    private String nombre;
    private double precio;
    private int idAsoc;
    
    public Membresia(int id_membresia, String nombre, double precio, int idAsoc){
        this.id_membresia = id_membresia;
        this.nombre = nombre;
        this.precio = precio;
        this.idAsoc = idAsoc;
    }
    
    public Membresia(String nNombre, double nPrecio, int idAsoc){
        this.nombre = nNombre;
        this.precio = nPrecio;
        this.idAsoc = idAsoc;
    }
    
    public int getId_membresia() {
        return id_membresia;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getIdAsoc() {
        return idAsoc;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}