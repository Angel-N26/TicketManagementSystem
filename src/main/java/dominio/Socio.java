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
    private Date fechaNac;
    private String domicilio;
    private int telefono;
    private Date fechaIngreso;
    private int idMembresia;
    private boolean pagado;
    private String rutaImg;
    private int idAsoc;
    private boolean inactivo;
    
    public Socio(String dni, String nombre, String apellidos, String email,
            Date fechaNac, String domicilio, int telefono, Date fechaIngreso,
            int idMembresia, boolean pagado, String rutaImg, int idAsoc) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNac = fechaNac;        
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.idMembresia = idMembresia;
        this.pagado = pagado;
        this.rutaImg = rutaImg;
        this.idAsoc = idAsoc;
        this.inactivo = false;
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
    
    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public boolean isPagado() {
        return pagado;
    }    

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }

    public int getIdAsoc() {
        return idAsoc;
    }

    public void setIdAsoc(int idAsoc) {
        this.idAsoc = idAsoc;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " +  this.apellidos;
    }
}