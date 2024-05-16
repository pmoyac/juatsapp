/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import java.util.List;
import objetos.Chat;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public interface IChatDAO {

    /**
     * Metodo que guarda el chat en la base de datos
     *
     * @param chat
     * @return boolean
     */
    public boolean guardar(Chat chat);

    /**
     * Metodo que actualiza el chat en la base de datos
     *
     * @param chat
     * @return boolean
     */
    public boolean actualizar(Chat chat);

    /**
     * Metodo que devuelve todos los chat del usuario desde la bd
     *
     * @param id
     * @return List<Chat>
     */
    public List<Chat> buscarporID(ObjectId id);
    
    /**
     * Metodo que elimina un chat
     * @param c
     * @return
     */
    public boolean eliminarChat(Chat c);

}
