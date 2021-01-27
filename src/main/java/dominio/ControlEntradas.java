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

    public Entrada obtenerEntrada(int id_entrada) {
        return daoEntradas.obtenerEntradaDAO(id_entrada);
    }

    public boolean insertarEntrada(Entrada entrada) {
        return daoEntradas.insertarEntradaDAO(entrada);
    }

    public boolean modificarEntrada(Entrada entrada){
        return daoEntradas.modificarEntradaDAO(entrada);
    }

    public boolean eliminarEntrada(int id_entrada){
        return daoEntradas.eliminarEntradaDAO(id_entrada);
    }
}