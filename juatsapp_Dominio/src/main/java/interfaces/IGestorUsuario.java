package interfaces;

import objetos.Usuario;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public interface IGestorUsuario {
    
    public boolean agregarUsuarioBo(Usuario usuario) throws Exception;
    
    public Usuario editarUsuarioBo(Usuario usuario) throws  Exception;
    
    public Usuario login(String telefono, String contra) throws Exception;
    
    public ObjectId buscar(String telefono) throws Exception;
}
