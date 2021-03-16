package dominio;

import persistencia.DAOSocio;
import java.util.ArrayList;

/**
 * @author angel
 **/
public class ControlSocio {

    private final DAOSocio daoSocio;

    public ControlSocio() {
        this.daoSocio = new DAOSocio();
    }

    public ArrayList<Socio> obtenerSocios(int idAsoc) {
	return daoSocio.obtenerSociosDAO(idAsoc);
    }

    public Socio obtenerSocio(String dni, int idAsoc) {
        return daoSocio.obtenerSocioDAO(dni, idAsoc);
    }

    public boolean insertarSocio(Socio socio) {
        return daoSocio.insertarSocioDAO(socio);
    }

    public boolean modificarSocio(Socio socio, String dni){
        return daoSocio.modificarSocioDAO(socio, dni);
    }

    public boolean eliminarSocio(String dni, int idAsoc){
        return daoSocio.eliminarSocioDAO(dni, idAsoc);
    }
}