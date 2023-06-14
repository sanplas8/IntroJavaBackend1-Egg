/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Sanplas8
 */
public final class Polideportivo extends Edificio {
    
    private String nombre;
    private boolean tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tipoDeInstalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(boolean tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    @Override
    public Double calcularSuperficie() {
        return this.largo*this.ancho;
    }

    @Override
    public Double clcularVolumen() {
        return this.largo*this.ancho*this.alto;
    }    
}
