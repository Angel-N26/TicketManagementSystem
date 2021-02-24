package dominio;

import java.sql.Date;
import java.sql.Time;

/**
 * @author angel
 **/
public class Evento {
    
    private int id;
    private String nombre;
    private String tipo;
    private String sala;
    private String direccion;
    private Date fecha;
    private Time hora;
    private int entradas;
    private int entradasVendidas;
    private String rutaImg;

    public Evento(int nId, String nNombre, String nTipo, String nSala,
            String nDireccion, Date nFecha, Time nHora, int nEntradas,
            int nEntradasVendidas, String nRutaImg){
        this.id = nId;
        this.nombre = nNombre;
        this.tipo = nTipo;
        this.sala = nSala;
        this.direccion = nDireccion;
        this.fecha = nFecha;
        this.hora = nHora;
        this.entradas = nEntradas;
        this.entradasVendidas = nEntradasVendidas;
        this.rutaImg = nRutaImg;
    }
    
    public Evento(String nNombre, String nTipo, String nSala, String nDireccion,
            Date nFecha, Time nHora, int nEntradas, int nEntradasVendidas, String nRutaImg){
        this.nombre = nNombre;
        this.tipo = nTipo;
        this.sala = nSala;
        this.direccion = nDireccion;
        this.fecha = nFecha;
        this.hora = nHora;
        this.entradas = nEntradas;
        this.entradasVendidas = nEntradasVendidas;
        this.rutaImg = nRutaImg;
    }

    public Evento() {
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

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
    
    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    public String getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}