/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practica1;

 import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio1_practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputNum1 = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Por favor ingrese el primer numero: ");
        num1 = Integer.parseInt(inputNum1.next());
        Scanner inputNum2 = new Scanner(System.in);
        System.out.print("Por favor ingrese el segundo numero: ");
        num2 = Integer.parseInt(inputNum2.next());
        
        int resultado = num1 + num2;
        
        System.out.println("El resultado de la suma entre " +num1+ " y "+ num2+ " es: "+ resultado);
        
    }
    
}
