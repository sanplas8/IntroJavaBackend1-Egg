/* Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
   sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
   objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
   números y los ingresa en los atributos del objeto. Después, a través de otro 
   método calcular y devolver la distancia que existe entre los dos puntos que 
   existen en la clase Puntos. 


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
public class Puntos {
    
    private double x1, y1, x2, y2;
    

    public Puntos() {
    }
    
    public void crearPuntos(){
         
        Scanner leerValores = new Scanner(System.in);
        
        System.out.println("Ingrese los valores X e Y para ubicar los puntos de partida y de salida: ");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(i==0 && j==0){
                    System.out.println("Ingrese el valor de X del punto de partida: ");
                    x1 = leerValores.nextInt();
                }else if(i==0 && j==1){
                    System.out.println("Ingrese el valor de Y del punto de partida: ");
                    y1 = leerValores.nextInt();
                }else if(i==1 && j == 0){
                    System.out.println("Ingrese el valor de X del punto de llegada: ");
                    x2 = leerValores.nextInt();
                }else{
                    System.out.println("Ingrese el valor de Y del punto de llegada: ");
                    y2 = leerValores.nextInt();
                }
            }
        }             
    }
    
    public double distancia(){
        double distancia;
        
        distancia = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
        return distancia;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    
    
}
