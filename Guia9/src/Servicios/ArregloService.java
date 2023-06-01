/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author toto_
 */
public class ArregloService {

    public static void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.round((Math.random() * 10) * 100.0) / 100.0;
        }
    }

    public static void mostrar(double[] arreglo) {
        System.out.print("{");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("}");
    }

    public static void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
    }

    public static void inicializarB(double[] arreglo1, double[] arreglo2) {
        for (int i = 0; i < arreglo1.length; i++) {
            while (i  < 10) {
                arreglo1[i] = arreglo2[i];
                break;
            }while(i >= 10) {
                arreglo1[i] = 0.5;
                break;
            }

            

        }
    }
}
