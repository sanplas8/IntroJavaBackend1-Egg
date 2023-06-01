/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author toto_
 */
public class Calendario {
    private String [] mesesDelAnio = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto;

    public Calendario() {
        mesSecreto = mesesDelAnio[(int) (Math.random()*12)];
    }

    public Calendario(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMesesDelAnio() {
        return mesesDelAnio;
    }

    public void setMesesDelAnio(String[] mesesDelAnio) {
        this.mesesDelAnio = mesesDelAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    

    
    
    
}
