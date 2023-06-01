/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra;

import Entidades_Extra.Empleado;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        Empleado empleado1 = new Empleado();

        System.out.println(" -----Calculo de aumento de sueldo empleados----- ");

        System.out.println("Ingrese nombre, edad y sueldo del empleado que desea calcular:");
        System.out.print("Nombre: ");
        empleado1.setNombre(leerValores.nextLine());
        System.out.print("Edad: ");
        empleado1.setEdad(leerValores.nextInt());
        System.out.print("Sueldo: ");
        empleado1.setSalario(leerValores.nextFloat());

        System.out.println("Los datos ingresados son... \n"
                + empleado1.toString());

        System.out.println("Su nuevo salario segun base de calculo en cuanto a su edad sera... \n"
                + empleado1.calcularAumento());

    }

}
