package bo;

import Daos.ChatDAO;
import Daos.MensajesDAO;
import Interfaces.IChatDAO;
import Interfaces.IMensajesDAO;
import interfaces.IGestorChats;
import java.util.List;
import objetos.Chat;
import objetos.Mensaje;
import objetos.Usuario;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class GestorChat implements IGestorChats {

    IChatDAO cdao = new ChatDAO();
    
    IMensajesDAO msjdao = new MensajesDAO();

    @Override
    public void agregarChat(Chat chat) throws Exception {
        try {
            cdao.guardar(chat);
        } catch (Exception e) {
        }
    }

    @Override
    public void eliminarChat(Chat chat) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarChat(Chat chat) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean agregarMsj(Mensaje msj, Chat chat) throws Exception {
        try {
            msjdao.guardar(msj);
            
            List<ObjectId> msjs = chat.getMensajes();
            msjs.add(msj.getId());

            chat.setMensajes(msjs);

            cdao.actualizar(chat);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Mensaje> buscarMensajesChat(Chat chat) throws Exception {
        try {
            List<Mensaje> msjs = msjdao.buscarMensajes(chat);
            System.out.println("Gestor de chat");
            System.out.println(msjs.toString());
            
            return msjs;
            
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Chat> buscarChatsUsuario(Usuario user) throws Exception {
        try {
            List<Chat> encontrados = cdao.buscarporID(user.getId());
            return encontrados;
        } catch (Exception e) {
            return null;
        }
    }
    
    

 
    

  

}
