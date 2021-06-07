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

    public DAOEntradas(Connection con) {
        this.con = con;
    }

    public ArrayList<Entrada> obtenerEntradasDAO(int idAsoc){
       ArrayList listaEntradas = new ArrayList<Entrada>();
        ResultSet rs;
	try {
            String sql = "select * from entradas where idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idAsoc);
            rs = pst.executeQuery();
            while(rs.next()) {
                Entrada entrada = new Entrada(rs.getInt(1), rs.getString(2), rs.getInt(3), idAsoc);
                listaEntradas.add(entrada);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEntradas;
    }      
    
    public ArrayList<Entrada> obtenerEntradasEventoDAO(int idevento, int idAsoc){
        ArrayList<Entrada> listaEntradas = new ArrayList();
        ResultSet rs;
	try {
            String sql = "select * from entradas where idevento = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idevento);
            pst.setInt(2, idAsoc);
            rs = pst.executeQuery();
            while(rs.next()) {
                Entrada entrada = new Entrada(rs.getInt(1), rs.getString(2), rs.getInt(3), idAsoc);
                listaEntradas.add(entrada);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEntradas;
    }       
    
    public Entrada obtenerEntradaDAO(int idevento, String idsocio, int idAsoc){
        ResultSet rs;
        Entrada entrada = null;
        try {
            String sql = "select * from entradas where idevento = ? AND idsocio = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idevento);
            pst.setString(2, idsocio);
            pst.setInt(3, idAsoc);
            rs = pst.executeQuery();
            while (rs.next()) {
                entrada = new Entrada(rs.getInt(1),
                        rs.getString(2), rs.getInt(3), idAsoc);
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
            String sql = "insert into entradas(idevento, idsocio, idAsoc, leida)"
                    + "values(?,?,?,?)";
            pst = con.prepareStatement(sql);           
            pst.setInt(1, entrada.getIdEvento());
            pst.setString(2, entrada.getIdSocio());
            pst.setInt(3, entrada.getIdAsoc());
            pst.setBoolean(4, false);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }    
    
    public boolean eliminarEntradaDAO(int id, int idAsoc){
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from entradas where numEntrada = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setInt(2, idAsoc);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}