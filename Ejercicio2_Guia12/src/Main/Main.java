/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Electrodomestico;
import Clases.Lavadora;
import Clases.Televisor;
import Servicios.LavadoraServicio;
import Servicios.TelevisorServicio;

/**
 *
 * @author Sanplas8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LavadoraServicio nLS = new LavadoraServicio();
        Lavadora nuevaLavadora = nLS.crearLavadora();

        System.out.println("\n");

        nLS.precioFinal(nuevaLavadora);
        System.out.println(nuevaLavadora.toString());
        
        System.out.println("\n"+"-------------------------"+"\n");
        
        TelevisorServicio nTS = new TelevisorServicio();
        Televisor nuevoTelevisor = nTS.crearTelevisor();

        System.out.println("\n");

        nTS.precioFinal(nuevoTelevisor);
        System.out.println(nuevoTelevisor.toString());
        
        System.out.println("\n"+"-------------------------"+"\n");
    }

}
