package dominio;

/**
 * @author angel
 **/
public class Entrada {
        
    private int id_evento;
    private String id_socio;
    private int num_entrada;
    
    public Entrada(int id_evento, String id_socio){      
        this.id_evento = id_evento;
        this.id_socio = id_socio;
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
    
    public int getNum_entrada() {
        return num_entrada;
    }
    
    @Override
    public String toString(){
        return this.num_entrada + "";
    }
}