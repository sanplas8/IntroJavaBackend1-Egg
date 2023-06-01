/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practica2;
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
        System.out.println("Ingrese un numero");
        System.out.print("Numero: ");
        Scanner leerNumero = new Scanner(System.in);
        int num = leerNumero.nextInt();
        if (num%2==0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado  es impar");
        }
    }
    
}
