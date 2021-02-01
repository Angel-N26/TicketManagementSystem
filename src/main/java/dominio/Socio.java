package dominio;

import java.sql.Date;

/**
 * @author angel
 **/
public class Socio {

    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private Date fecha_nac;
    private String domicilio;
    private int telefono;
    private int id_membresia;
    private boolean pagado;
    
    public Socio(String nDni, String nNombre, String nApellidos, String nEmail, Date nFecha_nac, 
           String nDomicilio, int nTelefono, int nId_membresia, boolean nPagado){                
        this.dni = nDni;
        this.nombre = nNombre;
        this.apellidos = nApellidos;
        this.email = nEmail;
        this.fecha_nac = nFecha_nac;        
        this.domicilio = nDomicilio;
        this.telefono = nTelefono;
        this.id_membresia = nId_membresia;
        this.pagado = nPagado;
    }

    public Socio() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }
    
    public boolean getPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " +  this.apellidos;
    }
}