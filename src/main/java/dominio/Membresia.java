package dominio;

import java.io.Serializable;

/**
 * @author angel
 **/
public class Membresia{
    private int id_membresia;
    private String nombre;
    private double precio;
    
    public Membresia(int nId_membresia, String nNombre, double nPrecio){
        this.id_membresia = nId_membresia;
        this.nombre = nNombre;
        this.precio = nPrecio;
    }
    
    public Membresia(String nNombre, double nPrecio){     
        this.nombre = nNombre;
        this.precio = nPrecio;
    }
    
    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
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
    
    @Override
    public String toString() {
        return "Membresia{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
}
