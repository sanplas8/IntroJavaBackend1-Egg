
package Ejercicios_practica2_extra;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor de A: ");
        int valorA = leerValores.nextInt();
        System.out.println("Por favor ingrese el valor de B: ");
        int valorB = leerValores.nextInt();
        System.out.println("Por favor ingrese el valor de C: ");
        int valorC = leerValores.nextInt();
        System.out.println("Por favor ingrese el valor de D: ");
        int valorD = leerValores.nextInt();
        int aux;
        
        System.out.println("Valores iniciales:");
        System.out.println("A = " + valorA);
        System.out.println("B = " + valorB);
        System.out.println("C = " + valorC);
        System.out.println("D = " + valorD);
        
        aux = valorA;
        valorA = valorD;
        valorD = valorB;
        valorB = valorC;
        valorC = aux;
        
                
        System.out.println("\nValores finales:");
        System.out.println("A = " + valorA);
        System.out.println("B = " + valorB);
        System.out.println("C = " + valorC);
        System.out.println("D = " + valorD);
    }
    
}
