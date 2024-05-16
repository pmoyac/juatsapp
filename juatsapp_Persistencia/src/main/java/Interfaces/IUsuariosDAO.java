package Interfaces;

import objetos.Usuario;

/**
 *
 * @author Pedro
 */
public interface IUsuariosDAO {
    /**
     * 
     * @param usuario
     * @return usuario guardado
     * @throws java.lang.Exception
     */
    public boolean guardar(Usuario usuario) throws Exception;
    
    /**
     * 
     * @param usuario
     * @return usuario actualizado
     * @throws java.lang.Exception
     */
    public boolean actualizar(Usuario usuario) throws Exception;
    
    /**
     * 
     * @param id
     * @return usuario encontrado
     * @throws java.lang.Exception
     */
    public Usuario buscarporID(long id) throws Exception;
    
    /**
     * 
     * @param telefono     
     * @return si el usuario logro iniciar sesion
     * @throws java.lang.Exception
     */
    public Usuario buscarTel(String telefono) throws Exception;
}
