
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese por favor lado 1: ");
        Scanner leerLado = new Scanner(System.in);
        byte lado1 = leerLado.nextByte();
        System.out.print("Ingrese por favor lado 2: ");
        byte lado2 = leerLado.nextByte();
        String caracter = "*";
        for (int i = 0 ; i < lado1 ; i++){
            while (i == 0 || i == (lado1-1)){
                for (int j = 0 ; j < lado2 ; j++){
                    System.out.print(caracter);
                }
                break;
            }
            while (i >= 1 && i <= (lado1 - 2)){
                for (int k = 0 ; k < lado2 ; k++){
                    if (k == 0 || k == (lado2-1)){
                        System.out.print(caracter);
                    }else {
                        System.out.print(" ");
                    }
                }
                break;
            }
            System.out.println("");
        }
    }
    
}
