/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_preactica3;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de Euros para su conversion");
        float euro = leerValores.nextFloat();
        String conversion;
        
        System.out.println("A continuacion ingrese la moneda a la que quiere convertir \n"+
            "Las opciones son: \n"+
            "- Dolar \n"+
            "- Yen \n"+
            "- Libra \n"+
            "Escriba el nombre correcto");
        conversion = leerValores.next();
        conversionMonedas(euro,conversion);
    }
            
            
    
    
    public static void conversionMonedas(float moneda, String conversion){
        double monedaConv;
        
        switch(conversion){
            case "Dolar":
                monedaConv = moneda*1.28611;
                System.out.println("La conversion de "+moneda+" euros a dolares es "+monedaConv);
                break;
            case "Yen" :   
                monedaConv = moneda*129.852;
                System.out.println("La conversion de "+moneda+" euros a yenes es "+monedaConv);
                break;
            case "Libra" :
                monedaConv = moneda*0.86;
                System.out.println("La conversion de "+moneda+" euros a libras es "+monedaConv);
                break;
        }
    }
    
}
