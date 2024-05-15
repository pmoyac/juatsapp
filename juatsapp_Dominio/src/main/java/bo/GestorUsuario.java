package bo;

import interfaces.IGestorUsuario;
import Daos.UsuarioDAO;
import Interfaces.IUsuariosDAO;
import javax.swing.JOptionPane;
import objetos.Usuario;
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
            String contraE = BCrypt.hashpw(usuario.getContrasena(), BCrypt.gensalt());
            usuario.setContrasena(contraE);

            udao.guardar(usuario);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public boolean editarUsuarioBo(Usuario usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

}
