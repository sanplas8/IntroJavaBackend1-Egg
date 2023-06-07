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
public final class Circulo implements calculosFormas {
    
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

   

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return pi*Math.pow(radio, 2d);
    }
    @Override
    public Double calcularPerimetro() {
        return pi*(2d*radio);
    }

    
    
}
