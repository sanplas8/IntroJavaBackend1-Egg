/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra_Guia5;
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
        int [] vector = new int [4];
        rellenaArray(vector);
        muestraArray(vector);
    }
    
    public static void rellenaArray(int [] array){
        for(int i = 0 ; i < array.length ; i++){
            array[i] = (int) (Math.random()*10+1);
        }
    }
    
    public static void muestraArray(int [] array){
        String aux = "";
        for(int elemento:array){
              aux = aux+" "+elemento;      
        }
        System.out.println("Vector :");
        System.out.println(aux);
    }
    
}
