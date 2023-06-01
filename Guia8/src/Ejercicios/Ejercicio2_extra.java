/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.NIF;
import Servicios.NIFServicio;

/**
 *
 * @author toto_
 */
public class Ejercicio2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicio nifServ = new NIFServicio();

        NIF nuevo1 = nifServ.crearNif();

        System.out.println("==========================");

        nifServ.mostrar(nuevo1);
        
        mostrarDni2(nuevo1);
        
       
    }
    
    public static void mostrarDni2(NIF valor){
        for (int i = 0; i < 8; i++) {
            System.out.print(valor.getDni2()[i]+" ");
        }
    }

}
