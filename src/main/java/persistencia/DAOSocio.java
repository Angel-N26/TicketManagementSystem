package persistencia;

import dominio.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class DAOSocio {

    private final Connection con;
    private PreparedStatement pst;

    public DAOSocio() {
        con = Agente.getConexion();
    }

    public ArrayList<Socio> obtenerSociosDAO(){
        ArrayList listaSocios = new ArrayList<Socio>();
        ResultSet rs;
        Socio socio;
	try {
            String sql = "select dni from socios";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                socio = obtenerSocioDAO(rs.getString(1));
                listaSocios.add(socio);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
	return listaSocios;
    }

    public Socio obtenerSocioDAO(String dni) {
        ResultSet rs;
        Socio socio = new Socio();
        try {
            String sql = "select * from socios where dni = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, dni);
            rs = pst.executeQuery();
            while (rs.next()) {
                socio = new Socio(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getDate(5), rs.getString(6),
                        rs.getInt(7), rs.getInt(8));
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
            String sql = "insert into socios values(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, socio.getDni());
            pst.setString(2, socio.getNombre());
            pst.setString(3, socio.getApellidos());
            pst.setString(4, socio.getEmail());
            pst.setObject(5, socio.getFecha_nac());
            pst.setString(6, socio.getDomicilio());
            pst.setInt(7, socio.getTelefono());
            pst.setInt(8, socio.getId_membresia());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }

    public boolean modificarSocioDAO(Socio socio){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update socios set nombre = ?, apellidos = ?, email = ?,"
                    + "fechanacimiento = ?, direccion = ?, telefono = ?, cuota = ? where dni = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, socio.getNombre());
            pst.setString(2, socio.getApellidos());
            pst.setString(3, socio.getEmail());
            pst.setObject(4, socio.getFecha_nac());
            pst.setString(5, socio.getDomicilio());
            pst.setInt(6, socio.getTelefono());
            pst.setInt(7, socio.getId_membresia());
            pst.setString(8, socio.getDni());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }

    public boolean eliminarSocioDAO(String dni){
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