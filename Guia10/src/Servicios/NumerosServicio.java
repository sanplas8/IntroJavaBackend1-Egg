/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Numeros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class NumerosServicio {

    private Scanner leerValores;
    int [] listaNumeros;

    public NumerosServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        
    }

    public Numeros crearSecuencia() {
        ArrayList<Integer> nuevaSecuencia = new ArrayList();
        int numero = 0;
        do {
            System.out.println("Ingrese un numero");
            numero = leerValores.nextInt();
            if (numero != -99) {
                nuevaSecuencia.add(numero);
                System.out.println("Numero Aniadido");
            }
        } while (numero != -99);

        return new Numeros(nuevaSecuencia);
    }

    public void agregarSecuencia() {
        ArrayList<Integer> lista = new ArrayList(crearSecuencia().getSecuencia());
        this.listaNumeros = new int [lista.size()];
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = lista.get(i);
        }
    }

    public void mostrarSecuencia() {
        System.out.print("La secuencia de numeros ingresada es: \n"+
                "[ ");
        for (int aux : listaNumeros) {
            System.out.print(aux+" ");
        }
        System.out.print("] \n");
    }
    
    public int sumaSecuencia(){
        int suma = 0;
        for (int aux : listaNumeros) {
            suma += aux;
        }
        
        System.out.println("La suma de la secuencia de numeros es: "+suma);
        return suma;
    }
    
    public void mediaSecuencia(){
        
        System.out.println("El promedio de los numeros ingresados es: "+((double) sumaSecuencia()/listaNumeros.length));
    }
}
