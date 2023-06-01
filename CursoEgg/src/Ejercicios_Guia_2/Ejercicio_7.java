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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al consultor de numero de serie de bombas");
        int tipoMotor;
        Scanner leerTipoMotor = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero de serie de su motor para saber a que tipo de bomba corresponde");
        System.out.print("Numero de serie: ");
        
        do{
        tipoMotor = leerTipoMotor.nextInt();    
            switch (tipoMotor ){
                 case 1:
                     System.out.println("Segun su numero de serie su bomba corresponde a una bomba de agua");
                     break;
                 case 2:
                     System.out.println("Segun su numero de serie su bomba corresponde a una bomba de gasolina");
                     break;
                 case 3:
                     System.out.println("Segun su numero de serie su bomba corresponde a una bomba de hormigon");
                     break;    
                 case 4:
                     System.out.println("Segun su numero de serie su bomba corresponde a una bomba alimenticia");
                     break;
                 default:
                     System.out.println("No existe un valor válido para tipo de bomba, intente nuevamente");
                     System.out.print("Numero de serie: ");
                     break;
            }
        }while (tipoMotor < 1 || tipoMotor > 4);
                
    }
    
}
