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
    public boolean guardar(Mensaje mensaje);
    
   
    public boolean actualizar(Mensaje mensaje);
         
    
    public List<Mensaje> buscarMensajes(Chat chat);
}
