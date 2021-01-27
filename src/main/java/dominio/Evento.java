package dominio;

import java.sql.Date;

/**
 * @author angel
 **/
public class Evento {
    private int id;
    private String nombre;
    private String tipo_evento;
    private String lugar_evento;
    private Date fecha_evento;
    private int entradas;

    public Evento(int nId, String nNombre, String nTipo_evento, String nLugar_evento,
            Date nFecha_evento, int nEntradas){
        this.id = nId;
        this.nombre = nNombre;
        this.tipo_evento = nTipo_evento;
        this.lugar_evento = nLugar_evento;
        this.fecha_evento = nFecha_evento;
        this.entradas = nEntradas;
    }
    
    public Evento(String nNombre, String nTipo_evento, String nLugar_evento,
            Date nFecha_evento, int nEntradas){
        this.nombre = nNombre;
        this.tipo_evento = nTipo_evento;
        this.lugar_evento = nLugar_evento;
        this.fecha_evento = nFecha_evento;
        this.entradas = nEntradas;
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

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public String getLugar_evento() {
        return lugar_evento;
    }

    public void setLugar_evento(String lugar_evento) {
        this.lugar_evento = lugar_evento;
    }

    public Date getFecha_evento() {
        return fecha_evento;
    }

    public void setFecha_evento(Date fecha_evento) {
        this.fecha_evento = fecha_evento;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}