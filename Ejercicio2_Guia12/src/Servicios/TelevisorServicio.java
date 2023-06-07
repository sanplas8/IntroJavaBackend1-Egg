/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.Electrodomestico;
import Clases.Televisor;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class TelevisorServicio extends ElectroServi {
    
    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    
    public Televisor crearTelevisor(){
        Electrodomestico nuevoElectrodomestico = crearElectrodomestico();
        
        System.out.print("Ingrese la resolucion en pulgadas: ");
        Integer resolucionPulgadas = leerValores.nextInt();
        System.out.print("Con sintonizador TDT?(s/n): ");
        char respuesta = leerValores.next().charAt(0);
        
        
        //while(Character.toUpperCase(respuesta) != 'S') || Character.toUpperCase(respuesta) != 'N' ){
          //  System.out.println("Respuesta incorrecta, intente nuevamente");
            //respuesta = leerValores.next().charAt(0);
        //}
        boolean sintonizador = false;
        if(Character.toUpperCase(respuesta) == 'S'){
            sintonizador = true;
        }
        return new Televisor(resolucionPulgadas, sintonizador,nuevoElectrodomestico.getPrecio(), nuevoElectrodomestico.getColor(), nuevoElectrodomestico.getConsumoEnergetico(), nuevoElectrodomestico.getPeso());
    }   

    public void precioFinal(Televisor tele) {
        super.precioFinal(tele);
        if(tele.getResolucionPulgadas() > 40 && tele.isSintonizadorTDT()){
            tele.setPrecio((tele.getPrecio()*1.3)+500);
        }else if(tele.getResolucionPulgadas() > 40){
            tele.setPrecio(tele.getPrecio()*1.3);
        }else if(tele.isSintonizadorTDT()){
            tele.setPrecio(tele.getPrecio()+500);
        }
    }
    
}
