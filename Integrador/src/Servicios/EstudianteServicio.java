/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class EstudianteServicio {

    private final Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public Estudiante crearEstudiantes() {

        System.out.println("Ingrese nombre y nota del estudiante ");
        System.out.print("Estudiante: ");
        String nombre = leerValores.next();
        System.out.print("Nota: ");
        double nota = leerValores.nextDouble();
        while(nota < 1 || nota > 10){
            System.out.println("La nota debe estar entre 1 y 10");
            nota = leerValores.nextDouble();
        }

        return new Estudiante(nombre, nota);
    }

    public double mostrarPromedio(Estudiante[] curso) {
        double promedio;
        double suma = 0;
        
        
        for (Estudiante curso1 : curso) {
            suma += curso1.getNota();
        }
        promedio = suma / curso.length;
        System.out.println("La nota Promedio del curso es: "+promedio);
        return promedio;
        
    }

    public String[] alumnosArribaPromedio(Estudiante[] curso) {

        double promedio = mostrarPromedio(curso);
        int cont = 0;
        
        for (Estudiante curso1 : curso) {
            if (curso1.getNota() > promedio) {
                cont += 1;
            }
        }
        String[] arribaPromedio = new String[cont];

        int cont2 = 0;
        for (Estudiante curso1 : curso) {
            if (curso1.getNota() > promedio) {
                arribaPromedio[cont2] = curso1.getNombre();
                cont2 += 1;
            }
        }

        return arribaPromedio;
    }

    public void mostrarAlumnosArribaPromedio(Estudiante[] curso) {
        
        String[] arribaPromedio = alumnosArribaPromedio(curso);
        System.out.println("Los estudiantes que sacaron una nota arriba del promedio son: ");
        for (String arribaPromedio1 : arribaPromedio) {
            System.out.println(arribaPromedio1);
        }
    }

}
