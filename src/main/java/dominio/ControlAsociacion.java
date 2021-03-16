package dominio;

import java.util.ArrayList;
import persistencia.DAOAsociacion;

/**
 * @author angel
 **/
public class ControlAsociacion {
    
    private final DAOAsociacion daoAsociacion;

    public ControlAsociacion() {
        this.daoAsociacion = new DAOAsociacion();
    }    

    public ArrayList<Asociacion> obtenerAsociaciones() {
        return daoAsociacion.obtenerAsociacionesDAO();
    }
    
    public Asociacion obtenerAsociacion(int idAsoc) {
        return daoAsociacion.obtenerAsociacionDAO(idAsoc);
    }
    
    public Asociacion obtenerAsociacionNombre(String nombre) {
        return daoAsociacion.obtenerAsociacionNombreDAO(nombre);
    }

    public boolean insertarAsociacion(String nombre) {
        return daoAsociacion.insertarAsociacionDAO(nombre);
    }

    public boolean modificarAsociacion(Asociacion asociacion, int idAsoc){
        return daoAsociacion.modificarAsociacionDAO(asociacion, idAsoc);
    }
}