/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Enums.Alimentos;
import Enums.Razas;

/**
 *
 * @author Sanplas8
 */
public abstract class Animal {
    protected String nombre;
    protected String comida;
    protected Integer edad;
    protected String raza;

    public Animal(String nombre, String comida, Integer edad, String raza) {
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
    public void alimentarse(){
        System.out.println(" Que rico estuvo comer "+comida+" para "+getClass().getSimpleName());
    }
}
