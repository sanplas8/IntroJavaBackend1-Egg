/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el primer numero: ");
            String numero1Str = scanner.nextLine();
            int numero1 = Integer.parseInt(numero1Str);
            System.out.print("Ingrese el segundo numero: ");
            String numero2Str = scanner.nextLine();
            int numero2 = Integer.parseInt(numero2Str);
            if(numero2 == 0){
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            double resultado = division(numero1, numero2);
            System.out.println("El resultado de la division es: " + resultado);         
        }
        
        catch (NumberFormatException e) {
            System.out.println("Error: El dato ingresado no se puede convertir a entero");
            
        } 
        
         catch (ArithmeticException e) {
             System.out.println(e.getMessage());
        }
        
       
    }
    
    public static double division(int numero1, int numero2) {
        return (double) numero1 / numero2;
    }
}
