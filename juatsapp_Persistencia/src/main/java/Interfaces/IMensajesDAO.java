package Interfaces;

import java.util.List;
import objetos.Chat;
import objetos.Mensaje;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public interface IMensajesDAO {
    
    /**
     * Metodo que guarda el mensaje en la base de datos
     * @param mensaje
     * @return boolean
     */
    public boolean guardar(Mensaje mensaje);
    
    /**
     * Metodo que actualiza el mensaje en la base de datos
     * @param mensaje
     * @return boolean
     */
    public boolean actualizar(Mensaje mensaje);
         
    /**
     * Metodo que busca todos los mendajes de un chat en la base de datos
     * @param chat
     * @return
     */
    public List<Mensaje> buscarMensajes(Chat chat);
}
