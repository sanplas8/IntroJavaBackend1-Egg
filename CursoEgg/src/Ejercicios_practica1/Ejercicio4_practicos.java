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
public class Ejercicio4_practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float gradosC , gradosF;
        Scanner leerGradosC = new Scanner(System.in);
        System.out.print("Por favor ingrese la cantidad de grados celsius que hace actualmente en su ciudad: ");
        gradosC = leerGradosC.nextFloat();
        
        gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println("La conversion a grados Farenheit es: " + gradosF);
    }
    
}
