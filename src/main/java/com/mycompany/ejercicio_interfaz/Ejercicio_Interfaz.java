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

/**
 *
 * @author Darkslayer
 */
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
        
        pagoConTarjeta.procesarPago(2);
        pagoConEfectivo.procesarPago(10);

        
    }
}
