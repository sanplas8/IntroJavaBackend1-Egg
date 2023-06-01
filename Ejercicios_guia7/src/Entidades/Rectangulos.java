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
public class Rectangulos {
    
    private int base, altura;

    public Rectangulos() {
    }

    public Rectangulos(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void crearRectangulo(){
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Por favor ingrese la base del rectangulo: ");
        base = leerValores.nextInt();
        System.out.println("Por favor ingrese la altura del rectangulo: ");
        altura = leerValores.nextInt();
    }
    
    public void calculaSuperficie(){
        System.out.println("La superficie del rectangulo es: "+(base*altura));
    }
    
    public void calculaPerimetro(){
        System.out.println("El perimetro del rectangulo es: "+(2*(base+altura)));
    }
    
    public void dibujaRectangulo(){
        for (int i = 0 ; i < altura ; i++){
            while (i == 0 || i == (altura-1)){
                for (int j = 0 ; j < base ; j++){
                    System.out.print("* ");
                }
                break;
            }
            while (i >= 1 && i <= (altura - 2)){
                for (int k = 0 ; k < base ; k++){
                    if (k == 0 || k == (base-1)){
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
                break;
            }
            System.out.println("");
        }
    }
    
}
