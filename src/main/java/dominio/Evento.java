package dominio;

import java.sql.Date;
import java.sql.Time;

/**
 * @author angel
 **/
public class Evento {
    
    private int id;
    private String nombre;
    private String tipo_evento;
    private String lugar_evento;
    private Date fecha_evento;
    private Time hora_evento;
    private int entradas;
    private int entradas_vendidas;

    public Evento(int nId, String nNombre, String nTipo_evento, String nLugar_evento,
            Date nFecha_evento, Time nHora_evento, int nEntradas, int nEntradas_vendidas){
        this.id = nId;
        this.nombre = nNombre;
        this.tipo_evento = nTipo_evento;
        this.lugar_evento = nLugar_evento;
        this.fecha_evento = nFecha_evento;
        this.hora_evento = nHora_evento;
        this.entradas = nEntradas;
        this.entradas_vendidas = nEntradas_vendidas;
    }
    
    public Evento(String nNombre, String nTipo_evento, String nLugar_evento,
            Date nFecha_evento, Time nHora_evento, int nEntradas, int nEntradas_vendidas){
        this.nombre = nNombre;
        this.tipo_evento = nTipo_evento;
        this.lugar_evento = nLugar_evento;
        this.fecha_evento = nFecha_evento;
        this.hora_evento = nHora_evento;
        this.entradas = nEntradas;
        this.entradas_vendidas = nEntradas_vendidas;
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

    public Time getHora_evento() {
        return hora_evento;
    }

    public void setHora_evento(Time hora_evento) {
        this.hora_evento = hora_evento;
    }
    
    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
    
    public int getEntradas_vendidas() {
        return entradas_vendidas;
    }

    public void setEntradas_vendidas(int entradas_vendidas) {
        this.entradas_vendidas = entradas_vendidas;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}