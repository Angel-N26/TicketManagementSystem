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

    public ArrayList<Entrada> obtenerEntradas() {
	return daoEntradas.obtenerEntradasDAO();
    }
    
    public ArrayList<Entrada> obtenerEntradasEvento(int idevento) {
	return daoEntradas.obtenerEntradasEventoDAO(idevento);
    }

    public Entrada obtenerEntrada(int identrada, String idsocio) {
        return daoEntradas.obtenerEntradaDAO(identrada, idsocio);
    }

    public boolean insertarEntrada(Entrada entrada) {
        return daoEntradas.insertarEntradaDAO(entrada);
    }

    public boolean eliminarEntrada(int id_entrada){
        return daoEntradas.eliminarEntradaDAO(id_entrada);
    }
}