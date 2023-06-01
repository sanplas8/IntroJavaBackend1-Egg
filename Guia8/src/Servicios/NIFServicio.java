/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class NIFServicio {

    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNif() {
        System.out.println("Por favor ingrese su numero de DNI sin guiones ni puntos");
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};
        long dni = leerValores.nextLong();

        int[] dni2 = new int[8];

        for (int i = 0; i < dni2.length ; i++) {
            if (String.valueOf(dni).length() == 7) {
                if (i == 0) {
                    dni2[i] = 0;
                } else if (i > 0) {
                    dni2[i] = Integer.parseInt(String.valueOf(dni).substring(i-1, i));
                }
            } else {

                dni2[i] = Integer.parseInt(String.valueOf(dni).substring(i, i+1));
            }
        }

        while (!(String.valueOf(dni).length() == 8 || String.valueOf(dni).length() == 7)) {
            System.out.print("Dni ingresado incorrecto. \n"
                    + "Intente nuevamente: ");
            dni = leerValores.nextLong();

        }

        char letraNif = letra[((int) dni % 23)];
        return new NIF(dni, letraNif, dni2);
    }

    public void mostrar(NIF valor) {
        System.out.println("Su NIF es el siguiente: \n"
                + '"' + valor.getDni() + "-" + valor.getLetra() + '"');
    }

}
