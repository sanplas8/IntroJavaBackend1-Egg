/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import Entidades.Estudiante;
import Servicios.EstudianteServicio;

/**
 *
 * @author toto_
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteServicio nuevoCurso = new EstudianteServicio();
        Estudiante [] curso = new Estudiante[8];
        
        for (int i = 0; i < curso.length; i++) {
            curso[i] = nuevoCurso.crearEstudiantes();
        }
        nuevoCurso.mostrarAlumnosArribaPromedio(curso);
    }
    
}
