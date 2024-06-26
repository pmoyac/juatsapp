/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daos;

import Interfaces.IUsuariosDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.UpdateResult;
import objetos.Usuario;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Pedro
 */
public class UsuarioDAO implements IUsuariosDAO {

    private MongoCollection getCollection() {
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection collection = database.getCollection("usuarios", Usuario.class);
        return collection;
    }

    @Override
    public boolean guardar(Usuario usuario) {
        try {
            this.getCollection().insertOne(usuario);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizar(Usuario u) {

        try {
            Bson idQuery = Filters.eq("_id", u.getId());
            Bson updates = Updates.combine(set("telefono", u.getTelefono()),set("direccion", u.getDireccion()), set("sexo", u.getSexo()), set("fecha_nacimiento", u.getFecha_nacimiento()));
            UpdateResult result = this.getCollection().updateMany(idQuery, updates);
            System.out.println(result.getModifiedCount());
            return result.getModifiedCount() == 1;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Usuario buscarporID(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario buscarTel(String telefono) throws Exception {
        try {
            // Buscar el usuario en la base de datos por telefono               
            Document query = new Document("telefono", telefono);
            MongoCursor<Usuario> cursor = this.getCollection().find(query).iterator();

            Usuario usuario = cursor.next();
            return usuario;
//        Usuario user= new Usuario();
//        user.setId(usuario.getObjectId("_id"));
//        user.setTelefono(usuario.getString("telefono"));
//        user.setContrasena(usuario.getString("contrasena"));
//        user.setSexo(usuario.getString("sexo"));
//        user.setFecha_nacimiento(usuario.getDate("fecha_nacimiento"));           
            
        } catch (Exception e) {
            return null;
        }

    }

}
