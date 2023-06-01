/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Servicios.PeliculaServicio;

/**
 *
 * @author toto_
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio peliServ = new PeliculaServicio();
        peliServ.agregarPelicula();
        peliServ.mostrarPeliculas();
        peliServ.mostrarPelisMay1hs();
        peliServ.ordenarMayorDuracion();
        peliServ.ordenarMenorDuracion();
        peliServ.ordenarTitulo();
        peliServ.ordenarDirector();
        
    }
    
}
