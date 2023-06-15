/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author Sanplas8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer [] arreglo = new Integer [5];
        
        try{
            for (int i = 0; i < 6; i++) {
                arreglo[i] = (i+1);
                System.out.println(arreglo[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No se pudo completar el array, porq se paso un parametro de iteracion mas largo que la capacidad del array");
        }
    }
    
}
