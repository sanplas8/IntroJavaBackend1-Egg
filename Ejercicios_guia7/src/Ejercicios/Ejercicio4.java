/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Rectangulos;

/**
 *
 * @author toto_
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulos rectangulo1 = new Rectangulos();
        
        System.out.println(" ------Construyendo rectangulos----- \n"+
                "Ingrese la base y altura del rectangulo a crear");
        rectangulo1.crearRectangulo();
        rectangulo1.calculaSuperficie();
        rectangulo1.calculaPerimetro();
        System.out.println("Su rectangulo se vera asi: \n");
        rectangulo1.dibujaRectangulo();
    }
    
}
