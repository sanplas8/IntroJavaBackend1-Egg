/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Circunferencia {
    private double radio;
    Scanner leerValores = new Scanner(System.in);
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Por favor ingrese el radio de la circunferencia");
        this.radio = leerValores.nextDouble();
    }
    
    public void area(){
        double area;
        area = Math.PI*(Math.pow(radio, 2));
        System.out.println("El area de la circunferencia es: "+area);
    }
    
    public void perimetro(){
        double perimetro;
        perimetro = 2*Math.PI*radio;
        System.out.println("El perimerto de la circunferencia es: "+perimetro);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
