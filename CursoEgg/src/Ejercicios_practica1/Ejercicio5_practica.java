/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practica1;
//import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio5_practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num , doble , triple ;
        double raizCuadrada;
        System.out.print("Por favor introduzca un numero entero: ");
        Scanner leerInputNumero = new Scanner(System.in);
        num = leerInputNumero.nextInt();
        
        doble = num *2;
        triple = num * 3;
        raizCuadrada = Math.sqrt(num);
        
        System.out.println("El doble del numero ingresado es: " + doble + ", el triple del numero ingresado es: " + triple + " y la raiz cuadrada del numero ingresado es: " + raizCuadrada);
    }
    
}
