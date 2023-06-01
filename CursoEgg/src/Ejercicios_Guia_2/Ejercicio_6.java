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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 , num2 ;
        System.out.println("Por favor ingrese 2 numeros enteros");
        Scanner leerNumero = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = leerNumero.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = leerNumero.nextInt();
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos numeros ingresados son mayor a 25");
        }else if (num1 > 25 || num2 > 25){
            System.out.println("Solo uno de los numeros ingresados es mayor a 25");
            if (num1 > 25){
                System.out.println("Ese numero es: "+num1);
            }else if (num2 > 25){
                System.out.println("Ese numero es: "+num2);
            }
        }else {
                System.out.println("Ninguno de los numeros ingresados es mayor a 25");
            }
            
    }
    
}
