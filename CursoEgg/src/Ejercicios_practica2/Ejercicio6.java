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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor ingrese dos numeros enteros");
        Scanner leerNumeros = new Scanner(System.in);
        Scanner leerRespuesta = new Scanner(System.in);
        String menu = "--- Menu --- \n"+
                "1- Sumar \n"+
                "2- restar \n"+
                "3- Multiplicar \n"+
                "4- Dividir \n"+
                "5- Salir \n"+
                "Elija opcion: ";
        
        int num1 = leerNumeros.nextInt();
        int num2 = leerNumeros.nextInt();
        String respuesta = "no";
        int opcion;
        
        do {
            System.out.println("Usted ingreso los siguientes numeros: "+num1+" y "+num2);
            System.out.println("Elija una opcion del siguiente menu");
            System.out.println(menu);
            opcion = leerNumeros.nextInt();
            if (opcion >= 1 && opcion <=5){
                switch (opcion){
                    case 1:
                        int suma = num1 + num2;
                    System.out.println("La suma de los numeros ingresados es: "+suma);
                    System.out.println("============================");
                    break;
                    case 2:
                        int resta = num1 - num2;
                    System.out.println("La resta de los numeros ingresados es: "+resta);
                    System.out.println("============================");
                    break;
                    case 3:
                        int multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion de los numeros ingresados es: "+multiplicacion);
                    System.out.println("============================");
                    break;
                    case 4:
                        float division = (float)num1 / (float)num2;
                    System.out.println("La division de los numeros ingresados es: "+division);
                    System.out.println("============================");
                    break;
                    case 5:
                        System.out.println("Esta seguro que desea salir del programa (s/n)?");
                        respuesta = leerRespuesta.nextLine();
                }
            }else {
                System.out.println("Respuesta incorrecta, vuelva a intenar");
            }
        }while (respuesta.equalsIgnoreCase("s")== false);
    }
    
}
