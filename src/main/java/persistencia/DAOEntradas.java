package persistencia;

import dominio.Entrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author angel
 **/
public class DAOEntradas {

    private final Connection con;
    private PreparedStatement pst;

    public DAOEntradas() {
        con = Agente.getConexion();
    }

    public ArrayList<Entrada> obtenerEntradasDAO(){
       ArrayList listaEntradas = new ArrayList<Entrada>();
        ResultSet rs;
	try {
            String sql = "select * from entradas";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                Entrada entrada = new Entrada(rs.getInt(1), rs.getString(2), rs.getInt(3));
                listaEntradas.add(entrada);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEntradas;
    }        
    
    public ArrayList<Entrada> obtenerEntradasEventoDAO(int idevento){
        ArrayList<Entrada> listaEntradas = new ArrayList();
        ResultSet rs;
	try {
            String sql = "select * from entradas where idevento = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idevento);
            rs = pst.executeQuery();
            while(rs.next()) {
                Entrada entrada = new Entrada(rs.getInt(1), rs.getString(2), rs.getInt(3));
                listaEntradas.add(entrada);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEntradas;
    }       
    
    public Entrada obtenerEntradaDAO(int idevento, String idsocio){
        ResultSet rs;
        Entrada entrada = null;
        try {
            String sql = "select * from entradas where idevento = ? AND idsocio = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idevento);
            pst.setString(2, idsocio);
            rs = pst.executeQuery();
            while (rs.next()) {
                entrada = new Entrada(rs.getInt(1),
                        rs.getString(2), rs.getInt(3));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return entrada;
    }    
    
    public boolean insertarEntradaDAO(Entrada entrada){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "insert into entradas(idevento, idsocio)"
                    + "values(?,?)";
            pst = con.prepareStatement(sql);           
            pst.setInt(1, entrada.getId_evento());
            pst.setString(2, entrada.getId_socio());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }    
    
    public boolean eliminarEntradaDAO(int id){
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from entradas where identradas = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}