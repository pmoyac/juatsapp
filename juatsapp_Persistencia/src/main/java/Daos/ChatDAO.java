package Daos;

import Interfaces.IChatDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import objetos.Chat;

/**
 *
 * @author Pedro
 */
public class ChatDAO implements IChatDAO{

    private MongoCollection getCollection(){
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection collection = database.getCollection("chats", Chat.class);
        return collection;
    }
    @Override
    public boolean guardar(Chat chat) {
        try {
            this.getCollection().insertOne(chat);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizar(Chat chat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Chat buscarporID(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
