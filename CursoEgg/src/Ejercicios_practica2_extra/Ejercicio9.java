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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Division con restas sucecivas \n"+
                "\n"+
                           "============================= \n"+
                "\n");
        System.out.print("Por favor ingrese el dividendo: ");
        Scanner leerValores = new Scanner(System.in);
        int dividendo = leerValores.nextInt();
        System.out.print("Ahora ingrese el divisor: ");
        int divisor = leerValores.nextInt();
        int cociente = 0;
        System.out.println("\n"+
                "=================================="+
                "\n"+
                "Usted ingreso "+dividendo+" como dividendo y "+divisor+" como divisor \n"+
                "\n"+
                "===================================================================== \n"+
                "\n");
        do{
            dividendo -= divisor;
            cociente += 1;
        }while(dividendo >= divisor);
        System.out.println("El cociente de la division con restas sucesivas para los numeros ingresados es: "+cociente+" y el residuo es "+dividendo);
    }
    
}
