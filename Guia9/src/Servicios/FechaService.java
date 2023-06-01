/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class FechaService {
    
    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaDeNacimiento(){
        int dia,mes,anio;
        System.out.println("Ingrese el dia de su cumpleanios");
        dia = leerValores.nextInt();
        System.out.println("Ingrese el mes de su cumpleanios");
        mes = leerValores.nextInt();
        System.out.println("Ingrese el anio de su cumpleanios");
        anio = leerValores.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        
        return fecha;
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date fechaNac, Date fechaAct){
        return fechaAct.getYear()-fechaNac.getYear();
    }
}
