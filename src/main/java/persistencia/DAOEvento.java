package persistencia;

import dominio.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Angel
 **/
public class DAOEvento {

    private final Connection con;
    private PreparedStatement pst;

    public DAOEvento() {
        con = Agente.getConexion();
    }

    public ArrayList<Evento> obtenerEventosDAO(int idAsoc){
        ArrayList listaEventos = new ArrayList<Evento>();
        ResultSet rs;
        Evento evento;
	try {
            String sql = "select ideventos from eventos where idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idAsoc);
            rs = pst.executeQuery();
            while(rs.next()) {
                evento = obtenerEventoDAO(rs.getInt(1), idAsoc);
                listaEventos.add(evento);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEventos;
    }
    
    public Evento obtenerEventoDAO(int id, int idAsoc){
        ResultSet rs;
        Evento evento = new Evento();
        try {
            String sql = "select * from eventos where ideventos = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setInt(2, idAsoc);
            rs = pst.executeQuery();
            while (rs.next()) {
                evento = new Evento(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getDate(6),
                        rs.getTime(7), rs.getInt(8), rs.getInt(9),
                        rs.getString(10), rs.getInt(11));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return evento;
    }
    
    public boolean insertarEventoDAO(Evento evento){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "insert into eventos(nombre, tipo, sala, direccion, fecha,"
                    + "hora, entradas, entradasVendidas, rutaImg, idAsoc) "
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, evento.getNombre());
            pst.setString(2, evento.getTipo());
            pst.setString(3, evento.getSala());
            pst.setString(4, evento.getDireccion());
            pst.setDate(5, evento.getFecha());
            pst.setTime(6, evento.getHora());
            pst.setInt(7, evento.getEntradas());
            pst.setInt(8, evento.getEntradasVendidas());
            pst.setString(9, evento.getRutaImg());
            pst.setInt(10, evento.getIdAsoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean modificarEventoDAO(Evento evento){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "update eventos set nombre = ?, tipo = ?, sala = ?,"
                    + "direccion = ?, fecha = ?, hora = ?, entradas = ?,"
                    + "entradasVendidas = ?, rutaImg = ? where ideventos = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, evento.getNombre());
            pst.setString(2, evento.getTipo());
            pst.setString(3, evento.getSala());
            pst.setString(4, evento.getDireccion());
            pst.setDate(5, evento.getFecha());
            pst.setTime(6, evento.getHora());
            pst.setInt(7, evento.getEntradas());
            pst.setInt(8, evento.getEntradasVendidas());
            pst.setString(9, evento.getRutaImg());
            pst.setInt(10, evento.getId());  
            pst.setInt(11, evento.getIdAsoc());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean eliminarEventoDAO(int id, int idAsoc){
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from eventos where ideventos = ? AND idAsoc = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setInt(2, idAsoc);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}