/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazAnimal;

/**
 *
 * @author Darkslayer
 */
class Perro implements IInterfazAnimal {
    @Override
     public void hacerSonido() {
        System.out.println("El perro ladra: Guau Guau!");
    }
     @Override
    public void mover() {
        System.out.println("El perro corre.");
    }
    
}
