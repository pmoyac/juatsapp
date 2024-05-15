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
    public boolean guardar(Chat chat);
    
   
    public boolean actualizar(Chat chat);
    
   
    public List<Chat> buscarporID(ObjectId id);
}
