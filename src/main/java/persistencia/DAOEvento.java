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

    public ArrayList<Evento> obtenerEventosDAO(){
        ArrayList listaEventos = new ArrayList<Evento>();
        ResultSet rs;
        Evento evento;
	try {
            String sql = "select ideventos from eventos";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                evento = obtenerEventoDAO(rs.getInt(1));
                listaEventos.add(evento);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
        return listaEventos;
    }
    
    public Evento obtenerEventoDAO(int id){
        ResultSet rs;
        Evento evento = new Evento();
        try {
            String sql = "select * from eventos where ideventos = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                evento = new Evento(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getDate(5), rs.getTime(6), rs.getInt(7), rs.getInt(8));
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
            String sql = "insert into eventos(nombre, tipo, direccion, fecha, hora,"
                    + " entradas, entradasVendidas) values(?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, evento.getNombre());
            pst.setString(2, evento.getTipo_evento());
            pst.setString(3, evento.getLugar_evento());
            pst.setDate(4, evento.getFecha_evento());
            pst.setTime(5, evento.getHora_evento());
            pst.setInt(6, evento.getEntradas());
            pst.setInt(7, evento.getEntradas_vendidas());
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
            String sql = "update eventos set nombre = ?, tipo = ?, direccion = ?,"
                    + " fecha = ?, hora = ?, entradas = ?, entradasVendidas = ? where ideventos = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, evento.getNombre());
            pst.setString(2, evento.getTipo_evento());
            pst.setString(3, evento.getLugar_evento());
            pst.setDate(4, evento.getFecha_evento());
            pst.setTime(5, evento.getHora_evento());
            pst.setInt(6, evento.getEntradas());
            pst.setInt(7, evento.getEntradas_vendidas());
            pst.setInt(8, evento.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean eliminarEventoDAO(int id){
        boolean realizado;
        try{
            realizado = true;
            con.createStatement();
            String sql = "delete from eventos where ideventos = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}