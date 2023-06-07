/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.Circulo;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class CircServ {
    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
    
    public Circulo crearCirculo(){
        System.out.println("Ingrese el radio del circulo");
        return new Circulo(leerValores.nextDouble());
    }
}
