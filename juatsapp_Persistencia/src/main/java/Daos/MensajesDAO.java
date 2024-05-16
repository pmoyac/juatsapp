package Daos;

import Interfaces.IMensajesDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import objetos.Chat;
import objetos.Mensaje;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class MensajesDAO implements IMensajesDAO{

    
    private MongoCollection getCollection(){
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection collection = database.getCollection("mensajes", Mensaje.class);
        return collection;
    }

    @Override
    public boolean guardar(Mensaje mensaje) {
        try {
            this.getCollection().insertOne(mensaje);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizar(Mensaje mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Mensaje> buscarMensajes(Chat chat) {
        List<Mensaje> messages = new ArrayList<>();

        Document chatD = chat.toDocument();
        if (chatD != null) {
            // Obtener los IDs de los mensajes asociados al chat
            List<ObjectId> messageIds = (List<ObjectId>) chatD.get("mensajes");
            if (messageIds != null && !messageIds.isEmpty()) {
                // Buscar los documentos de mensajes por sus IDs
                messages = (List<Mensaje>) this.getCollection().find(Filters.in("_id", messageIds)).into(new ArrayList<>());
                System.out.println("Mensajes DAO");
                System.out.println(messages.toString());
            }
        }

        return messages;
    }

   

   
    
    

    
}
