/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practica2;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---- Bienvenidos al programa de funcionamiento para dispositivos RS232 --------- \n"+
                "\n"+
                "\n");

        System.out.print("Por favor ingrese una cadena de texto para ser analizada: ");
        Scanner leerCadena = new Scanner(System.in);
        String codigo;
        codigo = leerCadena.nextLine();
        int ingresosCorrectos = 0;
        int ingresosIncorrectos = 0;
        do {
            if (codigo.length() == 5 && codigo.substring(0,1).equalsIgnoreCase("X") && codigo.substring(4).equalsIgnoreCase("O")) {
                System.out.println("Ingreso correcto \n"+
                        "\n"+
                        "=================================== \n"+
                        "\n");
                System.out.print("Ingrese el siguiente codigo, recuerde que ingresar (&&&&&) para finalizar: ");
                ingresosCorrectos +=1;
                codigo = leerCadena.next();
                
            }else if (codigo.equals("&&&&&")){
                System.out.println("Muchas gracias por utilizar nuestro sistema \n"+
                        "\n"+
                        "=================================== \n"+
                        "===================================");
            }else {
                System.out.println("Ingreso incorrecto \n"+
                        "\n"+
                        "=================================== \n"+
                        "\n");
                System.out.print("Ingrese el siguiente codigo, recuerde que ingresar (&&&&&) para finalizar: ");
                ingresosIncorrectos +=1;
                codigo = leerCadena.next();
            }
        }while (codigo.equals("&&&&&")==false);
        
        System.out.println("El total de ingresos correctos es: "+ingresosCorrectos+" y el total de incorrectos es: "+ingresosIncorrectos);
        
    }
    
}
