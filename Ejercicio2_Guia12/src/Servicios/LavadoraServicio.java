/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.Electrodomestico;
import Clases.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class LavadoraServicio extends ElectroServi{
    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    
    public Lavadora crearLavadora(){
        Electrodomestico nuevoElectrodomestico = crearElectrodomestico();
        
        System.out.print("Ingrese el valor de carrga del electrodomestico: ");
        Double carga = leerValores.nextDouble();
        return new Lavadora(carga, nuevoElectrodomestico.getPrecio(), nuevoElectrodomestico.getColor(), nuevoElectrodomestico.getConsumoEnergetico(), nuevoElectrodomestico.getPeso());
    }   

    public void precioFinal(Lavadora lav) {
        super.precioFinal(lav);
        if(lav.getCarga() > 30d){
            lav.setPrecio(lav.getPrecio()+500d);
        }
    }
    
    
}
