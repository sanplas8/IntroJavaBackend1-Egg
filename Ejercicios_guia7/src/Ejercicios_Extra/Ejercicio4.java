/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra;

import Entidades_Extra.Cuenta;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        Cuenta cuentaSantiago = new Cuenta();
        String respuesta;
        System.out.println("Ingrese su nombre de usuario para comenzar");
        respuesta = leerValores.nextLine();
        int opcion;

        do {
            System.out.println(" -----Bienvenido al cajero-----  \n"
                    + "Que operacion deseas realizar " + respuesta + "? \n"
                    + "1- Consulta de saldo \n"
                    + "2- Retirar efectivo \n"
                    + "3- Salir");
            opcion = leerValores.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es de $" + cuentaSantiago.getSaldo());
                    break;
                case 2:
                    System.out.println("Que cantidad desea retirar?");
                    cuentaSantiago.retirarDinero(leerValores.nextDouble());
                    break;
                case 3:
                    System.out.println("Muchas gracias, hasta la proxima");
                    break;
                default:
                    System.out.println("La opcion elegida no es valida, vuelva a intentar");
            }
        } while (opcion != 3);
    }

}
