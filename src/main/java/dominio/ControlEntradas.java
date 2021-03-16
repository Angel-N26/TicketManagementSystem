package dominio;

import persistencia.DAOEntradas;
import java.util.ArrayList;

/**
 * @author angel
 **/
public class ControlEntradas {

    private final DAOEntradas daoEntradas;

    public ControlEntradas() {
        this.daoEntradas = new DAOEntradas();
    }

    public ArrayList<Entrada> obtenerEntradas(int idAsoc) {
	return daoEntradas.obtenerEntradasDAO(idAsoc);
    }
    
    public ArrayList<Entrada> obtenerEntradasEvento(int idevento, int idAsoc) {
	return daoEntradas.obtenerEntradasEventoDAO(idevento, idAsoc);
    }

    public Entrada obtenerEntrada(int identrada, String idsocio, int idAsoc) {
        return daoEntradas.obtenerEntradaDAO(identrada, idsocio, idAsoc);
    }

    public boolean insertarEntrada(Entrada entrada) {
        return daoEntradas.insertarEntradaDAO(entrada);
    }

    public boolean eliminarEntrada(int id_entrada, int idAsoc){
        return daoEntradas.eliminarEntradaDAO(id_entrada, idAsoc);
    }
}