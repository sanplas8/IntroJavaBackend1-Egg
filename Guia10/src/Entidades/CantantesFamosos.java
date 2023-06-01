/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author toto_
 */
public class CantantesFamosos {
    private String nombre;
    private String discoMasVendido;

    public CantantesFamosos() {
    }

    public CantantesFamosos(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    @Override
    public String toString() {
        return "Cantante: " + nombre + "Disco mas vendido: " + discoMasVendido;
    }
    
    
}
