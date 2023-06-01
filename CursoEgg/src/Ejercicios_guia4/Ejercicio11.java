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
public class Ejercicio11 {

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
            StringBuilder cadenaCodificada= new StringBuilder();
            for (int i = 0 ; i < cadena.length() ; i++){
                char caracter = cadena.charAt(i);
                switch (caracter){
                    case 'a':
                    case 'A':
                        
                        cadenaCodificada.append('@');
                        break;
                    case 'e':
                    case 'E':
                        
                        cadenaCodificada.append('#');
                        break;
                    case 'i':
                    case 'I':
                        
                        cadenaCodificada.append('$');
                        break;
                    case 'o':
                    case 'O':
                        
                        cadenaCodificada.append('%');
                        break;
                    case 'u':
                    case 'U':
                        
                        cadenaCodificada.append('*');
                        break;    
                    default:
                        cadenaCodificada.append(caracter);
                }
            }
            return cadenaCodificada.toString();    
        }
    
}
