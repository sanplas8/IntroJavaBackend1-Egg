/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Sanplas8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList();
        listaAnimales.add(new Animal());
        listaAnimales.add(new Perro());
        listaAnimales.add(new Gato());
        
        for (Animal aux : listaAnimales) {
            aux.hacerRuido();
        }        
    }   
}
