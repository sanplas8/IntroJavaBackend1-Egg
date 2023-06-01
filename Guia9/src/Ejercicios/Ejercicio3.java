/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Servicios.ArregloService;

/**
 *
 * @author toto_
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] a = new double [50];
        double [] b = new double [20];
        
        ArregloService.inicializarA(a);
        ArregloService.mostrar(a);
        ArregloService.ordenar(a);
        ArregloService.inicializarB(b, a);
        ArregloService.mostrar(a);
        ArregloService.mostrar(b);
        
        
    }
    
}
