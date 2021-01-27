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

    public ArrayList<Cargo> obtenerCargos() {
	return daoJuntaDirectiva.obtenerCargosDAO();
    }

    public Cargo obtenerCargo(String nombre) {
        return daoJuntaDirectiva.obtenerCargoDAO(nombre);
    }

    public boolean modificarCargo(Cargo cargo){
        return daoJuntaDirectiva.modificarCargoDAO(cargo);
    }
}