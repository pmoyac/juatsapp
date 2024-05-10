package objetos;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class Chat {
    private ObjectId id;
    private String tituloChat;
    private List<String> integrantes;
    private Date fechaHora;
    private ObjectId autor;
    private List<ObjectId> mensajes;

    public Chat() {
    }

    public Chat(ObjectId id, String tituloChat, List<String> integrantes, Date fechaHora, ObjectId autor, List<ObjectId> mensajes) {
        this.id = id;
        this.tituloChat = tituloChat;
        this.integrantes = integrantes;
        this.fechaHora = fechaHora;
        this.autor = autor;
        this.mensajes = mensajes;
    }

    public Chat(String tituloChat, List<String> integrantes, Date fechaHora, ObjectId autor, List<ObjectId> mensajes) {
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

    public List<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<String> integrantes) {
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
        return "Chat{" + "id=" + id + "/n" + 
                ", tituloChat=" + tituloChat + ", integrantes=" + integrantes + ", fechaHora=" + fechaHora + ", autor=" + autor + ", mensajes=" + mensajes + '}';
    }
    
    
}
