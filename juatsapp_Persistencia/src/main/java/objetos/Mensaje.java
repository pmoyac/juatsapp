package objetos;

import java.text.SimpleDateFormat;
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
    private String telefono;

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

    public Mensaje(String mensaje, Date fechaHora, ObjectId autor, String telefono) {
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.autor = autor;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    public ObjectId getAutor() {
        return autor;
    }

    public void setAutor(ObjectId autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(this.fechaHora);
        
        return "[" + formattedDate + "] "+telefono+": "+mensaje;
    }
    
    
}
