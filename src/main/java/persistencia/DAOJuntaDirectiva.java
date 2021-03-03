package persistencia;

import dominio.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 * @author angel
 **/
public class DAOJuntaDirectiva {

    private final Connection con;
    private PreparedStatement pst;

    public DAOJuntaDirectiva() {
        con = Agente.getConexion();
    }

    public ArrayList<Cargo> obtenerCargosDAO(String nombreAsoc) {
        ArrayList listaEventos = new ArrayList();
        ResultSet rs;
        Cargo cargo;
        try {
            String sql = "select cargo from juntadirectiva where nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombreAsoc);
            rs = pst.executeQuery();
            while (rs.next()) {
                cargo = obtenerCargoDAO(rs.getString(1), nombreAsoc);
                listaEventos.add(cargo);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listaEventos;
    }

    public Cargo obtenerCargoDAO(String nombre, String nombreAsoc) {
        ResultSet rs;
        Cargo cargo = new Cargo();
        try {
            String sql = "select * from juntadirectiva where cargo = ? AND nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, nombreAsoc);
            rs = pst.executeQuery();
            while (rs.next()) {
                cargo = new Cargo(rs.getString(1), rs.getString(2), nombreAsoc);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return cargo;
    }

    public boolean insertarCargoDAO(Cargo cargo){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "insert into juntadirectiva(cargo, idSocio, nombreAsoc)"
                    + "values(?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, cargo.getNombre());
            pst.setString(2, cargo.getIdSocio());
            pst.setString(3, cargo.getNombreAsoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean modificarCargoDAO(Cargo cargo) {
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update juntadirectiva set idSocio = ? where cargo = ? AND nombreAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, cargo.getIdSocio());
            pst.setString(2, cargo.getNombre());
            pst.setString(3, cargo.getNombreAsoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}