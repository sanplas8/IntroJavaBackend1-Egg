/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_preactica3;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio1 {

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
                        
                    System.out.println("La suma de los numeros ingresados es: "+sumarValores(num1,num2));
                    System.out.println("============================");
                    break;
                    case 2:
                        
                    System.out.println("La resta de los numeros ingresados es: "+restarValores(num1,num2));
                    System.out.println("============================");
                    break;
                    case 3:
                        
                    System.out.println("La multiplicacion de los numeros ingresados es: "+multiplicaValores(num1,num2));
                    System.out.println("============================");
                    break;
                    case 4:
                        
                    System.out.println("La division de los numeros ingresados es: "+divideValores(num1,num2));
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
    public static int sumarValores(int numero1,int numero2){
        int suma = numero1+numero2;
        return suma;
    }
    public static int restarValores(int numero1,int numero2){
        int resta = numero1-numero2;
        return resta;
    }
    public static int multiplicaValores(int numero1,int numero2){
        int multiplicacion = numero1*numero2;
        return multiplicacion;
    }
    public static float divideValores(int numero1,int numero2){
        float division = (float) numero1/numero2;
        return division;
    }
}
