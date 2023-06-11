/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Sanplas8
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String nombreCompleto;
    private Integer dni;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String nombreCompleto, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreCompleto = nombre+apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCompleto + ", Dni: " + dni ;
    }
    
     
    
}
