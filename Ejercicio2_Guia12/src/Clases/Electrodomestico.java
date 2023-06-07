package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sanplas8
 */
public abstract class Electrodomestico {
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, Integer peso) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = 1000d;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico: "+getClass().getSimpleName() +" \n"+
                "Precio: " + precio + ", Color: " + color + ", Consumo energetico: " + consumoEnergetico + ", Peso: " + peso;
    }
    
    
    
    
}
