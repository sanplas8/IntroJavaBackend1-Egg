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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese una frase o palabra: ");
        Scanner leerFrase = new Scanner(System.in);
        String frase = leerFrase.nextLine();
        if (frase.startsWith("A") || frase.startsWith("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
