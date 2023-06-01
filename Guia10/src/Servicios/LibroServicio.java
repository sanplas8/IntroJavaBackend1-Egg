/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class LibroServicio {
    
    private Scanner leerValores;
    private HashSet<Libro> conjuntoLibros;
    
    public LibroServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.conjuntoLibros = new HashSet();
    }
    
    public Libro crearLibro() {
        System.out.println("-----Creador de libros-----");
        System.out.print("Ingrese el titulo: ");
        String titulo = leerValores.next();
        System.out.print("Ingrese el Autor: ");
        String autor = leerValores.next();
        System.out.print("Ingrese stock: ");
        int ejemplares = leerValores.nextInt();
        return new Libro(titulo, autor, ejemplares);
    }
    
    public void agregarLibro() {
        System.out.println("Desea agregar un libro?(s/n)");
        String respuesta = leerValores.next();
        while (!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n"))) {
            System.out.println("Respuesta invalida \n"
                    + "Intente nuevamente: ");
        }
        while (respuesta.equalsIgnoreCase("s")) {
            conjuntoLibros.add(crearLibro());
            System.out.println("Desea agregar otro libro?(s/n)");
            respuesta = leerValores.next();
            while (!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n"))) {
                System.out.println("Respuesta invalida \n"
                        + "Intente nuevamente: ");
            }
        }
    }
    
    public void prestarLibro() {
        System.out.println("Ingrese el nombre del libro a prestar");
        String respuesta = leerValores.next();
        boolean operacion = false;
        
        for (Libro aux : conjuntoLibros) {
            if (aux.getTitulo().equalsIgnoreCase(respuesta) && aux.getEjemplares() > 0) {
                aux.setEjemplaresPrestados((aux.getEjemplaresPrestados()+1));
                aux.setEjemplares((aux.getEjemplares()-1));
                operacion = true;
                System.out.println("La operacion fue exitosa: "+operacion);
            }else if(aux.getTitulo().equalsIgnoreCase(respuesta) && aux.getEjemplares() == 0){
                System.out.println("Lo sentimos, no se puede prestar el libro porq no hay ejemplares disponibles");
                operacion = true;
                System.out.println("La operacion fue exitosa: "+!operacion);
            }
        }
        if(!operacion){
                System.out.println("El libro no se encuentra en la lista");
            }
        
    }
    
    public void devolverLibro() {
        System.out.println("Ingrese el nombre del libro a devolver");
        String respuesta = leerValores.next();
        boolean operacion = false;
        
        for (Libro aux : conjuntoLibros) {
            if (aux.getTitulo().equalsIgnoreCase(respuesta) && aux.getEjemplaresPrestados() > 0) {
                aux.setEjemplaresPrestados((aux.getEjemplaresPrestados()-1));
                aux.setEjemplares((aux.getEjemplares()+1));
                operacion = true;
                System.out.println("La operacion fue exitosa: "+operacion);
            }else if(aux.getTitulo().equalsIgnoreCase(respuesta) && aux.getEjemplaresPrestados() == 0){
                System.out.println("Lo sentimos, no se puede devolver el libro porq nunca se presto ese ejemplar");
                operacion = true;
                System.out.println("La operacion fue exitosa: "+!operacion);
            }
        }
        if(!operacion){
                System.out.println("El libro no se encuentra en la lista");
            }
        
    }
    
    public void mostrar(){
        for (Libro aux : conjuntoLibros) {
            System.out.println(aux.toString()+" \n"+
                    "--------------------------------");
        }
    }
}
