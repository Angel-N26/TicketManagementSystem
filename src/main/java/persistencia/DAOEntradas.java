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
        Entrada entrada;
	try {
            String sql = "select identradas from entradas";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                entrada = obtenerEntradaDAO(rs.getInt(1));
                listaEntradas.add(entrada);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEntradas;
    }
    
    public Entrada obtenerEntradaDAO(int id){
        ResultSet rs;
        Entrada entrada = null;
        try {
            String sql = "select * from entradas where identradas = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                entrada = new Entrada(rs.getInt(1), rs.getInt(2),
                        rs.getString(3));
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
    
    public boolean modificarEntradaDAO(Entrada entrada){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update entradas set idevento = ?, idsocio = ? "
                    + "where identradas = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, entrada.getId_evento());
            pst.setString(2, entrada.getId_socio());
            pst.setInt(3, entrada.getId_entrada());
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