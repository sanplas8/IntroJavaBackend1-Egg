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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Por favor ingrese el tama;o de los vectores");
        int n = leerValores.nextInt();
        //int [] vector1 = new int [n],vector2 = new int [n];
        int [] vector1 = {4,3,2,1,},vector2 = {4,3,2,1};
        //for(int i = 0 ; i < n ; i++){
        //    vector1[i] = (int)(Math.random()*10+1);
        //}
        System.out.println("Vector 1: ");
        String aux = "";
        for(int elemento:vector1){
            aux = aux +" ["+ elemento+"]";
        }
        System.out.println(aux);
        
        //for(int i = 0 ; i < n ; i++){
        //    vector2[i] = (int)(Math.random()*10+1);
        //}
        System.out.println("Vector 1: ");
        aux = "";
        for(int elemento:vector2){
            aux = aux +" ["+ elemento+"]";
        }
        System.out.println(aux);
        
        for(int i = 0 ; i < n ; i++){
            if(vector1[i]  != vector2[i]){
                System.out.println("Los Vectores no son iguales");
                break;
            }else if(i == n-1){
                System.out.println("Los Vectores son iguales");
            }
        }
    }
    
}
