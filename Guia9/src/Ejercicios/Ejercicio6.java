/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Curso;
import Servicios.CursoServicio;

/**
 *
 * @author toto_
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio curServ = new CursoServicio();
        Curso curso1 = curServ.crearCurso();
        
        System.out.println("La ganancia por cada curso dictado va a ser de: $"+curServ.calcularGananciaSemanal(curso1));
    }
    
}
