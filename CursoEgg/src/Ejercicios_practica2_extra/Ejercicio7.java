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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor ingrese la cantidad de numeros que desea ingresar: ");
        Scanner leerValor = new Scanner(System.in);
        int numTope = leerValor.nextInt();
        int valorMin = 0,valorMax = 0,contador = 1,suma = 0;
        float promedio;
        while (contador <= (numTope)){
            System.out.println("Ingrese el "+contador+" numero: ");
            int num = leerValor.nextInt();
            if(valorMax == 0 && valorMin == 0){
                valorMax = num;
                valorMin = num;
                suma += num;
                contador +=1;                
            }else if (num >= valorMin && num <= valorMax){
                suma += num;
                contador += 1;
                
            }else if (num < valorMin){
                valorMin = num;
                suma += num;
                contador += 1;
            }else if (num > valorMax){
                valorMax = num;
                suma += num;
                contador += 1;
            }
        }
        promedio = (float) suma/ numTope;
        System.out.println("El valor minimo introducido fue '"+valorMin+"' \n"+
                "El valor maximo introducido fue '"+valorMax+"' \n"+
                "El promedio de la suma de todos los numeros introducidos es '"+promedio+"'");
    }
    
}
