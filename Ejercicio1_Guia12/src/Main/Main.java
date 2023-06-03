/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Animal;
import Servicio.AnimalServicio;

/**
 *
 * @author Sanplas8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalServicio ns = new AnimalServicio();
        ns.crearAnimales();

        for (Animal aux : ns.getListadoAnimales()) {
            System.out.print(aux.getNombre()+" "+aux.getRaza()+"\n"+
                    "Comio y dijo: ");
            aux.alimentarse();
        }
    }

}
