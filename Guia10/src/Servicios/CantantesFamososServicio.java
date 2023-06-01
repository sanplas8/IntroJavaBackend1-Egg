/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CantantesFamosos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class CantantesFamososServicio {

    private Scanner leerValores;

    public CantantesFamososServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
    }

    public CantantesFamosos crearCantanteFamoso() {

        System.out.println("Ingrese un nuevo cantante o banda");
        System.out.print("Nombre: ");
        String nombre = leerValores.next();

        System.out.print("Disco mas vendido: ");
        String discoMasVendido = leerValores.next();
        return new CantantesFamosos(nombre, discoMasVendido);
    }

    public void mostrarLista(ArrayList<CantantesFamosos> lista) {
        System.out.println("-------------------------------------------------");
        for (CantantesFamosos aux : lista) {
            System.out.println("| Cantante o banda: " + aux.getNombre() + ", Disco mas vendido: " + aux.getDiscoMasVendido()+" |");
        }
        System.out.println(" \n"+
                "------------------------------------------------- \n");

    }

    public void eliminarCantante(ArrayList<CantantesFamosos> lista) {
        System.out.println("Ingrese un cantante o banda a eliminar");
        String aEliminar = leerValores.next();
        boolean encontrado = false;
        Iterator<CantantesFamosos> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(aEliminar)) {
                it.remove();
                encontrado = true;
                System.out.println("Eliminacion exitosa");
            }

            if (!encontrado) {
                System.out.println("El cantante o banda ingresado no se encuentra en la lista");
            }
        }

    }

    public void menu(ArrayList<CantantesFamosos> lista) {
        String opcion = "";

        do {
            System.out.println("-----Menu----- \n"
                    + "Ingrese una opcion del menu: \n"
                    + "1- Agregar un nuevo cantante o banda: \n"
                    + "2- Mostrar lista \n"
                    + "3- Eliminar un cantante o banda \n"
                    + "4- Salir \n"
                    + " \n"
                    + "Opcion: ");

            opcion = leerValores.next();
            leerValores.nextLine();
            switch (opcion) {
                case "1":
                    lista.add(crearCantanteFamoso());
                    break;
                case "2":
                    mostrarLista(lista);
                    break;
                case "3":
                    eliminarCantante(lista);
                    break;
                case "4":
                    System.out.println("Muchas gracias \n"
                            + "-----Su lista final luego de los cambios-----");
                    mostrarLista(lista);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!opcion.equalsIgnoreCase("4"));

    }
}
