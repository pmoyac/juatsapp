package com.mycompany.juatsapp_persistencia;

import Daos.ChatDAO;
import Daos.MensajesDAO;
import Daos.UsuarioDAO;
import Interfaces.IChatDAO;
import Interfaces.IMensajesDAO;
import Interfaces.IUsuariosDAO;
import java.util.Date;
import objetos.Mensaje;
import objetos.Usuario;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class Juatsapp_Persistencia{

    public static void main(String[] args) {
       IUsuariosDAO udao = new UsuarioDAO();
       IMensajesDAO mdao = new MensajesDAO();
       IChatDAO cdao = new ChatDAO();
       
//       Usuario user = new Usuario(new ObjectId("663d5677d081a8093892973c"),"1","87","mapache",new Date(124,0,1));
//       
//       udao.guardar(user);
//        udao.actualizar(user);

//        Mensaje mensaje= new Mensaje("Hola", new Date(), new ObjectId("663d5677d081a8093892973c")); 
//        mdao.guardar(mensaje);
    }
}
