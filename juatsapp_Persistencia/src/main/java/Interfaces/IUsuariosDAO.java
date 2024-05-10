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
     * @return 
     */
    public boolean guardar(Usuario usuario);
    
    /**
     * 
     * @param usuario
     * @return 
     */
    public boolean actualizar(Usuario usuario);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Usuario buscarporID(long id);
}
