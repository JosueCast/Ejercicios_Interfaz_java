/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazVehiculo;

/**
 *
 * @author Darkslayer
 */
public class Bicicleta implements IInterfazVehiculo {

    
    @Override
     public void arrancar() {
        System.out.println("La bicicleta empieza a moverse.");
    }
     @Override
    public void detener() {
        System.out.println("La bicicleta se detiene.");
    }
    
}
