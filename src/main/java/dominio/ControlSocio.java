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

    public ArrayList<Socio> obtenerSocios(String nombreAsoc) {
	return daoSocio.obtenerSociosDAO(nombreAsoc);
    }

    public Socio obtenerSocio(String dni, String nombreAsoc) {
        return daoSocio.obtenerSocioDAO(dni, nombreAsoc);
    }

    public boolean insertarSocio(Socio socio) {
        return daoSocio.insertarSocioDAO(socio);
    }

    public boolean modificarSocio(Socio socio, String dni, String nombreAsoc){
        return daoSocio.modificarSocioDAO(socio, dni, nombreAsoc);
    }

    public boolean eliminarSocio(String dni){
        return daoSocio.eliminarSocioDAO(dni);
    }
}