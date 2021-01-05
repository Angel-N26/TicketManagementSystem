package dominio;

import persistencia.DAOEvento;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class ControlEvento {
    private final DAOEvento daoEvento;

    public ControlEvento() {
        this.daoEvento = new DAOEvento();
    }

    public ArrayList<Evento> obtenerEventos() {
	return daoEvento.obtenerEventosDAO();
    }

    public Evento obtenerEvento(int id) {
        return daoEvento.obtenerEventoDAO(id);
    }

    public boolean insertarEvento(Evento evento) {
        return daoEvento.insertarEventoDAO(evento);
    }

    public boolean modificarEvento(Evento evento){
        return daoEvento.modificarEventoDAO(evento);
    }

    public boolean eliminarEvento(int id){
        return daoEvento.eliminarEventoDAO(id);
    }
}