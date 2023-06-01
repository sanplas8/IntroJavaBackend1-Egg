/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author toto_
 */
public class Perro {
    private String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return  raza ;
    }
    
    public static Comparator<Perro> compararRaza = new Comparator<Perro>(){
        @Override
        public int compare(Perro p1, Perro p2){
            
            return p1.getRaza().compareToIgnoreCase(p2.getRaza());
        }
    };
}
