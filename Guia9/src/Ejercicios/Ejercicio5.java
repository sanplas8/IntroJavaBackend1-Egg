/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        PersonaService perServ = new PersonaService();
        Persona persona1 = perServ.crearPersona();
        System.out.println("Ingrese una edad a comparar: ");
        int edad = leerValores.nextInt();
        System.out.println("La edad de "+persona1.getNombre()+" es: "+perServ.calcularEdad(persona1));
        System.out.println("La Persona es menor que la edad ingresada?: "+perServ.menorQue(persona1, edad));
        perServ.mostrar(persona1);
        
    }
    
}
