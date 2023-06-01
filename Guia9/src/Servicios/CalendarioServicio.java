/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Calendario;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class CalendarioServicio {

    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public void adivinarMes(Calendario calendario) {

        System.out.println("Descubra el mes secreto \n"
                + "A continuacion ingrese un mes para saber si es el secreto: ");
        String mes = leerValores.next();
        while (!mes.equalsIgnoreCase(calendario.getMesSecreto())) {

            System.out.println("No adivinaste, intenta nuevamente: ");
            mes = leerValores.next();
            
        }

        while (mes.equalsIgnoreCase(calendario.getMesSecreto())) {
            System.out.println("Muy bien, adivinaste. Gracias por participar");
            break;
        }
    }
}
