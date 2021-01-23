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

    public ArrayList<Cargo> obtenerCargosDAO() {
        ArrayList listaEventos = new ArrayList();
        ResultSet rs;
        Cargo cargo;
        try {
            String sql = "select cargo from juntadirectiva";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                cargo = obtenerCargoDAO(rs.getString(1));
                listaEventos.add(cargo);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listaEventos;
    }

    public Cargo obtenerCargoDAO(String nombre) {
        ResultSet rs;
        Cargo cargo = new Cargo();
        try {
            String sql = "select * from juntadirectiva where cargo = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            rs = pst.executeQuery();
            while (rs.next()) {
                cargo = new Cargo(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return cargo;
    }

    public boolean modificarCargoDAO(Cargo cargo) {
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update juntadirectiva set idSocio = ? where cargo = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, cargo.getIdSocio());
            pst.setString(2, cargo.getNombre());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}