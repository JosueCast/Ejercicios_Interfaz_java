/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazTrabajador;

/**
 *
 * @author Darkslayer
 */
public class Diseñador implements IInterfazTrabajador {

    @Override
     public void trabajar() {
        System.out.println("El diseñador crea diseños gráficos.");
    }
    
}
