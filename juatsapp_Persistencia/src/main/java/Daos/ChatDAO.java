package Daos;

import Interfaces.IChatDAO;
import objetos.Chat;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class ChatDAO implements IChatDAO {

    private MongoCollection getCollection() {
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
    public List<Chat> buscarporID(ObjectId id) {
        List<Chat> encontrados = new ArrayList<>();

        Bson filter = Filters.in("integrantes", id);
        FindIterable<Chat> chats = this.getCollection().find(filter);

        try (MongoCursor<Chat> cursor = chats.iterator()) {
            while (cursor.hasNext()) {
                Chat chatn = cursor.next();
                encontrados.add(chatn);
            }
        }

        return encontrados;
    }

}
