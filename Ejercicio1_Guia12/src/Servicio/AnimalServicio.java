/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Clases.Animal;
import Clases.Caballo;
import Clases.Gato;
import Clases.Perro;
import Enums.Alimentos;
import Enums.Razas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class AnimalServicio {

    private Scanner leerValores;
    private ArrayList<Animal> listadoAnimales;

    public AnimalServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.listadoAnimales = new ArrayList();
    }

    public Scanner getLeerValores() {
        return leerValores;
    }

    public void setLeerValores(Scanner leerValores) {
        this.leerValores = leerValores;
    }

    public ArrayList<Animal> getListadoAnimales() {
        return listadoAnimales;
    }

    public void setListadoAnimales(ArrayList<Animal> listadoAnimales) {
        this.listadoAnimales = listadoAnimales;
    }
    
    

    public void crearAnimales() {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    String nombre = "Perro 1";
                    String alimento = Alimentos.PERRO.getListaAlimentos()[(int) (Math.random() * Alimentos.values().length)];
                    System.out.println("Ingrese la edad del perro: ");
                    Integer edad = leerValores.nextInt() * 7;
                    String raza = Razas.PERRO.getListadoRazas()[(int) (Math.random() * Razas.values().length)];
                    Animal perro = new Perro(nombre, alimento, edad, raza);
                    listadoAnimales.add(perro);
                    break;
                case 1:
                    nombre = "Gato 1";
                    alimento = Alimentos.GATO.getListaAlimentos()[(int) (Math.random() * Alimentos.values().length)];
                    System.out.println("Ingrese la edad del gato: ");
                    edad = leerValores.nextInt() * 8;
                    raza = Razas.GATO.getListadoRazas()[(int) (Math.random() * Razas.values().length)];
                    Animal gato = new Gato(nombre, alimento, edad, raza);
                    listadoAnimales.add(gato);
                    break;
                case 2:
                    nombre = "Caballo 1";
                    alimento = Alimentos.CABALLO.getListaAlimentos()[(int) (Math.random() * Alimentos.values().length)];
                    System.out.println("Ingrese la edad del caballo: ");
                    edad = leerValores.nextInt() * 6;
                    raza = Razas.CABALLO.getListadoRazas()[(int) (Math.random() * Razas.values().length)];
                    Animal caballo = new Caballo(nombre, alimento, edad, raza);
                    listadoAnimales.add(caballo);
            }
        }
    }
}
