/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import Enums.NombresHumanos;
import Enums.NombresPerrunos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class PersonaPerro {

    private Scanner leerValores;
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Perro> listaPerros;

    public PersonaPerro() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.listaPerros = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }

    public Scanner getLeerValores() {
        return leerValores;
    }

    public void setLeerValores(Scanner leerValores) {
        this.leerValores = leerValores;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Perro> getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(ArrayList<Perro> listaPerros) {
        this.listaPerros = listaPerros;
    }

    public void crearPersona() {

        for (NombresHumanos nombre : NombresHumanos.values()) {
            Persona nuevaPersona = new Persona();
            switch (nombre) {
                case SANTIAGO_PLASTINE:
                    nuevaPersona.setNombreCompleto(nombre.SANTIAGO_PLASTINE);
                    nuevaPersona.setEdad(34);
                    nuevaPersona.setDni(34152545);
                    listaPersonas.add(nuevaPersona);
                    break;
                case YAMILA_LOPEZ:
                    nuevaPersona.setNombreCompleto(nombre.YAMILA_LOPEZ);
                    nuevaPersona.setEdad(36);
                    nuevaPersona.setDni(333031850);
                    listaPersonas.add(nuevaPersona);
                    break;
                case FRANCESCA_PLASTINE:
                    nuevaPersona.setNombreCompleto(nombre.FRANCESCA_PLASTINE);
                    nuevaPersona.setEdad(9);
                    nuevaPersona.setDni(53375410);
                    listaPersonas.add(nuevaPersona);
                    break;
                case ALESSIO_PLASTINE:
                    nuevaPersona.setNombreCompleto(nombre.ALESSIO_PLASTINE);
                    nuevaPersona.setEdad(4);
                    nuevaPersona.setDni(57664244);
                    listaPersonas.add(nuevaPersona);
                    break;
            }
            ;
        }
    }

    public void crearPerro() {

        for (NombresPerrunos nombre : NombresPerrunos.values()) {
            Perro nuevoPerro = new Perro();
            switch (nombre) {
                case NORRIE:
                    nuevoPerro.setNombre(nombre);
                    nuevoPerro.setEdad(8);
                    nuevoPerro.setRaza("Salchicha");
                    nuevoPerro.setTamanio("Pequenio");
                    listaPerros.add(nuevoPerro);
                    break;
                case EMMA:
                    nuevoPerro.setNombre(nombre);
                    nuevoPerro.setEdad(7);
                    nuevoPerro.setRaza("Callejero");
                    nuevoPerro.setTamanio("Mediano");
                    listaPerros.add(nuevoPerro);
                    break;
                case SASHA:
                    nuevoPerro.setNombre(nombre);
                    nuevoPerro.setEdad(15);
                    nuevoPerro.setRaza("Callejero");
                    nuevoPerro.setTamanio("Pequenio");
                    listaPerros.add(nuevoPerro);
                    break;
                case BULMA:
                    nuevoPerro.setNombre(nombre);
                    nuevoPerro.setEdad(6);
                    nuevoPerro.setRaza("Callejero");
                    nuevoPerro.setTamanio("Mediano");
                    listaPerros.add(nuevoPerro);
                    break;
            }
        }
    }

    public void mostrarListaPersonas() {
        System.out.println("------Listado de Personas-----");

        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
        System.out.println("------------------------------");
    }

    public void mostrarListaPerros() {
        System.out.println("------Listado de Perros-----");

        for (Perro perro : listaPerros) {
            System.out.println(perro);
        }
        System.out.println("------------------------------");
    }

    public void adoptar() {
        System.out.println("-----Listado para adopciones-----");

        String respuesta;
        boolean band = true;
        for (Persona persona : listaPersonas) {
            System.out.println("Hola " + persona.getNombreCompleto().getValor() + " ingrese el nombre del perro que quiere adoptar");
            mostrarListaPerros();
            do {
                System.out.print("Opcion: ");
                respuesta = leerValores.next();
                for (Perro perro : listaPerros) {
                    if (perro.getNombre().getValor().equalsIgnoreCase(respuesta) && perro.isAdoptado()) {
                        System.out.println("El perro ya fue adoptado, por favor elija otro");
                        band = true;
                    } else if (perro.getNombre().getValor().equalsIgnoreCase(respuesta)) {
                        System.out.println("Excelente, adoptaste a " + perro.getNombre().getValor() + " como tu mascota \n"
                                + "-------------------------------------------------------");
                        persona.setPerro(perro);
                        perro.setAdoptado(true);
                        band = false;
                    }
                }
            } while (band);
        }
    }

    public void inicio() {
        crearPersona();
        crearPerro();
        String respuesta;
        do {
            System.out.print("-----Menu----- \n"
                    + "Elija una opcion \n"
                    + "1- Adoptar \n"
                    + "2- Mostrar lista de perros \n"
                    + "3- Mostrar lista personas \n"
                    + "4- Salir \n"
                    + " \n"
                    + "Respuesta: ");
            respuesta = leerValores.next();
            switch (respuesta) {
                case "1":
                    adoptar();
                    break;
                case "2":
                    mostrarListaPerros();
                    break;
                case "3":
                    mostrarListaPersonas();
                    break;
                case "4":
                    System.out.println("Muchas gracias");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente");
            }
        } while (!(respuesta.equalsIgnoreCase("4")));
    }
}
