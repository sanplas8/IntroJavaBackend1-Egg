/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Operacion;
import java.util.Scanner;



/**
 *
 * @author toto_
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion operacion1 = new Operacion();
        
        System.out.println(" -----Operaciones Basicas----- \n"+
                "Ingrese por favor dos numeros para comenzar");
        
        operacion1.crearOperacion();
        
        int opcion;
        
        System.out.println("Ingrese por favor la operacion que quiere realizar \n"+
                "1- Suma \n"+
                "2- Resta \n"+
                "3- Multiplicacion \n"+
                "4- Division \n"+
                " \n"+
                "Opcion: ");
        Scanner leerValores = new Scanner(System.in);
        opcion = leerValores.nextInt();
        
        switch(opcion){
            case 1:
                operacion1.sumar();
                break;
            case 2:
                operacion1.restar();
                break;
            case 3:
                operacion1.multiplicacion();
                break;
            case 4:
                operacion1.division();
                break;
            default :
                System.out.println("Opcion incorrecta");
        }
        
    }
    
}
