/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Perro;
import Enums.Raza;
import Enums.Tamanios;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class PerroServicio {

    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("-----Creando Perro-----");
        System.out.print("Ingrese el nombre del perro: ");
        perro.setNombre(leerValores.next());
        System.out.print("Ingrese la edad del perro: ");
        perro.setEdad(leerValores.nextInt());
        System.out.print("Ingrese tamanio del perro \n"
                + "Mini \n"
                + "Pequenio \n"
                + "Mediano \n"
                + "Grande \n"
                + "Respuesta: ");
        String tamanio; 
        String raza;
        do {
            tamanio = leerValores.next().toLowerCase();
            switch (tamanio) {
                case "mini":
                    perro.setTamanio(Tamanios.MINI);
                    System.out.print("Elija una raza disponible: \n"
                            + "Salchicha \n"
                            + "Callejero \n"
                            + "Respuesta: ");

                    
                    
                    do {
                        raza = leerValores.next().toLowerCase();
                        switch (raza) {
                            case "salchicha":
                                perro.setRaza(Raza.SALCHICHA);
                                break;
                            case "callejero":
                                perro.setRaza(Raza.CALLEJERO);
                                break;
                            default:
                                System.out.print("La opcion no es correcta \n"
                                        + "Intente nuevamente: ");
                                
                        }
                    } while (!(raza.equalsIgnoreCase("salchicha") || raza.equalsIgnoreCase("callejero")));
                    break;
                case "pequenio":
                    perro.setTamanio(Tamanios.PEQUENIO);
                    System.out.print("Elija una raza disponible: \n"
                            + "Salchicha \n"
                            + "Callejero \n"
                            + "Beagle \n"
                            + "Respuesta: ");
                    
                    do {
                        raza = leerValores.next().toLowerCase();
                        switch (raza) {
                            case "salchicha":
                                perro.setRaza(Raza.SALCHICHA);
                                break;
                            case "callejero":
                                perro.setRaza(Raza.CALLEJERO);
                                break;
                            case "beagle":
                                perro.setRaza(Raza.BEAGLE);
                                break;
                            default:
                                System.out.print("La opcion no es correcta \n"
                                        + "Intente nuevamente: ");
                                
                        }
                    } while (!(raza.equalsIgnoreCase("salchicha") || raza.equalsIgnoreCase("callejero") || raza.equalsIgnoreCase("beagle")));
                    break;
                case "mediano":
                    perro.setTamanio(Tamanios.MEDIANO);
                    System.out.print("Elija una raza disponible: \n"
                            + "Boxer \n"
                            + "Callejero \n"
                            + "Respuesta: ");
                    
                    do {
                        raza = leerValores.next().toLowerCase();
                        switch (raza) {
                            case "boxer":
                                perro.setRaza(Raza.BOXER);
                                break;
                            case "callejero":
                                perro.setRaza(Raza.CALLEJERO);
                                break;
                            default:
                                System.out.print("La opcion no es correcta \n"
                                        + "Intente nuevamente: ");
                                
                        }
                    } while (!(raza.equalsIgnoreCase("boxer") || raza.equalsIgnoreCase("callejero")));
                    break;
                case "grande":
                    perro.setTamanio(Tamanios.GRANDE);
                    System.out.print("Elija una raza disponible: \n"
                            + "Doberman \n"
                            + "Callejero \n"
                            + "Ovejero Aleman \n"
                            + "Golden \n"
                            + "Labrador \n"
                            + "Respuesta: ");
                    
                    do {
                        raza = leerValores.next().toLowerCase();
                        switch (raza) {
                            case "doberman":
                                perro.setRaza(Raza.DOBERMAN);
                                break;
                            case "callejero":
                                perro.setRaza(Raza.CALLEJERO);
                                break;
                            case "ovejero aleman":
                                perro.setRaza(Raza.OVEJERO_ALEMAN);
                                break;
                            case "golden":
                                perro.setRaza(Raza.GOLDEN);
                                break;
                            case "labrador":
                                perro.setRaza(Raza.LABRADOR);
                                break;
                            default:
                                System.out.print("La opcion no es correcta \n"
                                        + "Intente nuevamente: ");
                                
                        }
                    } while (!(raza.equalsIgnoreCase("doberman") || raza.equalsIgnoreCase("callejero") || raza.equalsIgnoreCase("evejero aleman") || raza.equalsIgnoreCase("golden") || raza.equalsIgnoreCase("labrador")));
                    break;
                default:
                    System.out.print("La opcion no es correcta \n"
                            + "Intente nuevamente: ");
                    

            }
        } while (!(tamanio.equalsIgnoreCase("mini") || tamanio.equalsIgnoreCase("pequenio") || tamanio.equalsIgnoreCase("mediano") || tamanio.equalsIgnoreCase("grande")));
        return perro;
    }
}
