/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazNotificacion;


public class CorreoElectronico implements IInterfazNotificacion {

    @Override
   public void enviarNotificacion() {
        System.out.println("Enviando notificación por correo electrónico.");
    }
    
}
