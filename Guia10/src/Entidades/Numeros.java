/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author toto_
 */
public class Numeros {
    private ArrayList<Integer> secuencia;

    public Numeros() {
    }

    public Numeros(ArrayList<Integer> secuencia) {
        this.secuencia = secuencia;
    }

    public ArrayList<Integer> getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(ArrayList<Integer> secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public String toString() {
        return "Secuencia: " + secuencia ;
    }
    
    
}
