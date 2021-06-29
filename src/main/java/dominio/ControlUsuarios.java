package dominio;

import java.sql.Connection;
import java.util.ArrayList;
import persistencia.DAOUsuarios;

/**
 * @author angel
 **/
public class ControlUsuarios {
    
    private final DAOUsuarios daoUsuarios;

    public ControlUsuarios(Connection con) {
        this.daoUsuarios = new DAOUsuarios(con);
    }
    
    public ArrayList<Usuario> obtenerUsuarios(){
        return daoUsuarios.obtenerUsuariosDAO();
    }
    
    public Usuario obtenerUsuario(String nombre) {
        return daoUsuarios.obtenerUsuarioDAO(nombre);
    }

    public boolean insertarUsuario(Usuario usuario) {
        return daoUsuarios.insertarUsuarioDAO(usuario);
    }

    public boolean modificarUsuario(Usuario usuario){
        return daoUsuarios.modificarUsuarioDAO(usuario);
    }
}