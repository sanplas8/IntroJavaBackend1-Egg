/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra;

import Entidades_Extra.Cancion;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        Cancion cancion1 = new Cancion("We'll be back", "Megadeth");
        Cancion cancion2 = new Cancion();
        
        cancion2.setTitulo("Master of Puppets"); cancion2.setAutor("Metallica");
        
        System.out.println(cancion1);
        System.out.println(cancion2);
    }
    
}
