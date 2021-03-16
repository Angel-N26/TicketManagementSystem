package dominio;

/**
 * @author angel
 **/
public class Entrada {
        
    private int idEvento;
    private String idSocio;
    private int numEntrada;
    private int idAsoc;
    
    public Entrada(int idEvento, String idSocio, int idAsoc){      
        this.idEvento = idEvento;
        this.idSocio = idSocio;
        this.idAsoc = idAsoc;
    }
    
    public Entrada(int idEvento, String idSocio, int numEntrada, int idAsoc){
        this.idEvento = idEvento;
        this.idSocio = idSocio;
        this.numEntrada = numEntrada;
        this.idAsoc = idAsoc;
    }    

    public int getIdEvento() {
        return idEvento;
    }    
    
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getIdSocio() {
        return idSocio;
    }    
    
    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
    }
    
    public int getNumEntrada() {
        return numEntrada;
    }

    public int getIdAsoc() {
        return idAsoc;
    }

    public void setIdAsoc(int idAsoc) {
        this.idAsoc = idAsoc;
    }
    
    @Override
    public String toString(){
        return this.idEvento + " - " + this.idSocio;
    }
}