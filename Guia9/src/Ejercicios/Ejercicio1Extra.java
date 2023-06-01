/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Calendario;
import Servicios.CalendarioServicio;

/**
 *
 * @author toto_
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalendarioServicio calServ = new CalendarioServicio();
        Calendario nuevoCalendario = new Calendario();
        
        calServ.adivinarMes(nuevoCalendario);
        
       
    }
    
}
