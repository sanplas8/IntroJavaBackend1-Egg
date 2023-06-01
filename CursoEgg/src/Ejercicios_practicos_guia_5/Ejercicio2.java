/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practicos_guia_5;
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
        System.out.println("Por favor indique el tamanio del vector");
        Scanner leerValores = new Scanner(System.in);
        int [] vector = new int[leerValores.nextInt()];
        
        for (int i = 0 ; i < vector.length ; i++){
            vector[i] =  (int) (Math.random() * 20+1);
        }
        
        System.out.println("Por favor ingrese un numero del 1 al 10 para saber si se encuentra en el vector");
        int numBusca = leerValores.nextInt();
        int pos = -1, rep = 0;
        for (int elemento:vector){
            pos += 1;
            if (elemento == numBusca){
                System.out.println("El numero se encontro en la posicion "+pos);
                
                rep += 1;
            }
                       
        }
        if (rep > 1){
            System.out.println("Y se repite "+rep+" veces");
            
        }else{
            System.out.println("Sin repetirse");
        }
        
        System.out.println("Vector conformado por los numeros");
        for (int i = 0 ; i < vector.length ; i++){
        
        System.out.print(vector[i]+" ");
    }
        System.out.println("");
        
    }
    
}
