/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Electrodomestico;
import Clases.Televisor;
import Clases.Lavadora;
import Servicios.LavadoraServicio;
import Servicios.TelevisorServicio;
import java.util.ArrayList;

/**
 *
 * @author Sanplas8
 */
public class MainEjercicio3_Guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LavadoraServicio nLS = new LavadoraServicio();
        TelevisorServicio nTS = new TelevisorServicio();
        
       ArrayList<Electrodomestico> listaElectro = new ArrayList();
       
        for (int i = 0; i < 4; i++) {
            switch(i){
                case 0:
                    Electrodomestico tele1 = nTS.crearTelevisor();
                    listaElectro.add(tele1);
                    System.out.println(listaElectro.get(i).toString());
                    break;
                case 1:
                    Electrodomestico tele2 = nTS.crearTelevisor();
                    listaElectro.add(tele2);
                    System.out.println(listaElectro.get(i).toString());
                    break;
                case 2:
                    Electrodomestico lava1 = nLS.crearLavadora();
                    listaElectro.add(lava1);
                    System.out.println(listaElectro.get(i).toString());
                    break;
                case 3:
                    Electrodomestico lava2 = nLS.crearLavadora();
                    listaElectro.add(lava2);
                    System.out.println(listaElectro.get(i).toString());
                    
            }
        }
        Double sumaPrecioLavadoras = 0d;
        Double sumaPrecioTelevisores = 0d;
        
        for (Electrodomestico aux : listaElectro) {
            if(aux.getClass().getSimpleName().equalsIgnoreCase("Lavadora")){
                nLS.precioFinal(aux);
                sumaPrecioLavadoras += aux.getPrecio();
            }else{
                nTS.precioFinal(aux);
                sumaPrecioTelevisores += aux.getPrecio();
            }
        }
        
        Double sumaPrecioElectro = sumaPrecioLavadoras+sumaPrecioTelevisores;
        System.out.println("La suma de los precios de todos los televisores es de: $"+sumaPrecioTelevisores+"\n"+
                "La suma de los precios de todos las lavadoras es de: $"+sumaPrecioLavadoras+"\n"+
                "La suma de los precios de todos los electrodomesticos es de: $"+sumaPrecioElectro+"\n");
    }
    
}
