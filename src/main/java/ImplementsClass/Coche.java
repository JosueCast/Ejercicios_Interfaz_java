/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazVehiculo;


public class Coche implements IInterfazVehiculo{

    @Override
    public void arrancar() {
        System.out.println("El coche arranca.");
    }
    @Override
    public void detener() {
        System.out.println("El coche se detiene.");
    }
    
}
