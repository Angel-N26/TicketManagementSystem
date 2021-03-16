package dominio;

import persistencia.DAOMembresia;
import java.util.ArrayList;

/**
 * @author angel
 **/
public class ControlMembresia {

    private final DAOMembresia daoMembresia;

    public ControlMembresia() {
        this.daoMembresia = new DAOMembresia();
    }

    public ArrayList<Membresia> obtenerMembresias(int idAsoc) {
	return daoMembresia.obtenerMembresiasDAO(idAsoc);
    }

    public Membresia obtenerMembresia(int id, int idAsoc) {
        return daoMembresia.obtenerMembresiaDAO(id, idAsoc);
    }
    
    public boolean insertarMembresia(Membresia membresia) {
        return daoMembresia.insertarMembresiaDAO(membresia);
    }

    public boolean modificarMembresia(Membresia membresia){
        return daoMembresia.modificarMembresiaDAO(membresia);
    }

    public boolean eliminarMembresia(int id, int idAsoc){
        return daoMembresia.eliminarMembresiaDAO(id, idAsoc);
    }
}