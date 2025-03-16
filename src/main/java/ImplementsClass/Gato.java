/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazAnimal;


public class Gato implements IInterfazAnimal{

    @Override
     public void hacerSonido() {
        System.out.println("El gato maulla: Miau Miau!");
    }
     @Override
    public void mover() {
        System.out.println("El gato salta.");
    }
}
