/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.NombresHumanos;

/**
 *
 * @author toto_
 */
public class Persona {

    private NombresHumanos nombreCompleto;
    private int edad;
    private int dni;
    private Perro perro;

    public NombresHumanos getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(NombresHumanos nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

   

    @Override
    public String toString() {
        return "Persona: \n" 
                + "Nombre Completo= " + nombreCompleto.getValor() + ", Edad= " + edad + ", Dni= " + dni + ", Perro= " + perro;
    }
    
    
}
