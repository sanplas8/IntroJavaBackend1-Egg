/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author toto_
 */
public class Ejercicio1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio ecuServ = new RaicesServicio();
        
        Raices ecuacion1 = ecuServ.crearEcuacion();
        
        
        System.out.println("El discriminante es: "+ecuServ.obtenDiscriminante(ecuacion1)+" \n"+
                "========================================");
        
        
        
        ecuServ.calcular(ecuacion1);
    }
    
}
