package com.mycompany.juatsapp_persistencia;

import Daos.ChatDAO;
import Daos.MensajesDAO;
import Daos.UsuarioDAO;
import Interfaces.IChatDAO;
import Interfaces.IMensajesDAO;
import Interfaces.IUsuariosDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import objetos.Chat;
import objetos.Mensaje;
import objetos.Usuario;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class Juatsapp_Persistencia{

    public static void main(String[] args) throws Exception {
       IUsuariosDAO udao = new UsuarioDAO();
       IMensajesDAO mdao = new MensajesDAO();
       IChatDAO cdao = new ChatDAO();
       
//     Usuario user = new Usuario(new ObjectId(),"34567890","hola","fem",new Date(14,5,17));
////       
//     udao.guardar(user);
//        udao.actualizar(user);

//        Mensaje mensaje= new Mensaje("Hola", new Date(), new ObjectId("663d5677d081a8093892973c")); 
//        mdao.guardar(mensaje);

//        udao.buscarTel("64413459809");
//        List<ObjectId> listam = new ArrayList();
//        listam.add(new ObjectId("663d65f71137370f6c31d5fa"));
//        List<ObjectId> listai = new ArrayList();
//        listai.add(new ObjectId("663d5677d081a8093892973c"));
//        listai.add(new ObjectId("663d86988c9f34571fe77f8c"));                
//
//        Chat chat  = new Chat("chat de prueba",listai, new Date(),listam);
//        
//        cdao.guardar(chat);

//            List<Chat> sss;
//            
//            sss = cdao.buscarporID(new ObjectId("664469834251b257fb6eb629"));
//            System.out.println(sss.get(0).toString());
            
    }
}
