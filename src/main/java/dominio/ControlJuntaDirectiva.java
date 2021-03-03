package dominio;

import java.util.ArrayList;
import persistencia.DAOJuntaDirectiva;

/**
 * @author angel
 **/
public class ControlJuntaDirectiva {
    
    private final DAOJuntaDirectiva daoJuntaDirectiva;

    public ControlJuntaDirectiva(){
        this.daoJuntaDirectiva = new DAOJuntaDirectiva();
    }

    public ArrayList<Cargo> obtenerCargos(String nombreAsoc) {
	return daoJuntaDirectiva.obtenerCargosDAO(nombreAsoc);
    }

    public Cargo obtenerCargo(String nombre, String nombreAsoc) {
        return daoJuntaDirectiva.obtenerCargoDAO(nombre, nombreAsoc);
    }
    
    public boolean insertarCargo(Cargo cargo){
        return daoJuntaDirectiva.insertarCargoDAO(cargo);
    }

    public boolean modificarCargo(Cargo cargo){
        return daoJuntaDirectiva.modificarCargoDAO(cargo);
    }
}