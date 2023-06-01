/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practica1;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class VideoVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int[2];
        int [] producto = new int [3];
        
        int [] [] matriz = {{4,8,6},{2,1,7}};
        System.out.print("Por favor ingrese los valores del vector de tamanio "+vector.length+": ");
        Scanner leerValorVector = new Scanner(System.in);
        for (int i = 0; i < vector.length ; i++){
            System.out.print("v["+i+"]=");
            vector[i] = leerValorVector.nextInt();
            
        }
        
        int suma;
        for (int i = 0; i < matriz[0].length; i++){
            suma = 0;
            for (int j = 0; j < vector.length ; j++){
                suma += vector[j] * matriz[j][i];
            }
            producto [i] = suma;
            
        }
     
        
        
    }
    
}
