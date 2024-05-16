package Interfaces;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Pedro
 */
public interface IConexionBD {
    
    /**
     * Metodo que crea una conexion a la base de datos
     * @return MongoDatabase
     */
    public MongoDatabase crearConexion();
}
