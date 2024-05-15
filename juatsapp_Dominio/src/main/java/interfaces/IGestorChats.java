
package interfaces;

import objetos.Chat;
import objetos.Mensaje;

/**
 *
 * @author Pedro
 */
public interface IGestorChats {
    public void agregarChat(Chat chat) throws Exception;
    
    public void eliminarChat(Chat chat) throws Exception;
    
    public void editarChat(Chat chat) throws Exception;
    
    public void agregarMsj(Mensaje msj) throws Exception;
    
}
