/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Sanplas8
 */
public class Alumno {
    private String nombreCompleto;
    private int dni;
    private int cantVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public Alumno(String nombreCompleto, int dni, int cantVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "{Nombre Completo: " + nombreCompleto + ", Dni: " + dni + ", Votos: " + cantVotos+"}";
    }
    
    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno a1, Alumno a2){
            return Integer.compare(a2.getCantVotos(), a1.getCantVotos());
        }
    };
}
