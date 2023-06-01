
package Ejercicios_practica2_extra;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese una letra");
        Scanner leerLetra = new Scanner(System.in);
        String letra = leerLetra.next();
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}
