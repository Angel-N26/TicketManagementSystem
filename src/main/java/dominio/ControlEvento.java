package dominio;

import java.sql.Connection;
import persistencia.DAOEvento;
import java.util.ArrayList;

/**
 * @author angel
 **/
public class ControlEvento {
    
    private final DAOEvento daoEvento;

    public ControlEvento(Connection con) {
        this.daoEvento = new DAOEvento(con);
    }

    public ArrayList<Evento> obtenerEventos(int idAsoc) {
	return daoEvento.obtenerEventosDAO(idAsoc);
    }

    public Evento obtenerEvento(int id, int idAsoc) {
        return daoEvento.obtenerEventoDAO(id, idAsoc);
    }

    public boolean insertarEvento(Evento evento) {
        return daoEvento.insertarEventoDAO(evento);
    }

    public boolean modificarEvento(Evento evento){
        return daoEvento.modificarEventoDAO(evento);
    }

    public boolean eliminarEvento(int id, int idAsoc){
        return daoEvento.eliminarEventoDAO(id, idAsoc);
    }
}