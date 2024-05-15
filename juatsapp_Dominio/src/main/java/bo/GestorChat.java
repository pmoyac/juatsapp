package bo;

import Daos.ChatDAO;
import Interfaces.IChatDAO;
import interfaces.IGestorChats;
import objetos.Chat;
import objetos.Mensaje;

/**
 *
 * @author Pedro
 */
public class GestorChat implements IGestorChats{

    IChatDAO cdao = new ChatDAO();
    
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
    public void agregarMsj(Mensaje msj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
