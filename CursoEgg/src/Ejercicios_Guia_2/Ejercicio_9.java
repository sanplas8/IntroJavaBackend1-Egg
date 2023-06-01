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
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor ingrese un maximo de 20 numeros, ingrese 0 para terminar");
        Scanner leerNumIngresado = new Scanner(System.in);
        int contador = 1, suma = 0, num;
        
        
        do{
            System.out.print("Ingrese numero "+contador+": ");
            num = leerNumIngresado.nextInt();
            if (num > 0){
                suma += num; 
            }
            contador += 1;
            
        }while ((num != 0) || (contador == 20));
        System.out.println("La suma de los numeros ingresados es: "+suma);
    }
    
}
