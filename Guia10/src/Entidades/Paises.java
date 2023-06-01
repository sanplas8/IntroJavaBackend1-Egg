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
public class Paises {
    private String pais;

    public Paises() {
    }

    public Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public static Comparator<Paises> OrdenarAlfabeticamente = new Comparator<Paises>(){
        @Override
        public int compare(Paises p1, Paises p2){
            
            return p1.getPais().compareToIgnoreCase(p2.getPais());
        }
    };

    @Override
    public String toString() {
        return  pais;
        
    }
    
    
}
