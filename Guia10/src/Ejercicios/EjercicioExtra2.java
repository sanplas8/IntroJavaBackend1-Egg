/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.CantantesFamosos;
import Servicios.CantantesFamososServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CantantesFamososServicio ns = new CantantesFamososServicio();
        ArrayList<CantantesFamosos> top6 = new ArrayList();
        do{
            System.out.println("Ingrese un cantante o banda famoso y su disco mas vendido");
            top6.add(ns.crearCantanteFamoso());
        }while(top6.size()<5);
        
        ns.mostrarLista(top6);
        
        ns.menu(top6);
    }
    
}
