package dominio;

/**
 * @author angel
 **/
public class Membresia{
    
    private int id_membresia;
    private String nombre;
    private double precio;
    private String nombreAsoc;
    
    public Membresia(int id_membresia, String nombre, double precio, String nombreAsoc){
        this.id_membresia = id_membresia;
        this.nombre = nombre;
        this.precio = precio;
        this.nombreAsoc = nombreAsoc;
    }
    
    public Membresia(String nNombre, double nPrecio, String nombreAsoc){     
        this.nombre = nNombre;
        this.precio = nPrecio;
        this.nombreAsoc = nombreAsoc;
    }
    
    public int getId_membresia() {
        return id_membresia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreAsoc() {
        return nombreAsoc;
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
    
    @Override
    public String toString() {
        return nombre;
    }
}