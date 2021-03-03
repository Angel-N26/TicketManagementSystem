package dominio;

import java.util.ArrayList;
import persistencia.DAOUsuarios;

/**
 * @author angel
 **/
public class ControlUsuarios {
    private final DAOUsuarios daoUsuarios;

    public ControlUsuarios() {
        this.daoUsuarios = new DAOUsuarios();
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

    public boolean modificarUsuario(Usuario usuario, String user){
        return daoUsuarios.modificarUsuarioDAO(usuario, user);
    }
}