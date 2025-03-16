/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;

import Service.IInterfazFiguraGeometrica;


public class Rectangulo implements IInterfazFiguraGeometrica {
    
    
    private double ancho, alto;
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public double area() {
        return ancho * alto;
    }
    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }
    
}
