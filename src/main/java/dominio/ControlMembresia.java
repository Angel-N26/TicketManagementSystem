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

    public ArrayList<Membresia> obtenerMembresias(String nombreAsoc) {
	return daoMembresia.obtenerMembresiasDAO(nombreAsoc);
    }

    public Membresia obtenerMembresia(int id, String nombreAsoc) {
        return daoMembresia.obtenerMembresiaDAO(id, nombreAsoc);
    }
    
    public boolean insertarMembresia(Membresia membresia) {
        return daoMembresia.insertarMembresiaDAO(membresia);
    }

    public boolean modificarMembresia(Membresia membresia){
        return daoMembresia.modificarMembresiaDAO(membresia);
    }

    public boolean eliminarMembresia(int id){
        return daoMembresia.eliminarMembresiaDAO(id);
    }
}