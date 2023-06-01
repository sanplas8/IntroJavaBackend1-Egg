/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_preactica3;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor ingrese un numero para saber si el mismo es primo o no: ");
        Scanner leerValores = new Scanner(System.in);
       
        int num = leerValores.nextInt();
        
        if(esPrimo(num)){
            System.out.println("El numero ingresado es un numero primo");
        }else{
            System.out.println("El numeo ingresado no es un numero primo");
        }
        
    }
    public static boolean esPrimo(int numero){
        boolean esPrimo;
        int cont = 0;
        
        for(int i = 1; i < numero+1;i++){
            while(numero%i==0){
                cont += 1;
                break;
            }
        }
        esPrimo = (cont==2);
        
        return esPrimo;
    }
    
}
