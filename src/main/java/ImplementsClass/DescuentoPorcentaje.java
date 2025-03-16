/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazDescontable;


public class DescuentoPorcentaje implements IInterfazDescontable {

    
   private double porcentaje;
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    @Override
    public double calcularDescuento(double precio) {
        return precio - (precio * porcentaje / 100);
    }
}
