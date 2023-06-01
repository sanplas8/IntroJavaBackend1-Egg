/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author toto_
 */
public class ParDeNumerosServicio {
    
    public ParDeNumeros crearPar(){
        return new ParDeNumeros();
    }
    
    public void mostrarValores(ParDeNumeros par){
        System.out.println("Los numeros a operar son "+par.getNum1()+" y "+par.getNum2());
    }
    
    public void mostrarMayor(ParDeNumeros par){
        System.out.println("El numero mas alto del par es "+Math.max(par.getNum1(), par.getNum2()));
        
        if(par.getNum1() == par.getNum2()){
            System.out.println("Ambos numeros son iguales");
        }
    }
    
    public double calcularPotencia(ParDeNumeros par){
        
        if(par.getNum1() > par.getNum2()){
            return  Math.pow(Math.round(par.getNum1()), Math.round(par.getNum2()));
        }else{
            return Math.pow(Math.round(par.getNum2()), Math.round(par.getNum1()));
        }
        
    }
    
    public double calcularRaiz(ParDeNumeros par){
        
        return Math.sqrt(Math.abs(Math.min(par.getNum1(), par.getNum2())));
        
    }
}
