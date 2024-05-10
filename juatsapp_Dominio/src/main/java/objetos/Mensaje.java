package objetos;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class Mensaje {
    private ObjectId id;
    private String mensaje;
    private Date fechaHora;
    private ObjectId autor;

    public Mensaje() {
    }

    public Mensaje(String mensaje, Date fechaHora, ObjectId autor) {
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.autor = autor;
    }

    public Mensaje(ObjectId id, String mensaje, Date fechaHora, ObjectId autor) {
        this.id = id;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.autor = autor;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
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

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", mensaje=" + mensaje + ", fechaHora=" + fechaHora + ", autor=" + autor + '}';
    }
    
    
}
