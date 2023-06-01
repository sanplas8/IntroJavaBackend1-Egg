/*
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
public class Empleado {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    public double calcularAumento(){
        if (edad < 30){
            salario *= 1.05;
        }else if(edad >= 30){
            salario *= 1.10;
        }
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado(" + "Nombre= " + nombre + ", Edad= " + edad + ", Salario= " + salario + ")";
    }
    
    
}

    