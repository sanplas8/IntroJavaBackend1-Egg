/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author toto_
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        
        Date fechaNac = fs.fechaDeNacimiento();
        Date fechaAct = fs.fechaActual();
        
        System.out.println("Usted tiene "+fs.diferencia(fechaNac, fechaAct)+" anios");
        
        
    }
    
}
    