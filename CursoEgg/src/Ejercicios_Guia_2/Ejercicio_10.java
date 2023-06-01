/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia_2;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese 4 numeros enteros entre 1 y 20");
        Scanner leerNumeros = new Scanner(System.in);
       
        for ( int i = 0 ; i < 4 ; i++){
            System.out.print("Numero: ");
            int num = leerNumeros.nextInt();
            if (num < 1 || num > 20){
                System.out.println("Numero ingresado fuera de rango vuelva a intentar");
                System.out.print("Reingrese el numero: ");
                num = leerNumeros.nextInt();
            }
            System.out.print(num);
            for (int j = 0 ; j < num ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
