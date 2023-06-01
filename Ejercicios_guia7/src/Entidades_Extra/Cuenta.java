/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_Extra;

import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Cuenta {
    
    private double saldo;
    private String titular;

    public Cuenta() {
        saldo = 10000;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirarDinero(double retiro){
        Scanner leerValores = new Scanner(System.in);
        if(retiro > saldo){
            System.out.println("Disculpe, no dispone de saldo suficiente \n"+
                    "Por favor ingrese un monto menor a $"+saldo);
            retiro = leerValores.nextDouble();
        }else{
            saldo -= retiro;
            System.out.println("Su retiro de $"+retiro+" fue exitoso. \n"+
                    "Saldo restante disponible $"+saldo);
        }
    }
}
