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
public class Ejercicio2_practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreUsuario;
        Scanner inputNombreUsuario = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre completo: ");
        nombreUsuario = inputNombreUsuario.nextLine();
        
        System.out.println("El nombre de usuario ingresado es: " + nombreUsuario);
    }
    
}
