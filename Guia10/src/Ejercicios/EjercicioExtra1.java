/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Servicios.NumerosServicio;

/**
 *
 * @author toto_
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumerosServicio ns = new NumerosServicio();
        
        ns.agregarSecuencia();
        ns.mostrarSecuencia();
        ns.mediaSecuencia();
    }
    
}
