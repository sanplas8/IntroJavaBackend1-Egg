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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese por favor un tiempo en minutos: ");
        Scanner leerMinutos = new Scanner(System.in);
        int minutos = leerMinutos.nextInt();
        double dias = (int) minutos / 1440;
        double horas = (int) (minutos - 1440)/60;
        
        if (dias >= 1){
            System.out.println("Segun la cantidad de minutos ingresados nos arroja que la conversion a dias y horas es: "+Math.round(dias)+" dias y "+Math.round(horas)+" horas");
        }else {
            horas = (int) minutos / 60;
            System.out.println("Segun la cantidad de minutos ingresados nos arroja que la conversion a dias y horas es: "+Math.round(dias)+" dias y "+Math.round(horas)+" horas");
        }
        
    }
    
}
