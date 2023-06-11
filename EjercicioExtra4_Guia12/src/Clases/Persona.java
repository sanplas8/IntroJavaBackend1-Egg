/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Sanplas8
 */
public abstract class Persona {
    protected String nombreCompleto;
    protected Integer ID;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombreCompleto, Integer ID, String estadoCivil) {
        this.nombreCompleto = nombreCompleto;
        this.ID = ID;
        this.estadoCivil = estadoCivil;
    }
    
    
}
