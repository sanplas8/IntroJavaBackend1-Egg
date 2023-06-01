/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Servicios.PerroServicio;

/**
 *
 * @author toto_
 */
public class Ejercicio1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroServicio perroServ = new PerroServicio();
        
        perroServ.fabricaPerros();
        perroServ.mostrarPerro();
        perroServ.quitarPerro();
        
    }
    
}
