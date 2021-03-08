package persistencia;

import dominio.Asociacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author angel
 **/
public class DAOAsociacion {
    
    private final Connection con;
    private PreparedStatement pst;

    public DAOAsociacion() {
        con = Agente.getConexion();
    }

     public ArrayList<Asociacion> obtenerAsociacionesDAO(){
       ArrayList<Asociacion> listaEntradas = new ArrayList();
        ResultSet rs;
	try {
            String sql = "select * from asociacion";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                Asociacion asociacion = new Asociacion(rs.getString(1), rs.getString(2),
                    rs.getDate(3), rs.getInt(4), rs.getString(5), rs.getString(6),
                    rs.getString(7),rs.getInt(8), rs.getString(9));
                listaEntradas.add(asociacion);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEntradas;
    }      
    
    public Asociacion obtenerAsociacionDAO(String nombre){
        ResultSet rs;
        Asociacion asociacion = new Asociacion();
        try {
            String sql = "select * from asociacion where nombre = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            rs = pst.executeQuery();
            while (rs.next()) {
                asociacion = new Asociacion(rs.getString(1), rs.getString(2),
                    rs.getDate(3), rs.getInt(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return asociacion;
    }
    
    public boolean insertarAsociacionDAO(String nombre){
        boolean realizado;
        try {
            con.createStatement();
            String sql = "insert into asociacion(nombre) values(?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombre);            
            pst.executeUpdate();
            realizado = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean modificarAsociacionDAO(Asociacion asociacion, String nombre){
        boolean realizado;
        try {
            con.createStatement();
            String sql = "update asociacion set nombre = ?, tipo = ?, fecha = ?,"
                + "telefono = ?, email = ?, direccion = ?, cif = ?,"
                + "nRegistro = ?, rutaLogo = ? where nombre = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, asociacion.getNombre());
            pst.setString(2, asociacion.getTipo());
            pst.setDate(3, asociacion.getFecha());
            pst.setInt(4, asociacion.getTelefono());
            pst.setString(5, asociacion.getEmail());
            pst.setString(6, asociacion.getDireccion());
            pst.setString(7, asociacion.getCIF());
            pst.setInt(8, asociacion.getnRegistro());
            pst.setString(9, asociacion.getRutaLogo());
            pst.setString(10, nombre);
            pst.executeUpdate();
            realizado = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }    
}