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
public class Ejercicio4y5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [][] matriz = new int[3][3];
        int [][] traspuesta = new int [3][3];
        int [][] matriz = {{0,-2,4},{-2,0,2},{-4,-2,0}};
        System.out.println("Por favor ingrese los valores de la matriz");
        Scanner leerValores = new Scanner(System.in);
        //for (int i = 0 ; i < 3 ; i++){
        //   for (int j = 0 ; j < 3 ; j++){
        //        System.out.println("Ingrese el valor de la posicion ["+i+"] ["+j+"]");
        //        matriz[i][j] = leerValores.nextInt();
        //    }
        //}
        String aux;
        System.out.println("Matriz: ");
        for (int [] fila : matriz){
            aux = "";
            for (int elemento : fila){
                aux  += " " + elemento;
            }
            System.out.println(aux);
        }
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                traspuesta[i][j] = matriz[j][i];
            }
        }
        
        System.out.println("Traspuesta: ");
        for (int [] fila : traspuesta){
            aux = "";
            for (int elemento : fila){
                aux  += " " + elemento;
            }
            System.out.println(aux);
        }
        int cont = 0;
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if(matriz[i][j] != traspuesta[i][j]*-1){
                    cont += 1;
                    break;
                }
            }
            if(cont > 0){
                System.out.println("La matriz no es antisimetrica");
                break;
            }else if (cont == 0 && i == 2){
                System.out.println("La matriz es antisimetrica");
            }
        }
         
        
    }
    
}