package interfaces;

import objetos.Usuario;

/**
 *
 * @author Pedro
 */
public interface IGestorUsuario {
    
    public boolean agregarUsuarioBo(Usuario usuario) throws Exception;
    
    public boolean editarUsuarioBo(Usuario usuario) throws  Exception;
    
    public Usuario login(String telefono, String contra) throws Exception;
}
