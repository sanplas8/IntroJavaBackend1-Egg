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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor ingrese la nota obtenida en su examen");
        Scanner leerNota = new Scanner(System.in);
        System.out.print("Nota: ");
        int nota = leerNota.nextInt();
        
        while (nota < 0 || nota > 10){
            System.out.println("La nota ingresada no esta en el rango esperado entre 0 y 10");
            System.out.print("Ingrese nuevamente la nota: ");
            nota = leerNota.nextInt();
        }
        System.out.println("Muchas gracias por su tiempo");
        
        
    }
    
}
