/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Sanplas8
 */
public enum Alimentos {
    PERRO("Balanceado","Carne","Pollo","Pescado"),
    GATO("Balanceado","Carne","Pollo","Pescado"),
    CABALLO("Maiz","Alfalfa","Avena");
    
    private String[] listaAlimentos;

    private Alimentos() {
    }

    private Alimentos(String... listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }

    public String[] getListaAlimentos() {
        return listaAlimentos;
    }

    public void setListaAlimentos(String[] listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }
    
    
}
