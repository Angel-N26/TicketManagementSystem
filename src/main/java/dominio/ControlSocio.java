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

    public ArrayList<Socio> obtenerSocios() {
	return daoSocio.obtenerSociosDAO();
    }

    public Socio obtenerSocio(String dni) {
        return daoSocio.obtenerSocioDAO(dni);
    }

    public boolean insertarSocio(Socio socio) {
        return daoSocio.insertarSocioDAO(socio);
    }

    public boolean modificarSocio(Socio socio, String dni){
        return daoSocio.modificarSocioDAO(socio, dni);
    }

    public boolean eliminarSocio(String dni){
        return daoSocio.eliminarSocioDAO(dni);
    }
}