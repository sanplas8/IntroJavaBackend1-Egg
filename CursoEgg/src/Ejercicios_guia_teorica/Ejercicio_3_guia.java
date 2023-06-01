/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_guia_teorica;

/**
 *
 * @author toto_
 */
public class Ejercicio_3_guia {
     public static void main(String[] args) {
        int num1 = 20;
        int num2 = 40;
        
        int mod = num2 % num1;
        int multi = num1 * num2;
        
        num1+=2;
        num2--;
        
        boolean respLog1 = num1 == num2;
        boolean respLog2 = num1 != num2;
        
        System.out.println("Los resultados son: " + num1);
         
    }
    
}
