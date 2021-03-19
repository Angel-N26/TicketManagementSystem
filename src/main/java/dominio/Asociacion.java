package dominio;

import java.sql.Date;

/**
 * @author angel
 **/
public class Asociacion {
    private int id;
    private String nombre;
    private String tipo;
    private Date fecha;
    private int telefono;
    private String email;
    private String direccion;
    private String cif;
    private int nRegistro;
    private String rutaLogo;

    public Asociacion() {
        
    }
    
    public Asociacion(int id, String nombre, String tipo, Date fecha, int telefono,
            String email, String direccion, String cif, int nRegistro, String rutaLogo){        
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.cif = cif;
        this.nRegistro = nRegistro;
        this.rutaLogo = rutaLogo;
    }
    
    public Asociacion(int id, String nombre){        
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCIF() {
        return cif;
    }
    
    public void setCIF(String cif) {
        this.cif = cif;
    }

    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    public String getRutaLogo() {
        return rutaLogo;
    }

    public void setRutaLogo(String rutaLogo) {
        this.rutaLogo = rutaLogo;
    }
    
    @Override
    public String toString() {
        return "Asociacion{" + nombre + '}';
    }        
}