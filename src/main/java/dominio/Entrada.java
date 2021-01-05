package dominio;

/**
 *
 * @author angel
 */
public class Entrada {
    private int id_entrada;
    private int id_evento;
    private String id_socio;
    
    public Entrada(int nId_entrada, int nId_evento, String nId_socio){
        this.id_entrada = nId_entrada;
        this.id_evento = nId_evento;
        this.id_socio = nId_socio;
    }

    public int getId_entrada() {
        return id_entrada;
    }
    
    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public int getId_evento() {
        return id_evento;
    }    
    
    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getId_socio() {
        return id_socio;
    }    
    
    public void setId_socio(String id_socio) {
        this.id_socio = id_socio;
    }
    
    @Override
    public String toString(){
        return this.id_entrada + "";
    }
}
