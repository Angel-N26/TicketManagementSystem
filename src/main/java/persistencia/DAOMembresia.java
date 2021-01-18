package persistencia;

import dominio.Membresia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class DAOMembresia {

    private final Connection con;
    private PreparedStatement pst;

    public DAOMembresia() {
        con = Agente.getConexion();
    }

    public ArrayList<Membresia> obtenerMembresiasDAO(){
       ArrayList listaMembresias = new ArrayList<Membresia>();
        ResultSet rs;
        Membresia membresia;
	try {
            String sql = "select idmembresia from membresia";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                membresia = obtenerMembresiaDAO(rs.getInt(1));
                listaMembresias.add(membresia);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaMembresias;
    }
    
    public Membresia obtenerMembresiaDAO(int id){
        ResultSet rs;
        Membresia membresia = null;
        try {
            String sql = "select * from membresia where idmembresia = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                membresia = new Membresia(rs.getInt(1), rs.getString(2),
                        rs.getDouble(3));
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
            String sql = "insert into membresia(nombre, precio)"
                    + "values(?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, membresia.getNombre());
            pst.setDouble(2, membresia.getPrecio());
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
    
    public boolean eliminarMembresiaDAO(String nombre){
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from membresia where nombre = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}