package bo;

import interfaces.IGestorUsuario;
import Daos.UsuarioDAO;
import Interfaces.IUsuariosDAO;
import javax.swing.JOptionPane;
import objetos.Usuario;
import org.bson.types.ObjectId;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Pedro
 */
public class GestorUsuario implements IGestorUsuario {

    IUsuariosDAO udao = new UsuarioDAO();

    @Override
    public boolean agregarUsuarioBo(Usuario usuario) throws Exception {
        try {

            if (udao.buscarTel(usuario.getTelefono()) == null) {
                String contraE = BCrypt.hashpw(usuario.getContrasena(), BCrypt.gensalt());
                usuario.setContrasena(contraE);

                udao.guardar(usuario);
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public Usuario editarUsuarioBo(Usuario usuario) throws Exception {
        try {                                                
            udao.actualizar(usuario);
            return usuario;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Usuario login(String telefono, String contra) throws Exception {
        try {
            Usuario us = udao.buscarTel(telefono);
            String passH = us.getContrasena();
            boolean passwordMatch = BCrypt.checkpw(contra, passH);

            if (passwordMatch) {
                return us;
            } else {
                return null;

            }
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ObjectId buscar(String telefono) throws Exception {
        try {
            Usuario user = udao.buscarTel(telefono);
            if(user != null){
                return user.getId();
            }else{
                return null;  
            }
        } catch (Exception e) {
            return null;
        }
        
    }
    
    

}
