package Daos;

import Interfaces.IChatDAO;
import objetos.Chat;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Updates;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import objetos.Mensaje;
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
        try {
            Bson idQuery = Filters.eq("_id", chat.getId());
            Bson updates = Updates.combine(set("fechaHora", chat.getFechaHora()),set("integrantes", chat.getIntegrantes()), set("mensajes", chat.getMensajes()), set("tituloChat", chat.getTituloChat()));
            UpdateResult result = this.getCollection().updateMany(idQuery, updates);
            System.out.println(result.getModifiedCount());
            return result.getModifiedCount() == 1;
        } catch (Exception e) {
            return false;
        }
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
    
//    @Override
//    public List<Mensaje> buscarMensajes(ObjectId id) {
//        List<Mensaje> messages = new ArrayList<>();
//
//        
//        if (chat != null) {
//            // Obtener los IDs de los mensajes asociados al chat
//            List<ObjectId> messageIds = (List<ObjectId>) chat.get("mensajes");
//            if (messageIds != null && !messageIds.isEmpty()) {
//                // Buscar los documentos de mensajes por sus IDs
//                messages = messageCollection.find(Filters.in("_id", messageIds)).into(new ArrayList<>());
//            }
//        }
//
//        return messages;
//        
//        
//        
////          List<Mensaje> encontrados = new ArrayList<>();
////
////        Bson filter = Filters.in("mensajes", id);
////        FindIterable<Mensaje> chats = this.getCollection().find(filter);
////
////        try (MongoCursor<Mensaje> cursor = chats.iterator()) {
////            while (cursor.hasNext()) {
////                Mensaje chatn = cursor.next();
////                encontrados.add(chatn);
////            }
////        }
////
////        return encontrados;
//    }

}
