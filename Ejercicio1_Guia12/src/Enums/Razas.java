/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Sanplas8
 */
public enum Razas {
    PERRO("Salchicha","Beagle","Ovejero Aleman","Breton","Boxer","Dogo","Pitbull"),
    GATO("Siames","Persa","Coon","Ragdoll","Bengali"),
    CABALLO("Mustang","Arabe","Frison","Pintos","Percheron");
    
    private String[] listadoRazas;

    private Razas(String... listadoRazas) {
        this.listadoRazas = listadoRazas;
    }

    public String[] getListadoRazas() {
        return listadoRazas;
    }

    public void setListadoRazas(String[] listadoRazas) {
        this.listadoRazas = listadoRazas;
    }
    
    
}
