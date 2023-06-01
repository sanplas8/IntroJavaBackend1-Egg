/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra_Guia5;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Por favor ingrese el tama;o del vector");
        int [] vector = new int [leerValores.nextInt()];
        
        for(int i = 0 ; i < vector.length ; i++){
            System.out.println("Por favor ingrese el valor del indice ["+i+"]");
            vector[i] = leerValores.nextInt();
        }
        System.out.println("Vector: ");
        String aux = "";
        for(int elemento:vector){
            aux = aux +" ["+ elemento+"]";
        }
        System.out.println(aux);
        
        int suma = 0;
        for(int elemento:vector){
            suma += elemento;
        }
        System.out.println("La suma de los valores de los elementos del vector es: "+suma);
    }
    
}
