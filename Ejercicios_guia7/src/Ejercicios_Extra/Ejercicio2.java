/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra;

import Entidades_Extra.Puntos;

/**
 *
 * @author toto_
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos viaje1 = new Puntos();
        
        viaje1.crearPuntos();
        
        System.out.println("Usted viajara desde el punto (X = "+(int)viaje1.getX1()+",Y = "+(int)viaje1.getY1()+") hacia el punto (X = "+(int)viaje1.getX2()+",Y = "+(int)viaje1.getY2()+") \n"+
                "Y la distancia a recorrer es de "+(int) Math.round(viaje1.distancia())+"km");
    }
    
}
