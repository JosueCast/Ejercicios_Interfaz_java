/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementsClass;
import Service.IInterfazOrdenable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListaNumeros implements IInterfazOrdenable {
     private List<Integer> numeros;

    public ListaNumeros(List<Integer> numeros) {
        this.numeros = new ArrayList<>(numeros);
    }

    @Override
    public void ordenar() {
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
   
}
