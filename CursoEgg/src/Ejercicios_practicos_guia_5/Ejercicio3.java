/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_practicos_guia_5;

/**
 *
 * @author toto_
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = {1,2,10,11,100,110,1000,1100,10000,10100};
        
        int contDigitos, digitos1 = 0, digitos2 = 0, digitos3 = 0, digitos4 = 0, digitos5 = 0;
        for(float elemento:vector){
            contDigitos = 0;
            do{
               elemento = elemento/(float) 10;
               contDigitos +=1;
            }while (elemento >= 1);
            
            switch (contDigitos){
                case 1:
                    digitos1 +=1;
                    break;
                case 2:
                    digitos2 +=1;
                    break;
                case 3:
                    digitos3 +=1;
                    break;
                case 4:
                    digitos4 +=1;
                    break;
                case 5:
                    digitos5 +=1;
                     
            }
        }
        System.out.println("La cantidad de numeros de un digitos es "+digitos1+" de dos digitos es "+digitos2+" de tres digitos es "+digitos3+" de cuatro digitos es "+digitos4+" de cinco digitos es "+digitos5);
        
    }
    
}
