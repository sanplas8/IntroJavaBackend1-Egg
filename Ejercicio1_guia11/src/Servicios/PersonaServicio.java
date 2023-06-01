/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class PersonaServicio {
    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("------Ingrese sus datos-----");
        System.out.print("Ingrese su nombre: ");
        String nombre = leerValores.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = leerValores.next();
        System.out.print("Ingrese su edad: ");
        int edad = leerValores.nextInt();
        System.out.print("Ingrese su dni: ");
        int dni = leerValores.nextInt();
        System.out.print("Indiquenos el perro que desearia tener: \n");
        PerroServicio ps = new PerroServicio();
        Perro mascota = ps.crearPerro();
        return new Persona(nombre, apellido, edad, dni, mascota);
    }
}
