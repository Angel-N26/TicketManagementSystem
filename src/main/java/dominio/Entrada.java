package dominio;

/**
 * @author angel
 **/
public class Entrada {
        
    private int idEvento;
    private String idSocio;
    private int numEntrada;
    private String nombreAsoc;
    
    public Entrada(int idEvento, String idSocio, String nombreAsoc){      
        this.idEvento = idEvento;
        this.idSocio = idSocio;
        this.nombreAsoc = nombreAsoc;
    }
    
    public Entrada(int idEvento, String idSocio, int numEntrada, String nombreAsoc){      
        this.idEvento = idEvento;
        this.idSocio = idSocio;
        this.numEntrada = numEntrada;
        this.nombreAsoc = nombreAsoc;
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

    public String getNombreAsoc() {
        return nombreAsoc;
    }

    public void setNombreAsoc(String nombreAsoc) {
        this.nombreAsoc = nombreAsoc;
    }
    
    @Override
    public String toString(){
        return this.idEvento + " - " + this.idSocio;
    }
}