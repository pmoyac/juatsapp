package interfaces;

import java.util.List;
import objetos.Chat;
import objetos.Mensaje;
import objetos.Usuario;

/**
 *
 * @author Pedro
 */
public interface IGestorChats {

    /**
     * Metodo para agregar el chat
     *
     * @param chat
     * @throws Exception
     */
    public void agregarChat(Chat chat) throws Exception;

    /**
     * Metodo para eliminar el chat
     *
     * @param chat
     * @return 
     * @throws Exception
     */
    public boolean eliminarChat(Chat chat) throws Exception;

    /**
     * Metodo para editar chats
     *
     * @param chat
     * @return 
     * @throws Exception
     */
    public boolean editarChat(Chat chat) throws Exception;

    /**
     * Metodo que agrega un mensaje al chat
     *
     * @param msj
     * @param chat
     * @return boolean del agregado del mensaje
     * @throws Exception
     */
    public boolean agregarMsj(Mensaje msj, Chat chat) throws Exception;

    /**
     * Metodo para buscar los mensajes de un chat
     *
     * @param chat
     * @return Lista de mensajes que contiene el chat
     * @throws Exception
     */
    public List<Mensaje> buscarMensajesChat(Chat chat) throws Exception;

    /**
     * Metodo para buscar todos los chats del usuario
     *
     * @param user
     * @return Lista de Chats en los que el usuario participa
     * @throws Exception
     */
    public List<Chat> buscarChatsUsuario(Usuario user) throws Exception;

}
