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
public class NIF {
    private long dni;
    private char letra;
    private int [] dni2;

    public NIF(long dni, char letra, int[] dni2) {
        this.dni = dni;
        this.letra = letra;
        this.dni2 = dni2;
    }

    public int[] getDni2() {
        return dni2;
    }

    public void setDni2(int[] dni2) {
        this.dni2 = dni2;
    }

    

    

    

    public NIF() {
    }

    public NIF(long dni) {
        this.dni = dni;
    }
    
    

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    
    
    
    
    
}
