package Interfaces;

import objetos.Mensaje;

/**
 *
 * @author Pedro
 */
public interface IMensajesDAO {
    public boolean guardar(Mensaje mensaje);
    
   
    public boolean actualizar(Mensaje mensaje);
    
   
    public Mensaje buscarporID(long id);
}
