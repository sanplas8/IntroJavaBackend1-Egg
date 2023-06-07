/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Sanplas8
 */
public final class Lavadora extends Electrodomestico {
    private Double carga;

    public Lavadora() {
    }
    
    

    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(Double carga, String color, char consumoEnergetico, Integer peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(Double carga, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    

        

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

  
    
    @Override
    public String toString() {
        return "Electrodomestico: "+getClass().getSimpleName() +" \n"+
                "Precio: " + precio + ", Color: " + color + ", Consumo energetico: " + consumoEnergetico + ", Peso: " + peso+ ", Carga: "+carga;
    }
}
