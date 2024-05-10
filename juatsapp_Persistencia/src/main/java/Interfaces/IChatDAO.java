/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import objetos.Chat;

/**
 *
 * @author Pedro
 */
public interface IChatDAO {
    public boolean guardar(Chat chat);
    
   
    public boolean actualizar(Chat chat);
    
   
    public Chat buscarporID(long id);
}
