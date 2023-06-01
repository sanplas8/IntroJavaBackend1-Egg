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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese una frase: ");
        Scanner leerFrase = new Scanner(System.in);
        String frase = leerFrase.next();
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
