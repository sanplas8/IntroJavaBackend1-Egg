/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.Electrodomestico;
import Clases.Lavadora;
import Enums.Colores;
import Enums.ConsumoEnergetico;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class ElectroServi {
    private Scanner leerValores;
   

    public ElectroServi() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        
    }
    
    public static char comprobarConsumoEnergetico(char consumo){
        char consumoIngresado = consumo;
        if(Character.toUpperCase(consumoIngresado) >= 'A' && Character.toUpperCase(consumoIngresado) <= 'F'){
            consumoIngresado = consumoIngresado;
        }else{
            System.out.println("El valor ingresado no es correcto. Se le asiganara un valor de consumo por defecto F");
            consumoIngresado = ConsumoEnergetico.F.getValor();
        }
        return consumoIngresado;
    }
    
    public static String comprobarColor(String color){
        boolean band = true;
        String colorIngresado = color;
        for(int i = 0; i < Colores.values().length ; i++){
            if(colorIngresado.equalsIgnoreCase(Colores.values()[i].getValor())){
                band = false;
                colorIngresado = colorIngresado;
                break;
            }
        }
        if(band){
            System.out.println("El color ingresado no esta en nuestra cartilla de colores. Se le asignara por defecto el color Blanco.");
            colorIngresado = Colores.COLOR1.getValor();
        }
        return colorIngresado;
    }
    
    public Electrodomestico crearElectrodomestico(){
        System.out.print("Ingrese el Electrodomestico a solicitar: ");
        String respuesta = leerValores.next();
        
        while(!(respuesta.equalsIgnoreCase("Lavadora")|| respuesta.equalsIgnoreCase("Televisor"))){
            System.out.print("Los unicos electrodomesticos que se pueden solicitar son: Lavadora o Televisor \n"+
                    "Intente nuevamente: ");
            respuesta = leerValores.next();
        }
        if(respuesta.equalsIgnoreCase("lavadora")){
            System.out.println("-----Solicitud de nueva "+respuesta+"-----");
        }else{
            System.out.println("-----Solicitud de nuevo "+respuesta+"-----");
        }
        
        System.out.print("Ingrese el color del electrodomestico: ");        
        String color = comprobarColor(leerValores.next());
        System.out.print("Ingrese el consumo energetico deseado: ");
        char consumoEnergetico = comprobarConsumoEnergetico(leerValores.next().charAt(0));
        System.out.print("Ingrese peso del electrodomestico: ");
        Integer peso = leerValores.nextInt();
        return new Electrodomestico(Double.NaN, color, consumoEnergetico, peso) {};
    }
    
    public void precioFinal(Electrodomestico elect){
        switch(Character.toUpperCase(elect.getConsumoEnergetico())){
            case 'A' -> elect.setPrecio(elect.getPrecio()+1000d);
            case 'B' -> elect.setPrecio(elect.getPrecio()+800d);
            case 'C' -> elect.setPrecio(elect.getPrecio()+600d);
            case 'D' -> elect.setPrecio(elect.getPrecio()+5000d);
            case 'E' -> elect.setPrecio(elect.getPrecio()+300d);
            case 'F' -> elect.setPrecio(elect.getPrecio()+100d);                                
        }
        
        if(elect.getPeso() >= 1 && elect.getPeso() <= 19){
            elect.setPrecio(elect.getPrecio()+100);
        }else if(elect.getPeso() >= 20 && elect.getPeso() <= 49){
            elect.setPrecio(elect.getPrecio()+500d);
        }else if(elect.getPeso() >= 50 && elect.getPeso() <= 79){
            elect.setPrecio(elect.getPrecio()+800d);
        }else{
            elect.setPrecio(elect.getPrecio()+1000d);
        }
    }
    
    
}
