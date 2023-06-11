/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Sanplas8
 */
public class Alquiler {
    private Cliente cliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Barco barco;
    private char [] posicionAmarrre;

    public Alquiler() {
        this.posicionAmarrre = new char [(int)(Math.random()*9)+1];
    }

    public Alquiler(Cliente cliente, Date fechaAlquiler, Date fechaDevolucion, Barco barco, char[] posicionAmarrre) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
        this.posicionAmarrre = new char [(int)(Math.random()*9)+1];
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public char[] getPosicionAmarrre() {
        return posicionAmarrre;
    }

    public void setPosicionAmarrre(char[] posicionAmarrre) {
        this.posicionAmarrre = posicionAmarrre;
    }

   
    

    
    
    
    
}
