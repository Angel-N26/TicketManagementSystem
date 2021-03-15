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

    public ArrayList<Entrada> obtenerEntradasDAO(String nombreAsoc){
       ArrayList listaEntradas = new ArrayList<Entrada>();
        ResultSet rs;
	try {
            String sql = "select * from entradas where nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombreAsoc);
            rs = pst.executeQuery();
            while(rs.next()) {
                Entrada entrada = new Entrada(rs.getInt(1), rs.getString(2), rs.getInt(3), nombreAsoc);
                listaEntradas.add(entrada);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEntradas;
    }        
    
    public ArrayList<Entrada> obtenerEntradasEventoDAO(int idevento, String nombreAsoc){
        ArrayList<Entrada> listaEntradas = new ArrayList();
        ResultSet rs;
	try {
            String sql = "select * from entradas where idevento = ? AND nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idevento);
            pst.setString(2, nombreAsoc);
            rs = pst.executeQuery();
            while(rs.next()) {
                Entrada entrada = new Entrada(rs.getInt(1), rs.getString(2), rs.getInt(3), nombreAsoc);
                listaEntradas.add(entrada);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEntradas;
    }       
    
    public Entrada obtenerEntradaDAO(int idevento, String idsocio, String nombreAsoc){
        ResultSet rs;
        Entrada entrada = null;
        try {
            String sql = "select * from entradas where idevento = ? AND idsocio = ? AND nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idevento);
            pst.setString(2, idsocio);
            pst.setString(3, nombreAsoc);
            rs = pst.executeQuery();
            while (rs.next()) {
                entrada = new Entrada(rs.getInt(1),
                        rs.getString(2), rs.getInt(3), nombreAsoc);
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
            String sql = "insert into entradas(idevento, idsocio, nombreAsoc)"
                    + "values(?,?,?)";
            pst = con.prepareStatement(sql);           
            pst.setInt(1, entrada.getIdEvento());
            pst.setString(2, entrada.getIdSocio());
            pst.setString(3, entrada.getNombreAsoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }    
    
    public boolean eliminarEntradaDAO(int id, String nombreAsoc){
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from entradas where identradas = ? AND nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, nombreAsoc);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}