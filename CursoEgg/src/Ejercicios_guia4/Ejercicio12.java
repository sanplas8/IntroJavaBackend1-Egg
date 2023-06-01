/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_guia4;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValor = new Scanner(System.in);
        System.out.println("Por favor ingrese dos numeros");
        System.out.print("Primer numero: ");
        int num1 = leerValor.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = leerValor.nextInt();
        
        esMultiplo(num1,num2);
    }
    public static void esMultiplo(int numero1,int numero2){
        if (numero1%numero2 == 0){
            System.out.println("El primer numero es multiplo del segundo");
        }else{
            System.out.println("El primer numero no es multiplo del segundo");
        }
    }
}
