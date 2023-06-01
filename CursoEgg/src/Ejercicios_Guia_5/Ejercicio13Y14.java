/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia_5;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio13Y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] equipo94 = new String[8];
        for (int i = 0 ; i < 8 ; i++){
            Scanner leerValores = new Scanner(System.in);
            System.out.println("Ingrese el nombre completo del companiero "+(i+1));
            equipo94[i] = leerValores.nextLine();
        }
        
        for (int i = 0 ; i < 8 ; i++){
            System.out.print("["+equipo94[i]+"]");
        }
        System.out.println("");
    }
    
}
