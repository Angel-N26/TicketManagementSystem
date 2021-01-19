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

    public ArrayList<Membresia> obtenerMembresias() {
	return daoMembresia.obtenerMembresiasDAO();
    }

    public Membresia obtenerMembresia(String nombre) {
        return daoMembresia.obtenerMembresiaDAO(nombre);
    }

    public boolean insertarMembresia(Membresia membresia) {
        return daoMembresia.insertarMembresiaDAO(membresia);
    }

    public boolean modificarMembresia(Membresia membresia){
        return daoMembresia.modificarMembresiaDAO(membresia);
    }

    public boolean eliminarMembresia(String nombre){
        return daoMembresia.eliminarMembresiaDAO(nombre);
    }
}