/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class RectServ {
    
    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese Base y altura del Rectangulo");
        return new Rectangulo(leerValores.nextDouble(),leerValores.nextDouble());
    }
    
}
