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
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1 = leerValores.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = leerValores.nextInt();
    }
    
    public void sumar(){
        System.out.println("La suma de los numeros ingresados es: ");
        System.out.println(numero1+" + "+numero2+" = "+(numero1+numero2));
    }
    
    public void restar(){
        System.out.println("La resta de los numeros ingresados es: ");
        System.out.println(numero1+" - "+numero2+" = "+(numero1-numero2));
    }
    
    public void multiplicacion(){
        if(numero1 == 0 || numero2 == 0){
            System.out.println("Error \n"+
                    "0");
        }else{
            System.out.println("La multiplicacion de los numeros ingresados es: ");
            System.out.println(numero1+" x "+numero2+" = "+(numero1*numero2));
        }
        
    }
    
    public void division(){
        
        if(numero2 == 0){
            System.out.println("Error \n"+
                    "No se puede dividir por 0");
        }else{
            System.out.println("La division de los numeros ingresados es: ");
            System.out.println(numero1+" / "+numero2+" = "+((double) numero1/numero2));
        }    
    }
}
