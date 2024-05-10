package Daos;

import Interfaces.IMensajesDAO;
import Interfaces.IUsuariosDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import objetos.Mensaje;
import objetos.Usuario;

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

    @Override
    public Mensaje buscarporID(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
