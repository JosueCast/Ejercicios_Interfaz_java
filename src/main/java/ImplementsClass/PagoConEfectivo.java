/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazPago;

/**
 *
 * @author Darkslayer
 */
public class PagoConEfectivo implements IInterfazPago {

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de $" + cantidad + " realizado en efectivo.");
    }
    
}
