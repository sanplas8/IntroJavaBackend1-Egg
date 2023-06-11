/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Alquiler;
import Clases.Cliente;
import Servicios.AlquilerServicio;
import java.util.HashSet;

/**
 *
 * @author Sanplas8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlquilerServicio aS = new AlquilerServicio();
        Alquiler nuevoAlquiler = aS.simularAlquiler();
        aS.crearListadoClientes(nuevoAlquiler);
        int cont = 0;
        do{
            
            int random = (int)(Math.random()*3)+1;
            switch(random){
                case 1:
                    System.out.println("Datos para velero");
                    aS.crearVelero();
                    break;
                case 2:
                    System.out.println("Datos para A motor");
                    aS.crearAMotor();
                    break;
                case 3:
                    System.out.println("Datos para Yate de Lujo");
                    aS.crearYate();
            }
            nuevoAlquiler.getPosicionAmarrre()[cont] = 'X';
            cont ++;
        }while(aS.getListadoBarcos().size() < nuevoAlquiler.getPosicionAmarrre().length);
        asignarClientes(nuevoAlquiler, aS);
    }
    
    public static void asignarClientes(Alquiler ns, AlquilerServicio as){
        for (int i = 0; i < ns.getPosicionAmarrre().length; i++) {
            as.mostrarAlquiler(ns, i);
        }
    }
    
}
