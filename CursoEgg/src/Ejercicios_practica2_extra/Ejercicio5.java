/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practica2_extra;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor ingrese su categoria de socio e importe de su tratamiento");
        Scanner leerCategoria_importe = new Scanner(System.in);
        String categoria;
        int importe;
        float costeTotal;
        
        categoria = leerCategoria_importe.next();
        importe = leerCategoria_importe.nextInt();
        switch(categoria){
            case "A":
            case "a":
                costeTotal = importe-(importe*(float) 0.5);
                System.out.println("Segun la categoria ingresada el costo total de su tratamiento aplicando el 50% de descuento sera de: "+costeTotal);
                break;
            case "B":
            case "b":
                costeTotal = importe-(importe*(float) 0.35);
                System.out.println("Segun la categoria ingresada el costo total de su tratamiento aplicando el 35% de descuento sera de: "+costeTotal);
                break;
            case "C":
            case "c":
                
                System.out.println("Segun la categoria ingresada el costo total de su tratamiento sera de: "+importe+" ya que su plan no dispone de descuento");
        }
        
    }
    
}
