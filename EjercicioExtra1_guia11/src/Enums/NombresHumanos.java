/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author toto_
 */
public enum NombresHumanos {
    SANTIAGO_PLASTINE("Santiago Plastine"), YAMILA_LOPEZ("Yamila Lopez"), FRANCESCA_PLASTINE("Francesca Plastine"), ALESSIO_PLASTINE("Aelessio Plastine");
    
    private String valor;

    private NombresHumanos(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
