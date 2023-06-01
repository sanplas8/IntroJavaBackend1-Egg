/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class CursoServicio {

    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {
        System.out.println("Ingrese a continuacion los alumnos del curso ");
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1));
            alumnos[i] = leerValores.next();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        System.out.println("Ingrese nombre del curso: ");
        String curso = leerValores.next();
        System.out.println("Ingrese la duracion del curso en horas por dia: ");
        int cantHorasDia = leerValores.nextInt();
        System.out.println("Ingrese la duracion del curso en dias a la semana: ");
        int cantDiasSemana = leerValores.nextInt();
        System.out.println("Ingrese el turno en que se dicta el curso (Tarde/Maniana): ");
        String turno = leerValores.next();
        System.out.println("Ingrese el valor por hora: ");
        double precioHora = leerValores.nextDouble();
        String [] alumnos = cargarAlumnos();
        
        return new Curso(curso, cantHorasDia, cantDiasSemana, turno, precioHora, alumnos);
        
    }
    
    public double calcularGananciaSemanal(Curso cursada){
        return cursada.getCantHorasDia()*cursada.getPrecioHora()*cursada.getAlumnos().length*cursada.getCantDiasSemana();
    }

}
