package dominio;

import persistencia.DAOAsociacion;

/**
 * @author angel
 **/
public class ControlAsociacion {
    private final DAOAsociacion daoAsociacion;

    public ControlAsociacion() {
        this.daoAsociacion = new DAOAsociacion();
    }    

    public Asociacion obtenerAsociacion(String cif) {
        return daoAsociacion.obtenerAsociacionDAO(cif);
    }

    /*public boolean insertarAsociacion(Asociacion asociacion) {
        return daoAsociacion.insertarAsociacionDAO(asociacion);
    }*/

    public boolean modificarAsociacion(Asociacion asociacion, String CIF){
        return daoAsociacion.modificarAsociacionDAO(asociacion, CIF);
    }
}