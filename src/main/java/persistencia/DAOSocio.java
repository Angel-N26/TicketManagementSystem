package persistencia;

import dominio.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Angel
 **/
public class DAOSocio {

    private final Connection con;
    private PreparedStatement pst;

    public DAOSocio() {
        con = Agente.getConexion();
    }

    public ArrayList<Socio> obtenerSociosDAO(String nombreAsoc){
        ArrayList listaSocios = new ArrayList<Socio>();
        ResultSet rs;
        Socio socio;
	try {
            String sql = "select dni from socios where nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombreAsoc);
            rs = pst.executeQuery();
            while(rs.next()) {
                socio = obtenerSocioDAO(rs.getString(1), nombreAsoc);
                listaSocios.add(socio);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
	return listaSocios;
    }

    public Socio obtenerSocioDAO(String dni, String nombreAsoc) {
        ResultSet rs;
        Socio socio = new Socio();
        try {
            String sql = "select * from socios where dni = ? AND nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, dni);
            pst.setString(2, nombreAsoc);
            rs = pst.executeQuery();
            while (rs.next()) {
                socio = new Socio(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getDate(5), rs.getString(6), rs.getInt(7),
                        rs.getDate(8), rs.getInt(9), rs.getBoolean(10), rs.getString(11), rs.getString(12));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return socio;
    }

    public boolean insertarSocioDAO(Socio socio) {        
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "insert into socios values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, socio.getDni());
            pst.setString(2, socio.getNombre());
            pst.setString(3, socio.getApellidos());
            pst.setString(4, socio.getEmail());
            pst.setDate(5, socio.getFechaNac());
            pst.setString(6, socio.getDomicilio());
            pst.setInt(7, socio.getTelefono());
            pst.setDate(8, socio.getFechaIngreso());
            pst.setInt(9, socio.getIdMembresia());
            pst.setBoolean(10, socio.isPagado());
            pst.setString(11, socio.getRutaImg());
            pst.setBoolean(12, false);
            pst.setString(13, socio.getNombreAsoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }

    public boolean modificarSocioDAO(Socio socio, String dni, String nombreAsoc){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update socios set dni = ?, nombre = ?, apellidos = ?,"
                    + " email = ?, fechanacimiento = ?, direccion = ?, telefono = ?,"
                    + "fechaingreso = ?, idMembresia = ?, pagado = ?, rutaImg = ? where dni = ? AND nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, socio.getDni());
            pst.setString(2, socio.getNombre());
            pst.setString(3, socio.getApellidos());
            pst.setString(4, socio.getEmail());
            pst.setDate(5, socio.getFechaNac());
            pst.setString(6, socio.getDomicilio());
            pst.setInt(7, socio.getTelefono());
            pst.setDate(8, socio.getFechaIngreso());
            pst.setInt(9, socio.getIdMembresia());
            pst.setBoolean(10, socio.isPagado());
            pst.setString(11, socio.getRutaImg());
            pst.setString(12, dni);
            pst.setString(13, nombreAsoc);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }

    public boolean eliminarSocioDAO(String dni){
        /*boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update socios set inactivo = ? where dni = ?";
            pst = con.prepareStatement(sql);
            pst.setBoolean(1, true);
            pst.setString(2, dni);
            pst.executeUpdate();            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;*/
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from socios where dni = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, dni);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}