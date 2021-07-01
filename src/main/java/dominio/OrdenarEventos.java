package dominio;

import java.util.ArrayList;

/**
 * @author angel
 **/
public class OrdenarEventos {
    private ArrayList<Evento> a;
    
    public OrdenarEventos(ArrayList<Evento> a){
        this.a = a;
    }
    
    public ArrayList<Evento> sort(String tipo, String forma){
        return this.a = mergeSort(a, tipo, forma);
    }
    
    private ArrayList<Evento> mergeSort(ArrayList<Evento> a, String tipo, String forma){
        ArrayList<Evento> izq = new ArrayList();
        ArrayList<Evento> dch = new ArrayList();
        int m;
        
        if(a.size() == 1){
            return a;
        }else{
            m = a.size()/2;
            for(int i = 0 ; i < m ; i++){
                izq.add(a.get(i));
            }
            for(int i = m ; i < a.size() ; i++){
                dch.add(a.get(i));
            }
            
            izq = mergeSort(izq,tipo,forma);
            dch = mergeSort(dch,tipo,forma);
            
            switch (tipo) {
                case "ID":
                    mergeId(izq,dch,a,forma);
                    break;
                case "Nombre":
                    mergeNombre(izq,dch,a,forma);
                    break;
                case "Apellidos":
                    //mergeApellidos(izq,dch,a,forma);
                    break;
                default:
                    break;
            }            
        }
        return a;
    }
    
    private void mergeId(ArrayList<Evento> izq, ArrayList<Evento> dch, ArrayList<Evento> a, String forma){
        int izqI = 0;
        int dchI = 0;
        int aI = 0;        
        if(forma.equals("Ascendente")){
            while(izqI < izq.size() && dchI < dch.size()){
                if(izq.get(izqI).getId() < dch.get(dchI).getId()){
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
                if(izq.get(izqI).getId() > dch.get(dchI).getId()){
                    a.set(aI, izq.get(izqI));
                    izqI++;
                }else{
                    a.set(aI, dch.get(dchI));
                    dchI++;
                }
                aI++;
            }
        }
        
       
        ArrayList<Evento> resto;
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
    
    private void mergeNombre(ArrayList<Evento> izq, ArrayList<Evento> dch, ArrayList<Evento> a, String forma){
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
        
       
       ArrayList<Evento> resto;
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
