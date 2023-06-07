/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Circulo;
import Clases.Rectangulo;
import Servicios.CircServ;
import Servicios.RectServ;

/**
 *
 * @author Sanplas8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircServ cS = new CircServ();
        RectServ rS = new RectServ();
        
        Circulo nuevoCirculo = cS.crearCirculo();
        Rectangulo nuevoRectangulo = rS.crearRectangulo();
        
        
        System.out.println("El area del circulo es: "+nuevoCirculo.calcularArea()+"\n"+
                "El perimetro del circulo es: "+nuevoCirculo.calcularPerimetro());
        System.out.println("El area del rectangulo es: "+nuevoRectangulo.calcularArea()+"\n"+
                "El perimetro del circulo es: "+nuevoRectangulo.calcularPerimetro());
    }
    
}
