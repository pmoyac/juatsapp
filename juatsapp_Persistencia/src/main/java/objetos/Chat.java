package objetos;

import java.util.Date;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class Chat {
    private ObjectId id;
    private String tituloChat;
    private List<ObjectId> integrantes;
    private Date fechaHora;
    private ObjectId autor;
    private List<ObjectId> mensajes;
    
    public Document toDocument() {
        Document document = new Document();
        document.append("autor", autor);
        document.append("integrantes", integrantes);
        document.append("mensajes", mensajes);
        document.append("tituloChat", tituloChat);
        document.append("fechaHora", fechaHora);
        return document;
    }

    public Chat() {
    }

    public Chat(ObjectId id, String tituloChat, List<ObjectId> integrantes, Date fechaHora, ObjectId autor, List<ObjectId> mensajes) {
        this.id = id;
        this.tituloChat = tituloChat;
        this.integrantes = integrantes;
        this.fechaHora = fechaHora;
        this.autor = autor;
        this.mensajes = mensajes;
    }

    public Chat(String tituloChat, List<ObjectId> integrantes, Date fechaHora, ObjectId autor, List<ObjectId> mensajes) {
        this.tituloChat = tituloChat;
        this.integrantes = integrantes;
        this.fechaHora = fechaHora;
        this.autor = autor;
        this.mensajes = mensajes;
    }

    public Chat(String tituloChat, Date fechaHora, ObjectId autor, List<ObjectId> mensajes) {
        this.tituloChat = tituloChat;
        this.fechaHora = fechaHora;
        this.autor = autor;
        this.mensajes = mensajes;
    }

    public Chat(String tituloChat, List<ObjectId> integrantes, Date fechaHora, List<ObjectId> mensajes) {
        this.tituloChat = tituloChat;
        this.integrantes = integrantes;
        this.fechaHora = fechaHora;
        this.mensajes = mensajes;
    }
    
    
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTituloChat() {
        return tituloChat;
    }

    public void setTituloChat(String tituloChat) {
        this.tituloChat = tituloChat;
    }

    public List<ObjectId> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<ObjectId> integrantes) {
        this.integrantes = integrantes;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public ObjectId getAutor() {
        return autor;
    }

    public void setAutor(ObjectId autor) {
        this.autor = autor;
    }

    public List<ObjectId> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<ObjectId> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return  "Chat: "+tituloChat;
    }

    
    
    
}
