/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class AlumnoServicio {

    private Scanner leerValores;
    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();
    }

    public Alumno crearAlumnos() {
        System.out.println("Ingrese el nombre del alumno: ");
        String alumno = leerValores.next();
        System.out.println("Ingrese las notas del alumno: ");
        ArrayList<Double> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la " + (i + 1) + "° nota del alumno " + alumno);
            double nota = leerValores.nextDouble();
            while (nota < 0 || nota > 10) {
                System.out.println("La nota ingresada es incorrecta, debe ingresar una nota valida entre 0 y 10");
                nota = leerValores.nextDouble();
            }
            notas.add(nota);
        }
        return new Alumno(alumno, notas);
    }

    public void agregarAlumno() {
        System.out.println("-----Curso Egg turno tarde-----");
        String respuesta = "";
        do {
            alumnos.add(crearAlumnos());
            System.out.println("Desea agregar mas alumnos? (si/no)");
            respuesta = leerValores.next();
            while (!(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("no"))) {
                System.out.println("Respuesta incorrecta \n"
                        + "Intente nuevamente: ");
                respuesta = leerValores.next();
            }
        } while (respuesta.equalsIgnoreCase("si"));
    }

    public void notaFinal() {
        String respuesta = "";
        do {
            double sumaNotas = 0;
            double notaPromedioFinal = 0;
            int cont = 0;
            System.out.println("-----Calculando nota final curso-----");
            System.out.println("Ingrese el nombre del alumno del que desea calcular su nota final");
            String alumno = leerValores.next();
            for (Alumno alumno1 : alumnos) {
                if (alumno1.getNombre().equalsIgnoreCase(alumno)) {
                    for (int i = 0; i < alumno1.getNotas().size(); i++) {
                        sumaNotas += alumno1.getNotas().get(i);
                        cont++;
                        while (cont == 3) {
                            notaPromedioFinal = sumaNotas / alumno1.getNotas().size();
                            System.out.println("La nota promedio del alumno " + alumno + " es: " + notaPromedioFinal);
                            break;
                        }
                    }
                }
            }
            if (cont == 0) {
                System.out.println("El alumno no se encuentra en este curso");
            }
            System.out.println("Desea consultar mas alumnos? (si/no)");
            respuesta = leerValores.next();
            while (!(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("no"))) {
                System.out.println("Respuesta incorrecta \n"
                        + "Intente nuevamente: ");
                respuesta = leerValores.next();
            }
        } while (respuesta.equalsIgnoreCase("si"));
        
    }
}
