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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor ingrese un numero entero: ");
        Scanner leerNumero = new Scanner(System.in);
        int numTope = leerNumero.nextInt();
        System.out.println("Ahora ingrese numeros hasta que la suma de estos supere el tope del numero inicial introducido");
        int suma = 0;
        for (int i = 1 ; i < numTope+2 ; i++){
            int num = leerNumero.nextInt();
            suma += num;
            if (suma > numTope){
                break;
            }
        }
        System.out.println("La suma de los numeros introducidos es "+suma+" y supera el limite tope de "+numTope);
    }
    
}
