/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Sanplas8
 */
public enum Colores {
    COLOR1("Blanco"),COLOR2("Negro"),COLOR3("Acero"),COLOR4("Acero-Blanco"),COLOR5("Acero-Negro");
    
    private String valor;

    private Colores(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
