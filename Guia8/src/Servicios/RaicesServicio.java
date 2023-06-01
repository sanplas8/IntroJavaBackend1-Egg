/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class RaicesServicio {

    Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public Raices crearEcuacion() {
        System.out.println("-----Ecuaciones de segundo grado-----");
        System.out.print("Por favor ingrese el valor del coeficiente a: ");
        double a = leerValores.nextDouble();
        System.out.print("Por favor ingrese el valor del coeficiente b: ");
        double b = leerValores.nextDouble();
        System.out.print("Por favor ingrese el valor del coeficiente c: ");
        double c = leerValores.nextDouble();

        return new Raices(a, b, c);
    }

    public double obtenDiscriminante(Raices ecuacion) {
        return Math.pow(ecuacion.getB(), 2) - 4 * ecuacion.getA() * ecuacion.getC();
    }

    public boolean tieneRaices(Raices ecuacion) {
        return (obtenDiscriminante(ecuacion) > 0);
    }

    public boolean tieneRaiz(Raices ecuacion) {
        return (obtenDiscriminante(ecuacion) == 0);
    }

    public void obtenerRaices(Raices ecuacion) {
        while (tieneRaices(ecuacion)) {
            System.out.println("El resultado de x1 es: " + ((-ecuacion.getB()+Math.sqrt(obtenDiscriminante(ecuacion))) / (2*ecuacion.getA()))+" \n"+
                    "El resultado de x2 es: "+((-ecuacion.getB()-Math.sqrt(obtenDiscriminante(ecuacion))) / (2*ecuacion.getA())));
            break;
        }

       

    }

    public void obtenerRaiz(Raices ecuacion) {
        while (tieneRaiz(ecuacion)) {
            System.out.println("El unico resultado de x es: " + ((-ecuacion.getB()+ Math.sqrt(obtenDiscriminante(ecuacion))))/(2*ecuacion.getA()));
            break;
        }
        
    }

    public void calcular(Raices ecuacion) {
        if (tieneRaices(ecuacion)) {
            obtenerRaices(ecuacion);
        } else if (tieneRaiz(ecuacion)) {
            obtenerRaiz(ecuacion);
        } else {
            System.out.println("La ecuacion no tiene resultados reales posibles");
        }
    }
}
