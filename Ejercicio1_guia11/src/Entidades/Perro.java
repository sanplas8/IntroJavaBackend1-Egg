/*
 
 */
package Entidades;

import Enums.Raza;
import Enums.Tamanios;

/**
 *
 * @author toto_
 */
public class Perro {
    private String nombre;
    private Raza  raza;
    private int edad;
    private Tamanios tamanio;

    public Perro() {
    }

    public Perro(String nombre, Raza raza, int edad, Tamanios tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tamanios getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanios tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + ", raza " + raza + ", edad " + edad + ", tamanio " + tamanio ;
    }

        
}
