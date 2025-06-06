/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_interfaz;

import Service.IInterfazAnimal;
import ImplementsClass.Perro;
import ImplementsClass.Gato;
import Service.IInterfazVehiculo;
import ImplementsClass.Coche;
import ImplementsClass.Bicicleta;
import Service.IInterfazPago;
import ImplementsClass.PagoConTarjeta;
import ImplementsClass.PagoConEfectivo;
import Service.IInterfazFiguraGeometrica;
import ImplementsClass.Circulo;
import ImplementsClass.Rectangulo;
import Service.IInterfazTrabajador;
import ImplementsClass.Diseñador;
import ImplementsClass.Desarrollador;
import Service.IInterfazOrdenable;
import ImplementsClass.ListaNumeros;
import Service.IInterfazAlimentacion;
import ImplementsClass.Persona;
import ImplementsClass.Animal;
import Service.IInterfazNotificacion;
import ImplementsClass.CorreoElectronico;
import ImplementsClass.Sms;
import Service.IInterfazDescontable;
import ImplementsClass.DescuentoFijo;
import ImplementsClass.DescuentoPorcentaje;
import ImplementsClass.Producto;
import Service.IInterfazComparableObjeto;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Ejercicio_Interfaz {

    public static void main(String[] args) {
        
        IInterfazAnimal perro = new Perro();
        IInterfazAnimal gato = new Gato();
//      pruebas de la interfaz animal
//        perro.hacerSonido();
//        gato.hacerSonido();


        IInterfazVehiculo coche = new Coche();
        IInterfazVehiculo bicicleta = new Bicicleta();
//        Prueba de la InterfazVehiculo
//        coche.arrancar();
//        bicicleta.detener();
        

        IInterfazPago pagoConTarjeta = new PagoConTarjeta();
        IInterfazPago pagoConEfectivo = new PagoConEfectivo();
        
//        pagoConTarjeta.procesarPago(2);
//        pagoConEfectivo.procesarPago(10);

        IInterfazFiguraGeometrica circulo = new Circulo(5);
        IInterfazFiguraGeometrica rectangulo = new Rectangulo(4, 6);

//        System.out.println("Circulo - Area: " + circulo.area() + ", Perimetro: " + circulo.perimetro());
//        System.out.println("Rectangulo - Area: " + rectangulo.area() + ", Perimetro: " + rectangulo.perimetro());
        
        IInterfazTrabajador disenador = new Diseñador();
        IInterfazTrabajador desarrolador = new Desarrollador();
        
//        disenador.trabajar();
//        desarrolador.trabajar();

//        IInterfazOrdenable listarnumero = new ListaNumeros(Arrays.asList(5, 3, 8, 1, 2));
//        listarnumero.ordenar();
        

        IInterfazAlimentacion persona =new Persona();
        IInterfazAlimentacion animal =new Animal();
//        persona.comer();
//        animal.comer();


          IInterfazNotificacion correo =new CorreoElectronico();
          IInterfazNotificacion sms =new Sms();
//          correo.enviarNotificacion();
//          sms.enviarNotificacion();

        IInterfazDescontable porcetaje = new DescuentoPorcentaje(10);
        IInterfazDescontable fijo = new DescuentoFijo(15);
//         double precioOriginal = 100.0;
//
//        System.out.println("Precio con 10% de descuento: $" + porcetaje.calcularDescuento(precioOriginal));        
//        System.out.println("Precio con descuento fijo de $15: $" + fijo.calcularDescuento(precioOriginal));
//        
        
// Crear instancias de Producto
        IInterfazComparableObjeto producto1 = new Producto(100.50);
        IInterfazComparableObjeto producto2 = new Producto(150.75);

        // Comparar los productos
        int resultado = producto1.comparar(producto2);

        // Mostrar el resultado de la comparación
        if (resultado < 0) {
            System.out.println("Producto 1 es más barato que Producto 2");
        } else if (resultado > 0) {
            System.out.println("Producto 1 es más caro que Producto 2");
        } else {
            System.out.println("Producto 1 y Producto 2 tienen el mismo precio");
        }

        


    }
}

