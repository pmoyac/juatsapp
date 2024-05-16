package interfaces;

import objetos.Usuario;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public interface IGestorUsuario {
    
    /**
     * Metodo que agrega un usuario
     * @param usuario
     * @return boolean
     * @throws Exception
     */
    public boolean agregarUsuarioBo(Usuario usuario) throws Exception;
    
    /**
     * Metodo que edita un usuario
     * @param usuario
     * @return Usuario
     * @throws Exception
     */
    public Usuario editarUsuarioBo(Usuario usuario) throws  Exception;
    
    /**
     * Metodo para hacer login
     * @param telefono
     * @param contra
     * @return Usuario
     * @throws Exception
     */
    public Usuario login(String telefono, String contra) throws Exception;
    
    /**
     * Metodo que devuelve el ObjectId del telefono enviado
     * @param telefono
     * @return ObjectId
     * @throws Exception
     */
    public ObjectId buscar(String telefono) throws Exception;
}
