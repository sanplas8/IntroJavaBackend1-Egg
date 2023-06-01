/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class PerroServicio {

    private Scanner leerValores;
    private ArrayList<Perro> perros;

    public PerroServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.perros = new ArrayList();
    }

    public Perro crearPerro() {
        System.out.println("Ingrese la raza de la mascota");
        String raza = leerValores.next();

        return new Perro(raza);
    }

    public void mostrarPerro() {
        System.out.println("Las razas de perro actuales son: ");
        for (Perro aux : perros) {

            System.out.println(aux.toString());
        }
        System.out.println("La cantidad de razas son: " + perros.size());
    }

    public void agregarPerro(Perro raza) {
        perros.add(raza);
    }

    public void fabricaPerros() {
        String respuesta = "si";
        System.out.println("Agregue un perro a la lista");
        while (respuesta.equalsIgnoreCase("si")) {
            agregarPerro(crearPerro());
            System.out.println("Desea seguir agregando perros?(si/no)");
            respuesta = leerValores.next();
            while (!(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("no"))) {
                System.out.println("Respuesta incorrecta, vuelva a intentar: ");
                respuesta = leerValores.next();
            }
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("-----Continuemos----");
            } else {
                System.out.println("Muchas gracias");
            }
        }
    }

    public void modificarPerro(int indice) {
        perros.set(indice, crearPerro());
    }

    public void quitarPerro() {
        System.out.println("Que perro desea eliminar?");
        String respuesta = leerValores.next();
        Iterator<Perro> it = perros.iterator();
        int cont = 0;
        while (it.hasNext()) {
            if (it.next().getRaza().equalsIgnoreCase(respuesta)) {
                it.remove();
                cont ++;
            }
        }
        if(cont == 1){
            System.out.println("El perro fue eliminado de la lista");
        }else if(cont > 1){
            System.out.println("Los perros fueron eliminados de la lista");
        }else{
            System.out.println("No se econtraron coincidencias");
        }
        perros.sort(Perro.compararRaza);
        mostrarPerro();

    }

    
    
}
