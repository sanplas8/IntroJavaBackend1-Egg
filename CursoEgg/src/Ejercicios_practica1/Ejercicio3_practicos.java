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
public class Ejercicio3_practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        
        Scanner leerFrase = new Scanner(System.in);
        System.out.print("Por favor ingrese una frase: ");
        frase = leerFrase.nextLine();
        
        String fraseMayus = frase.toUpperCase();
        String fraseMinus = frase.toLowerCase();
        
        System.out.println("Su frase convertida a mayusculas es: " + fraseMayus);
        System.out.println("Su frase convertida a minusculas es: " + fraseMinus);
    }
    
}
