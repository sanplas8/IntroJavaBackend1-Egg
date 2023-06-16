/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Persona;
import java.util.Scanner;

import Servicios.PersonaServicios;

/**
 *
 * @author toto_
 */
public class MAin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        PersonaServicios personaServ = new PersonaServicios();
        Persona nuevaPersona = new Persona();
        System.out.println(nuevaPersona.getEdad());
       
        try{
            System.out.println(personaServ.esMayorDeEdad(nuevaPersona));
        }catch(Exception e){
            
            System.out.println("No se ingreso la edad para que se ejecute correctamente el codigo");
        }finally{
            nuevaPersona.setEdad(20);
            System.out.println(personaServ.esMayorDeEdad(nuevaPersona));
        }
        
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
