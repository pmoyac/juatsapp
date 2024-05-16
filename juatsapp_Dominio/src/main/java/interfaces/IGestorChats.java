package interfaces;

import java.util.List;
import objetos.Chat;
import objetos.Mensaje;
import objetos.Usuario;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public interface IGestorChats {

    /**
     *
     * @param chat
     * @throws Exception
     */
    public void agregarChat(Chat chat) throws Exception;

    /**
     *
     * @param chat
     * @throws Exception
     */
    public void eliminarChat(Chat chat) throws Exception;

    /**
     *
     * @param chat
     * @throws Exception
     */
    public void editarChat(Chat chat) throws Exception;

    /**
     *
     * @param msj
     * @param chat
     * @throws Exception
     */
    public boolean agregarMsj(Mensaje msj, Chat chat) throws Exception;

  

    /**
     *     
     * @param chat
     * @return Lista de mensajes que contiene el chat
     * @throws Exception
     */
    public List<Mensaje> buscarMensajesChat(Chat chat) throws Exception;

    /**
     *
     * @param user
     * @return Lista de Chats en los que el usuario participa
     * @throws Exception
     */
    public List<Chat> buscarChatsUsuario(Usuario user) throws Exception;

}
