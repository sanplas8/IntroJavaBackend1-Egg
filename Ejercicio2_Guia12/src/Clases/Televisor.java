/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Sanplas8
 */
public class Televisor extends Electrodomestico{
    
    private Integer resolucionPulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucionPulgadas, boolean sintonizadorTDT, String color, char consumoEnergetico, Integer peso) {
        super(color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Integer resolucionPulgadas, boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(Integer resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
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
                "Precio: " + precio + ", Color: " + color + ", Consumo energetico: " + consumoEnergetico + ", Peso: " + peso+ ", Resolucion Pulgadas: "+resolucionPulgadas+", Sintonizador TDT: "+(isSintonizadorTDT()? "Si":"No");
    }
    
    
    
}
