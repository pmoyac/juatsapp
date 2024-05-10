package Interfaces;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Pedro
 */
public interface IConexionBD {
    public MongoDatabase crearConexion();
}
