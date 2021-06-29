package persistencia;

import dominio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author angel
 **/
public class DAOUsuarios {
    
    private final Connection con;
    private PreparedStatement pst;
    
    public DAOUsuarios(Connection con) {
        this.con = con;
    }
    
    public ArrayList<Usuario> obtenerUsuariosDAO(){
        ArrayList listaUsuarios = new ArrayList<Usuario>();
        ResultSet rs;
        Usuario usuario;
	try {
            String sql = "select user from usuarios";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                usuario = obtenerUsuarioDAO(rs.getString(1));
                listaUsuarios.add(usuario);
            }
	} catch (SQLException e) {
            System.err.println(e.getMessage());
	}
	return listaUsuarios;
    }
    
    public Usuario obtenerUsuarioDAO(String nombre){
        ResultSet rs;
        Usuario usuario = new Usuario();
        try {
            String sql = "select * from usuarios where user = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            rs = pst.executeQuery();
            while (rs.next()) {
                usuario = new Usuario(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getInt(4));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return usuario;
    }
    
    public boolean insertarUsuarioDAO(Usuario usuario){
        boolean realizado;
        try {
            realizado = true;
            con.createStatement();
            String sql = "insert into usuarios(user, pass, idAsoc) values(?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getContrasena());
            pst.setInt(3, usuario.getIdAsociacion());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
    
    public boolean modificarUsuarioDAO(Usuario usuario){
        boolean realizado;
        try {
           
            con.createStatement();
            String sql = "update usuarios set pass = ?, ultimaConexion = ? where user = ?";
            pst = con.prepareStatement(sql);            
            pst.setString(1, usuario.getContrasena());
            pst.setDate(2, usuario.getUltimaConexion());            
            pst.setString(3, usuario.getUsuario());
            pst.executeUpdate();
            realizado = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            realizado = false;
        }
        return realizado;
    }
}