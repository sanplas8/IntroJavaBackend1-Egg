/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Libro;
import Servicios.LibroServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        LibroServicio ns = new LibroServicio();
        String opcion = "";

        do {
            System.out.println("-----Menu----- \n"
                    + "Ingrese una opcion del menu: \n"
                    + "1- Agregar un libro a la libreria: \n"
                    + "2- Prestar un libro \n"
                    + "3- Recibir una devolucion \n"
                    + "4- Mostrar listado disponibles \n"
                    + "5- Salir"
                    + " \n"
                    + "Opcion: ");

            opcion = leerValores.next();
            leerValores.nextLine();
            switch (opcion) {
                case "1":
                    ns.agregarLibro();
                    break;
                case "2":
                    ns.prestarLibro();
                    break;
                case "3":
                    ns.devolverLibro();
                    break;
                case "4":
                    ns.mostrar();
                    break;
                case "5":
                    System.out.println("Muchas gracias \n"
                            + "-----Su lista final luego de los cambios-----");
                    ns.mostrar();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!opcion.equalsIgnoreCase("5"));
        
        
        
        
        
        
        
        
    }
}
