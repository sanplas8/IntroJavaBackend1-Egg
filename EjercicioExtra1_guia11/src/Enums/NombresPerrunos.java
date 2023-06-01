/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author toto_
 */
public enum NombresPerrunos {
    NORRIE("Norrie"),EMMA("Emma"),SASHA("Sasha"),BULMA("Bulma");
    
    private String valor;

    private NombresPerrunos(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
