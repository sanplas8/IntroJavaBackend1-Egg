/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.util.Scanner;
import Entidades.Persona;
import static java.lang.Character.toUpperCase;

/**
 *
 * @author toto_
 */
public class PersonaServicios {
    Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
    
    public boolean esMayorDeEdad(Persona personaje){
        return personaje.getEdad()>=18;
    }
    
    public Persona crearPersona(){
        System.out.println("-----Creando Personaje----- \n"+
                "Ingrese los datos que se le piden a continuacion");
        System.out.print("Ingrese nombre del personaje: ");
        String nombre = leerValores.next();
        System.out.print("Ingrese Sexo del personaje (H, para hombre, M, para mujer y O para otro):");
        String sexo = leerValores.next();
        
        while(!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")){
            System.out.print("El dato ingresado no es correcto. Intente nuevamente: ");
            sexo = leerValores.next();
        }
        
        System.out.print("Ingrese edad del personaje: ");
        int edad = leerValores.nextInt();
        System.out.print("Ingrese la nacionalidad del personaje: ");
        String nacionalidad = leerValores.next();
        System.out.print("Ingrese la altura del personaje en mts: ");
        double altura = leerValores.nextDouble();
        System.out.print("Ingrese el peso del personaje kg: ");
        double peso = leerValores.nextDouble();
        return new Persona(nombre, edad, sexo, altura, peso, nacionalidad);
    }
    
    public int calcularIMC(Persona personaje){
        if((double)personaje.getPeso()/(Math.pow(personaje.getAltura(), 2)) < 20){
            return -1;
        }else if((double)personaje.getPeso()/(Math.pow(personaje.getAltura(), 2)) >= 20 && (double)personaje.getPeso()/(Math.pow(personaje.getAltura(), 2)) <= 25){
            return 0;
        }else{
            return 1;
        }
    }
    
}
