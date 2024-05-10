package objetos;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class Usuario {
    private ObjectId id;
    private String telefono;
    private String contrasena;
    private String sexo;
    private Date fecha_nacimiento;

    public Usuario() {
    }

    public Usuario(ObjectId id, String telefono, String contrasena, String sexo, Date fecha_nacimiento) {
        this.id = id;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Usuario(String telefono, String contrasena, String sexo, Date fecha_nacimiento) {
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Usuario(String telefono, String contrasena, String sexo) {
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.sexo = sexo;
    }
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", telefono=" + telefono + ", contrasena=" + contrasena + ", sexo=" + sexo + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
}
