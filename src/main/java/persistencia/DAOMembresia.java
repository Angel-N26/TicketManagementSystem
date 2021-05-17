package persistencia;

import dominio.Membresia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author angel
 **/
public class DAOMembresia {

    private final Connection con;
    private PreparedStatement pst;

    public DAOMembresia(Connection con) {
        this.con = con;
    }

    public ArrayList<Membresia> obtenerMembresiasDAO(int idAsoc){
       ArrayList listaMembresias = new ArrayList<Membresia>();
        ResultSet rs;
        Membresia membresia;
	try {
            String sql = "select idmembresia from membresia where idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idAsoc);
            rs = pst.executeQuery();
            while(rs.next()) {
                membresia = obtenerMembresiaDAO(rs.getInt(1), idAsoc);
                listaMembresias.add(membresia);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaMembresias;
    }    
        
    public Membresia obtenerMembresiaDAO(int idMembresia, int idAsoc){
        ResultSet rs;
        Membresia membresia = null;
        try {
            String sql = "select * from membresia where idmembresia = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idMembresia);
            pst.setInt(2, idAsoc);
            rs = pst.executeQuery();
            while (rs.next()) {
                membresia = new Membresia(rs.getInt(1), rs.getString(2),
                        rs.getDouble(3), rs.getInt(4));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return membresia;
    }
    
    public boolean insertarMembresiaDAO(Membresia membresia){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "insert into membresia(nombre, precio, idAsoc)"
                    + "values(?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, membresia.getNombre());
            pst.setDouble(2, membresia.getPrecio());
            pst.setInt(3, membresia.getIdAsoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean modificarMembresiaDAO(Membresia membresia){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update membresia set nombre = ?, precio = ? "
                    + "where idmembresia = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, membresia.getNombre());
            pst.setDouble(2, membresia.getPrecio());
            pst.setInt(3, membresia.getId_membresia());
            pst.setInt(4, membresia.getIdAsoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean eliminarMembresiaDAO(int id_membresia, int idAsoc){
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from membresia where idmembresia = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id_membresia);
            pst.setInt(2, idAsoc);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}