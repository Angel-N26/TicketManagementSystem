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

    public DAOMembresia() {
        con = Agente.getConexion();
    }

    public ArrayList<Membresia> obtenerMembresiasDAO(String nombreAsociacion){
       ArrayList listaMembresias = new ArrayList<Membresia>();
        ResultSet rs;
        Membresia membresia;
	try {
            String sql = "select idmembresia from membresia where nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombreAsociacion);
            rs = pst.executeQuery();
            while(rs.next()) {
                membresia = obtenerMembresiaDAO(rs.getInt(1), nombreAsociacion);
                listaMembresias.add(membresia);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaMembresias;
    }    
        
    public Membresia obtenerMembresiaDAO(int idMembresia, String nombreAsociacion){
        ResultSet rs;
        Membresia membresia = null;
        try {
            String sql = "select * from membresia where idmembresia = ? AND nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idMembresia);
            pst.setString(2, nombreAsociacion);
            rs = pst.executeQuery();
            while (rs.next()) {
                membresia = new Membresia(rs.getInt(1), rs.getString(2),
                        rs.getDouble(3), rs.getString(4));
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
            String sql = "insert into membresia(nombre, precio, nombreAsoc)"
                    + "values(?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, membresia.getNombre());
            pst.setDouble(2, membresia.getPrecio());
            pst.setString(3, membresia.getNombreAsoc());
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
                    + "where idmembresia = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, membresia.getNombre());
            pst.setDouble(2, membresia.getPrecio());
            pst.setInt(3, membresia.getId_membresia());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean eliminarMembresiaDAO(int id_membresia){
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from membresia where idmembresia = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id_membresia);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}