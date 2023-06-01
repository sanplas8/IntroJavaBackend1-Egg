package Mains;

import Entidades.Persona;
import Servicios.PersonaServicio;

/*
 
 */

/**
 *
 * @author toto_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona persona1 = ps.crearPersona();
        Persona persona2 = ps.crearPersona();
        System.out.println(persona1+" \n"+
                persona2);
        
    }
    
}
