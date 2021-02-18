package persistencia;

import dominio.Asociacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author angel
 **/
public class DAOAsociacion {
    
    private final Connection con;
    private PreparedStatement pst;

    public DAOAsociacion() {
        con = Agente.getConexion();
    }

    public Asociacion obtenerAsociacionDAO(String cif){
        ResultSet rs;
        Asociacion asociacion = new Asociacion();
        try {
            String sql = "select * from asociacion where cif = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, cif);
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
    
    /*public boolean insertarAsociacionDAO(Asociacion asociacion){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "insert into asociacion(nombre, tipo, fecha, telefono,"
                    + "email, direccion, cif, nRegistro, rutaLogo) values(?,?,?,?,?,?,?,?,?)";
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
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }*/
    
    public boolean modificarAsociacionDAO(Asociacion asociacion){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update asociacion set nombre = ?, tipo = ?, fecha = ?,"
                    + "telefono = ?, email = ?, direccion = ?, cif = ?,"
                    + "nRegistro = ?, rutaLogo = ? where cif = ?";
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
            pst.setString(10, asociacion.getCIF());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }    
}