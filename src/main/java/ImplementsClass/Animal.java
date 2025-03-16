/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazAlimentacion;


public class Animal implements IInterfazAlimentacion {

    @Override
     public void comer() {
        System.out.println("El animal come directamente del suelo.");
    }
    
}
