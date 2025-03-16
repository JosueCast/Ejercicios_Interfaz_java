/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazDescontable;


public class DescuentoFijo implements IInterfazDescontable {

    
     private double descuento;
    public DescuentoFijo(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public double calcularDescuento(double precio) {
        return precio - descuento;
    }
    
}
