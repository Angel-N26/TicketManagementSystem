package dominio;

import java.util.ArrayList;

/**
 * @author angel
 **/
public class OrdenarSocios {
    private ArrayList<Socio> a;
    
    public OrdenarSocios(ArrayList<Socio> a){
        this.a = a;
    }
    
    public ArrayList<Socio> sort(String tipo, String forma){
        return this.a = mergeSort(a, tipo, forma);
    }
    
    private ArrayList<Socio> mergeSort(ArrayList<Socio> a, String tipo, String forma){
        ArrayList<Socio> izq = new ArrayList();
        ArrayList<Socio> dch = new ArrayList();
        int m;
        
        if(a.size() == 1){
            return a;
        }else{
            m = a.size()/2;
            
            izq = new ArrayList<Socio> (a.subList(0, m));
            dch = new ArrayList<Socio> (a.subList(m, a.size()));
            
            izq = mergeSort(izq,tipo,forma);
            dch = mergeSort(dch,tipo,forma);
            
            switch (tipo) {
                case "DNI":
                    mergeDNI(izq,dch,a,forma);
                    break;
                case "Nombre":
                    mergeNombre(izq,dch,a,forma);
                    break;
                case "Apellidos":
                    mergeApellidos(izq,dch,a,forma);
                    break;
                default:
                    break;
            }            
        }
        return a;
    }
    
    private void mergeDNI(ArrayList<Socio> izq, ArrayList<Socio> dch, ArrayList<Socio> a, String forma){
        int izqI = 0;
        int dchI = 0;
        int aI = 0;        
        if(forma.equals("Ascendente")){
            while(izqI < izq.size() && dchI < dch.size()){
                if(izq.get(izqI).getDni().compareTo(dch.get(dchI).getDni()) < 0){
                    a.set(aI, izq.get(izqI));
                    izqI++;
                }else{
                    a.set(aI, dch.get(dchI));
                    dchI++;
                }
                aI++;
            }        
        }else{
            while(izqI < izq.size() && dchI < dch.size()){
                if(izq.get(izqI).getDni().compareTo(dch.get(dchI).getDni()) > 0){
                    a.set(aI, izq.get(izqI));
                    izqI++;
                }else{
                    a.set(aI, dch.get(dchI));
                    dchI++;
                }
                aI++;
            }
        }
        
       
       ArrayList<Socio> resto;
       int restoI;
       if(izqI >= izq.size()){
           resto = dch;
           restoI = dchI;
       }else{
           resto = izq;
           restoI = izqI;
       }
       
       for(int i = restoI ; i < resto.size() ; i++){
           a.set(aI, resto.get(i));
           aI++;
       }
    }
    
    private void mergeNombre(ArrayList<Socio> izq, ArrayList<Socio> dch, ArrayList<Socio> a, String forma){
        int izqI = 0;
        int dchI = 0;
        int aI = 0;        
        if(forma.equals("Ascendente")){
            while(izqI < izq.size() && dchI < dch.size()){
                if(izq.get(izqI).getNombre().compareTo(dch.get(dchI).getNombre()) < 0){
                    a.set(aI, izq.get(izqI));
                    izqI++;
                }else{
                    a.set(aI, dch.get(dchI));
                    dchI++;
                }
                aI++;
            }        
        }else{
            while(izqI < izq.size() && dchI < dch.size()){
                if(izq.get(izqI).getNombre().compareTo(dch.get(dchI).getNombre()) > 0){
                    a.set(aI, izq.get(izqI));
                    izqI++;
                }else{
                    a.set(aI, dch.get(dchI));
                    dchI++;
                }
                aI++;
            }
        }
        
       
       ArrayList<Socio> resto;
       int restoI;
       if(izqI >= izq.size()){
           resto = dch;
           restoI = dchI;
       }else{
           resto = izq;
           restoI = izqI;
       }
       
       for(int i = restoI ; i < resto.size() ; i++){
           a.set(aI, resto.get(i));
           aI++;
       }
    }
    
    private void mergeApellidos(ArrayList<Socio> izq, ArrayList<Socio> dch, ArrayList<Socio> a, String forma){
        int izqI = 0;
        int dchI = 0;
        int aI = 0;        
        if(forma.equals("Ascendente")){
            while(izqI < izq.size() && dchI < dch.size()){
                if(izq.get(izqI).getApellidos().compareTo(dch.get(dchI).getApellidos()) < 0){
                    a.set(aI, izq.get(izqI));
                    izqI++;
                }else{
                    a.set(aI, dch.get(dchI));
                    dchI++;
                }
                aI++;
            }        
        }else{
            while(izqI < izq.size() && dchI < dch.size()){
                if(izq.get(izqI).getApellidos().compareTo(dch.get(dchI).getApellidos()) > 0){
                    a.set(aI, izq.get(izqI));
                    izqI++;
                }else{
                    a.set(aI, dch.get(dchI));
                    dchI++;
                }
                aI++;
            }
        }
        
       
       ArrayList<Socio> resto;
       int restoI;
       if(izqI >= izq.size()){
           resto = dch;
           restoI = dchI;
       }else{
           resto = izq;
           restoI = izqI;
       }
       
       for(int i = restoI ; i < resto.size() ; i++){
           a.set(aI, resto.get(i));
           aI++;
       }
    }
}
