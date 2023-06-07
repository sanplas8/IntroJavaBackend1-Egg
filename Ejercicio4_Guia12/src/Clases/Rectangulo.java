/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.calculosFormas;

/**
 *
 * @author Sanplas8
 */
public final class Rectangulo implements calculosFormas {
    
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base*altura;
    }

    @Override
    public Double calcularPerimetro() {
        return (base+altura)*2;
    }
    
    
    
}
