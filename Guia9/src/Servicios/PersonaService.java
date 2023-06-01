/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class PersonaService {
    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Ingrese los datos de la persona");
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leerValores.next();
        System.out.println("Ingrese el anio de nacimiento");
        int anio = leerValores.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leerValores.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leerValores.nextInt();
        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
        
        return new Persona(nombre, fechaNacimiento);
    }
    
    public int calcularEdad(Persona personaje){
        Date fechaActual = new Date();
        
        if(fechaActual.getMonth() < personaje.getFechaNacimiento().getMonth()){
            return ((fechaActual.getYear()-personaje.getFechaNacimiento().getYear())-1);
        }else{
            return fechaActual.getYear()-personaje.getFechaNacimiento().getYear();
        }
    }
    
    public boolean menorQue(Persona personaje, int edad){
            System.out.println("Ingrese una edad para comparar");
            
            return (calcularEdad(personaje) < edad  );
    }
    
    public void mostrar(Persona personaje){
        System.out.println("Persona = "+personaje.getNombre()+", Fecha de Nacimiento = "+personaje.getFechaNacimiento()+", Edad = "+calcularEdad(personaje));
    }
    
}
