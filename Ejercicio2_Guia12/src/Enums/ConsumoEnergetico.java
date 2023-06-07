/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Sanplas8
 */
public enum ConsumoEnergetico {
    A('A'),B('B'),C('C'),D('D'),E('E'),F('F');
    
    private char valor;
    
    private ConsumoEnergetico(char valor) {
        this.valor = valor;
    }
    
    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }
      
}
