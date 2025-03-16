/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazComparableObjeto;


public class Producto implements IInterfazComparableObjeto {

   
     private double precio;
    public Producto(double precio) {
        this.precio = precio;
    }
    @Override
    public int comparar(Object o) {
        Producto otro = (Producto) o;
        return Double.compare(this.precio, otro.precio);
    }
    
    
}
