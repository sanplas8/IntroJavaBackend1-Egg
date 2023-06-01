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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Por favor rellene la matriz con numeros enteros del 1 al 9");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                do{
                    System.out.println("Ingrese el valor para el indice "+i+","+j);
                    matriz[i][j] = leerValores.nextInt();
                    if(matriz[i][j] < 1 || matriz[i][j] > 9){
                        System.out.println("Numero ingresado fuera de rango, vuelva a intentar");
                    }
                }while(matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
        String aux;
        System.out.println("Matriz: ");
        for (int [] fila : matriz){
            aux = "";
            for (int elemento : fila){
                aux  += " " + elemento;
                
            }
            System.out.println(aux);
        }
        int sumaDiag1 = 0, sumaFilas=0 , sumaColumnas = 0 , sumaDiag2 = 0;
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j += 3){
                sumaDiag1 += matriz[i][j+i];
            }
        }
        for (int i = 0 ; i < 3 ; i++){
            sumaFilas = 0;
            for (int j = 0 ; j < 3 ; j++){
                sumaFilas += matriz[i][j];
            }
            if (sumaFilas != sumaDiag1){
                break;
            }
        }
        if (sumaDiag1 == sumaFilas){
            for (int i = 0 ; i < 3 ; i++){
            sumaColumnas = 0;
                for (int j = 0 ; j < 3 ; j++){
                    sumaColumnas += matriz[j][i];
                }
                if (sumaColumnas != sumaDiag1){
                    break;
                }
            }
        }

        if (sumaDiag1 == sumaFilas && sumaDiag1 == sumaColumnas){
            for (int i = 0 ; i < 3 ; i++){
                for (int j = 2 ; j > 0 ; j-=2){
                    sumaDiag2 += matriz[i][j-i];
                }
            }
        }
        
        if(sumaDiag1 == sumaFilas && sumaDiag1 == sumaColumnas && sumaDiag1 == sumaDiag2){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
    }
    
}
