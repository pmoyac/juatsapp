package Daos;

import Interfaces.IConexionBD;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Pedro
 */
public class ConexionBD implements IConexionBD{
    
    MongoClient mongoClient;
    MongoDatabase database;

    public ConexionBD() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClientSettings settings = MongoClientSettings.builder()
        .codecRegistry(pojoCodecRegistry)
        .build();
        mongoClient = MongoClients.create(settings);       
        this.database = mongoClient.getDatabase("juatsapp");
    }

    @Override
    public MongoDatabase crearConexion() {
        return this.database;
    }
    
}
