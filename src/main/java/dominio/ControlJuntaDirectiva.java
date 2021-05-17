package dominio;

import java.sql.Connection;
import java.util.ArrayList;
import persistencia.DAOJuntaDirectiva;

/**
 * @author angel
 **/
public class ControlJuntaDirectiva {
    
    private final DAOJuntaDirectiva daoJuntaDirectiva;

    public ControlJuntaDirectiva(Connection con){
        this.daoJuntaDirectiva = new DAOJuntaDirectiva(con);
    }

    public ArrayList<Cargo> obtenerCargos(int idAsoc) {
	return daoJuntaDirectiva.obtenerCargosDAO(idAsoc);
    }

    public Cargo obtenerCargo(String nombre, int idAsoc) {
        return daoJuntaDirectiva.obtenerCargoDAO(nombre, idAsoc);
    }
    
    public boolean insertarCargo(Cargo cargo){
        return daoJuntaDirectiva.insertarCargoDAO(cargo);
    }

    public boolean modificarCargo(Cargo cargo){
        return daoJuntaDirectiva.modificarCargoDAO(cargo);
    }
}