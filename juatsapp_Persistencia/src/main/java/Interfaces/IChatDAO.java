/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import java.util.List;
import objetos.Chat;
import objetos.Mensaje;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public interface IChatDAO {

    /**
     *
     * @param chat
     * @return
     */
    public boolean guardar(Chat chat);
    
    /**
     *
     * @param chat
     * @return
     */
    public boolean actualizar(Chat chat);
    
    /**
     *
     * @param id
     * @return
     */
    public List<Chat> buscarporID(ObjectId id);
    
    
}
