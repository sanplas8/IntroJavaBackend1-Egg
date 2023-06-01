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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Ingrese por favor la cantidad de personas que van a ingresar su altura: ");
        int contador = leerValores.nextInt();
        int sumaAlturaMax = 0;
        int sumaAlturaMin = 0;
        int altura;
        int cantAlturaMax = 0;
        int cantAlturaMin = 0;
        float promedioAlturaMax, promedioAlturaMin;
        
        for(int i = contador; i >= 1; i--){
            System.out.println("Ingrese la altura en centimetros de la "+(contador-i+1)+" persona: ");
            altura = leerValores.nextInt();
            if (altura >= 160){
                cantAlturaMax +=1;
                sumaAlturaMax += altura;
            }else {
                cantAlturaMin += 1;
                sumaAlturaMin += altura;
            }
            
        }
        if (cantAlturaMin < 1){
            promedioAlturaMax = ( (float)sumaAlturaMax/100)/(float)cantAlturaMax;
            System.out.println("La cantidad de alturas mayores a 1,60 mts ingresadas fue de: "+cantAlturaMax+" y la cantidad de alturas menores a 1,60mts fue de: 0 \n"+
                "El promedio de alturas mayores a 1,60mts es de: "+promedioAlturaMax+"mts");
            
        }else if (cantAlturaMax < 1){
            promedioAlturaMin =  ((float) sumaAlturaMin/100)/(float)cantAlturaMin;
            System.out.println("La cantidad de alturas mayores a 1,60 mts ingresadas fue de: 0 y la cantidad de alturas menores a 1,60mts fue de: "+cantAlturaMin+"\n"+
                "El promedio de alturas menores a 1,60mts es de: "+promedioAlturaMin+"mts");
            
        }else{
            promedioAlturaMax =  ((float)sumaAlturaMax/100)/(float)cantAlturaMax;
            promedioAlturaMin =  ((float)sumaAlturaMin/100)/(float)cantAlturaMin;
            System.out.println("La cantidad de alturas mayores a 1,60 mts ingresadas fue de: "+cantAlturaMax+" y la cantidad de alturas menores a 1,60mts fue de: "+cantAlturaMin+"\n"+
                "El promedio de alturas menores a 1,60mts es de: "+promedioAlturaMin+"mts y el promedio de alturas mayores a 1,60mts es de: "+promedioAlturaMax+"mts");
        }
        
        
    }
    
}
