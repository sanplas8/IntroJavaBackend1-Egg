/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Entidades.Alumno;
import Servicios.Simulador;
import java.util.ArrayList;

/**
 *
 * @author Sanplas8
 */
public class Main {

    public static void main(String[] args) {
       Simulador ns = new Simulador();
       ArrayList<Alumno> listadoAlumnos = ns.crearAlumnos();
       ns.mostrarAlumnos(listadoAlumnos);
       ns.mostrarVotaciones(ns.votacion(listadoAlumnos));
       ns.mostrarFacilitadores(listadoAlumnos);
       
    }
}
