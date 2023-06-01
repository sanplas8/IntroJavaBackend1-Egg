/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.NombresPerrunos;

/**
 *
 * @author toto_
 */
public class Perro {
    private NombresPerrunos nombre;
    private String raza;
    private int edad;
    private String tamanio;
    private boolean adoptado;

    public NombresPerrunos getNombre() {
        return nombre;
    }

    public void setNombre(NombresPerrunos nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    

    @Override
    public String toString() {
        return "{" + "Nombre= " + nombre.getValor() + ", Raza= " + raza + ", Edad= " + edad + ", Tamanio= " + tamanio + '}';
    }
    
    
}
