/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Circunferencia;

/**
 *
 * @author toto_
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" -----Creando una circunferencia-----  \n");
        Circunferencia circulo1 = new Circunferencia(0);
        
        circulo1.crearCircunferencia();
        
        System.out.println("======================= \n");
        
        circulo1.area();
        circulo1.perimetro();
    }
    
}
