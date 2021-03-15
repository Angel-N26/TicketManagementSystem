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

    public ArrayList<Entrada> obtenerEntradas(String nombreAsoc) {
	return daoEntradas.obtenerEntradasDAO(nombreAsoc);
    }
    
    public ArrayList<Entrada> obtenerEntradasEvento(int idevento, String nombreAsoc) {
	return daoEntradas.obtenerEntradasEventoDAO(idevento, nombreAsoc);
    }

    public Entrada obtenerEntrada(int identrada, String idsocio, String nombreAsoc) {
        return daoEntradas.obtenerEntradaDAO(identrada, idsocio, nombreAsoc);
    }

    public boolean insertarEntrada(Entrada entrada) {
        return daoEntradas.insertarEntradaDAO(entrada);
    }

    public boolean eliminarEntrada(int id_entrada, String nombreAsoc){
        return daoEntradas.eliminarEntradaDAO(id_entrada, nombreAsoc);
    }
}