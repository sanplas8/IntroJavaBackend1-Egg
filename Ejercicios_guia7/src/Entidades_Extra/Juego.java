/* Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
   jugadores jugar un juego de adivinanza de números. El primer jugador elige un 
   número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número 
   limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada 
   intento. El juego termina cuando el segundo jugador adivina el número o se queda 
   sin intentos. Registra el número de intentos necesarios para adivinar el número 
   y el número de veces que cada jugador ha ganado.



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_Extra;

import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Juego {

    private int jugador1;
    private int jugador2;
    private int[] puntaje = new int[2];
    private int dificultad;
    private int intentos;
    private String respuesta;

    public Juego() {
        intentos = 0;
        respuesta = "";
    }

    public int[] getPuntaje() {
        return puntaje;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setPuntaje(int[] puntaje) {
        this.puntaje = puntaje;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public void iniciarJuego() {

        do {
            System.out.println("----- Juego iniciado ----- \n"
                    + "========================== \n"
                    + "Por favor Jugador numero 1 inicie ingresando un numero a adivinar por su contrincante sin que este lo vea");
            Scanner leerValores = new Scanner(System.in);
            jugador1 = leerValores.nextInt();
            for (int i = 0; i < 20; i++) {
                System.out.println("");
            }

            do {
                System.out.println("Jugador numero 2. Ingrese la dificultad del juego \n"
                        + "1- Facil (15 intentos) \n"
                        + "2- Intermedio (10 intentos) \n"
                        + "3- Dificil (5 intentos)");

                dificultad = leerValores.nextInt();

                switch (dificultad) {
                    case 1:
                        System.out.println("Usted eligio la dificultad Facil. Comencemos, buena suerte!!! \n");
                        intentos += 15;
                        break;
                    case 2:
                        System.out.println("Usted eligio la dificultad Intermedia. Comencemos, buena suerte!!! \n");
                        intentos += 10;
                        break;
                    case 3:
                        System.out.println("Usted eligio la dificultad Dificil. Comencemos, buena suerte!!! \n");
                        intentos += 5;
                        break;
                    default:
                        System.out.println("Opcion incorrecta, intente nuevamente");
                }
            } while (dificultad < 1 || dificultad > 3);

            for (int i = 0; i < intentos; i++) {
                System.out.println("Intento numero " + (i + 1));
                jugador2 = leerValores.nextInt();

                if (jugador2 > jugador1) {
                    System.out.println("Intente con un numero menor");
                } else if (jugador2 < jugador1) {
                    System.out.println("Intente con numero mayor");
                } else {
                    System.out.println("Muy bien, el jugador 2 gana un punto");
                    puntaje[1] += 1;
                    break;
                }
                while (i == intentos - 1) {
                    puntaje[0] += 1;
                    System.out.println("Mala suerte, el jugador 1 gana.");
                    break;
                }

            }

            System.out.println("Puntuacion: \n"
                    + "Jugador 1: " + puntaje[0] + ", Jugador 2: " + puntaje[1] + " \n"
                    + "======================================================== \n"+
                    "Juguemos otra vez.... (Si/No)");

                
                respuesta = leerValores.next();
                
               

            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {

                System.out.println("Respuesta erronea, intente nuevamente (Si/No)");
                respuesta = leerValores.nextLine();

            }

        } while (respuesta.equalsIgnoreCase("si"));

        while (respuesta.equalsIgnoreCase("no")) {
            if (puntaje[0] > puntaje[1]) {
                System.out.println(" \n"
                        + "El ganador es el jugador 1 por " + puntaje[0] + " puntos contra " + puntaje[1] + " puntos");
                break;
            } else if (puntaje[0] < puntaje[1]) {
                System.out.println(" \n"
                        + "El ganador es el jugador 2 por " + puntaje[1] + " puntos contra " + puntaje[0] + " puntos");
                break;
            } else {
                System.out.println("El juego termino en empate. " + puntaje[0] + " puntos para el jugador1 y " + puntaje[1] + " puntos para el jugador 2");
                break;
            }
        }
    }

}
