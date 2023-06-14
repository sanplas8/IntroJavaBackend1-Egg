/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Classes.Edificio;
import Classes.EdificioDeOficinas;
import Classes.Polideportivo;
import Servicios.EdificioServicio;
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
        EdificioServicio nuevoServicio = new EdificioServicio();
        ArrayList<Edificio> listadoEdificios = new ArrayList();

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    listadoEdificios.add(nuevoServicio.crearPolideportivo());
                    break;
                case 1:
                    listadoEdificios.add(nuevoServicio.crearPolideportivo());
                    break;
                case 2:
                    listadoEdificios.add(nuevoServicio.crearEdificioDeOficinas());
                    break;
                case 3:
                    listadoEdificios.add(nuevoServicio.crearEdificioDeOficinas());
                    break;
            }
        }

        int contPoli = 1;
        int contEdificio = 1;
        for (Edificio edificio : listadoEdificios) {
            if(edificio instanceof Polideportivo){
            System.out.println("---------------------------------------");
            System.out.println("Edificio " + contPoli + " " + edificio.getClass().getSimpleName() + ": \n"
                    + "Superficie: " + edificio.calcularSuperficie() + ", Volumen: " + edificio.clcularVolumen());
            System.out.println("---------------------------------------");
            contPoli ++;
            }else{
                nuevoServicio.cuantosTechados(listadoEdificios);
                System.out.println("---------------------------------------");
            System.out.println("Edificio " + contEdificio + " " + edificio.getClass().getSimpleName() + ": \n"
                    + "Superficie: " + edificio.calcularSuperficie() + ", Volumen: " + edificio.clcularVolumen());
            System.out.println("---------------------------------------");
            contEdificio ++;
            ((EdificioDeOficinas)edificio).cantPersonas();
            }
        }
    }
    
    

}
