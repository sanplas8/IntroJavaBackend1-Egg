/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----- Iniciando Juego ----- \n"
                + "Creando numero aleatorio del 1 al 500****** \n");
        int numAleatorio = (int) (Math.random() * 500) + 1;
        int intentos = 0;
        boolean adivinado = false;
        int numero;
        System.out.print("Ingrese la dificultad: \n"
                + "1- 10 Intentos \n"
                + "2- 30 Intentos \n"
                + "3- 50 Intentos \n"
                + "Opcion: ");
        String opcion;
        do {
            opcion = leerValores.next();
            switch (opcion) {
                case "1":
                    intentos = 10;
                    break;
                case "2":
                    intentos = 30;
                    break;
                case "3":
                    intentos = 50;
                    break;
                default:
                    System.out.print("Dato ingresado incorrecto, intente nuevamente.... \n"
                            + "Opcion: ");
            }
        } while (!(opcion.equalsIgnoreCase("1") || opcion.equalsIgnoreCase("2") || opcion.equalsIgnoreCase("3")));
        System.out.println("Usted tendra " + intentos + " intentos para adivinar el numero.. \n"
                + "Empecemos ......");
        while (!adivinado && intentos > 0) {
            try {
                System.out.print("Ingrese un numero: ");

                numero = leerValores.nextInt();

                if (numero == numAleatorio) {
                    intentos--;
                    if (intentos > 0) {
                        System.out.println("Ganaste el juego, adivinaste el numero faltando " + intentos + " intentos");
                    } else {
                        System.out.println("Ganaste el juego en el ultimo intento");
                    }
                    adivinado = true;
                } else if (numero < numAleatorio) {
                    intentos--;
                    System.out.println("El numero a adivinar es mas alto que el recien ingresado");
                    System.out.println("Te quedan " + intentos + " intentos");
                } else {
                    intentos--;
                    System.out.println("El numero a adivinar es mas bajo que el recien ingresado");
                    System.out.println("Te quedan " + intentos + " intentos");
                }
            } catch (InputMismatchException e) {
                intentos--;
                System.out.println("La opcion ingresada no es un numero. Te quedan " + intentos + " intentos");
                leerValores.next();
            }
        }
        if (intentos == 0 && !adivinado) {
            System.out.println("Perdiste, intenta nuevamente");
        }
    }
}
