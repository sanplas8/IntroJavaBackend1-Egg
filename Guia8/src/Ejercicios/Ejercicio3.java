/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import Entidades.Persona;
import Servicios.PersonaServicios;

/**
 *
 * @author toto_
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        PersonaServicios personaServ = new PersonaServicios();
        System.out.println("Ingrese la cantidad de personas a crear");
        Persona[] personas = new Persona[leerValores.nextInt()];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = personaServ.crearPersona();
        }
        
        int [] calcularIMC = new int [personas.length];
        boolean [] esMayorDeEdad = new boolean [personas.length];
        
        for (int i = 0; i < personas.length; i++) {
            calcularIMC[i] = personaServ.calcularIMC(personas[i]);
            esMayorDeEdad[i] = personaServ.esMayorDeEdad(personas[i]);    
        }
        System.out.println("Personas ingresadas...");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona "+(i+1)+": Nombre= "+personas[i].getNombre()+", Edad= "+personas[i].getEdad()+", Sexo= "+personas[i].getSexo().toUpperCase()+", Nacionalidad= "+personas[i].getNacionalidad()+
            ", Atura= "+personas[i].getAltura()+", Peso= "+personas[i].getPeso());
        }
        
        pesoBajo(calcularIMC);
        pesoAlto(calcularIMC);
        pesoIdeal(calcularIMC);
        mayoresDeEdad(esMayorDeEdad);
        
    }
    
    
    public static void pesoBajo(int [] IMC){
        int cont = 0;
        for (int i = 0; i < IMC.length ; i++) {
            if(IMC[i] == -1){
                cont++;
            }
        }
        System.out.println("El porcentaje de personas con bajo peso es de "+(((double) cont/IMC.length)*100)+"%");
    }
    public static void pesoAlto(int [] IMC){
        int cont = 0;
        for (int i = 0; i < IMC.length ; i++) {
            if(IMC[i] == 1){
                cont++;
            }
        }
        System.out.println("El porcentaje de personas con sobrepeso peso es de "+(((double) cont/IMC.length)*100)+"%");
    }
    public static void pesoIdeal(int [] IMC){
        int cont = 0;
        for (int i = 0; i < IMC.length ; i++) {
            if(IMC[i] == 0){
                cont++;
            }
        }
        System.out.println("El porcentaje de personas con peso ideal es de "+(((double) cont/IMC.length)*100)+"%");
    }
    public static void mayoresDeEdad(boolean [] mayores){
        int cont = 0;
        for (int i = 0; i < mayores.length ; i++) {
            if(mayores[i]){
                cont++;
            }
        }
        System.out.println("El porcentaje de personas mayores de edad es de "+(((double) cont/mayores.length)*100)+"%");
    }
    
}
