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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leerValor = new Scanner(System.in);
        String respuesta;
        do{
            System.out.println("Por favor ingrese el nombre y la edad de una persona");
            datosPersonas();
            System.out.print("Desea seguir ingresando datos? \n"+
                    "(si/no): ");
            respuesta = leerValor.next();
            if (respuesta.equalsIgnoreCase("si")){
                System.out.println("Continuemos \n"+
                        "\n");
            }else{
            System.out.println("Gracias por haber participado");
        }
        }while (respuesta.equalsIgnoreCase("si"));
    }
    public static void datosPersonas(){
        Scanner leerValores = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = leerValores.nextLine();
        System.out.print("Edad: ");
        int edad = leerValores.nextInt();
        
        if (edad >= 18){
             System.out.println("El nombre de la persona ingresada es: "+nombre+"\n"+
                "Su edad es: "+edad+"\n"+
                "Por lo tanto es mayor de edad"+        
                "\n");
        }else{
            System.out.println("El nombre de la persona ingresada es: "+nombre+"\n"+
                "Su edad es: "+edad+"\n"+
                "Por lo tanto es menor de edad"+        
                "\n");
        }
       
    }
    
}
