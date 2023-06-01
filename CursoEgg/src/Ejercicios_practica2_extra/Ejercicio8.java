/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practica2_extra;
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
        Scanner leerValores = new Scanner(System.in);
        int num, pares = 0 , impares = 0 ,contador = 1;
        System.out.println("Ingrese a continuacion numeros enteros, el mismo  se detendra al ingresar un multiplo de 5 \n"+
                           "========================================================================================== \n"+
                "");
        do {
            System.out.print("Ingrese por favor el "+contador+"° numero: ");
            num = leerValores.nextInt();
            if (num%2 == 0){
                pares += 1;
                contador += 1;
            }else {
                impares += 1;
                contador +=1;
            }
        }while (num%5 != 0);
        System.out.println("\n"+
                "La cantidad de numeros ingresados fue de:  "+(contador-1)+ "\n"+
                "\n"+
                "La cantidad de numeros pares: "+pares+ "\n"+
                        "\n"+
                "Y la cantidad de impares: "+impares+"\n"+
                "\n");
    }
    
}
