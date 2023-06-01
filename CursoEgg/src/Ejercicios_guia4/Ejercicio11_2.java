/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_guia4;

import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Ejercicio11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase: ");
        String frase = leerDato.nextLine();
        System.out.println(codificarCadena(frase));
    }
    
        public static String codificarCadena(String cadena){
            String cadenaCodificada = cadena;
            for (int i = 0 ; i < cadena.length() ; i++){
                char caracter = cadena.charAt(i);
                switch (caracter){
                    case 'a':
                    case 'A':
                        
                        cadenaCodificada = "@";
                        break;
                    case 'e':
                    case 'E':
                        
                        cadenaCodificada = "#";
                        break;
                    case 'i':
                    case 'I':
                        
                        cadenaCodificada = "$";
                        break;
                    case 'o':
                    case 'O':
                        
                        cadenaCodificada = "%";
                        break;
                    case 'u':
                    case 'U':
                        
                        cadenaCodificada = "*";
                        break;    
                    default:
                        cadenaCodificada = cadena.substring(i, i++);
                }
            }
            return cadenaCodificada;    
        }
    
}
