
package Ejercicios_practica2_extra;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerNumero = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        byte num;
        do{
            num = leerNumero.nextByte();
            if(num >= 1 && num <+10){
                switch(num){
                    case 1:
                        System.out.println("La conversion a romano del numero ingresado es 'I'");
                        break;
                    case 2:
                        System.out.println("La conversion a romano del numero ingresado es 'II'");
                        break;
                    case 3:
                        System.out.println("La conversion a romano del numero ingresado es 'III'");
                        break;
                    case 4:
                        System.out.println("La conversion a romano del numero ingresado es 'IV'");
                        break;
                    case 5:
                        System.out.println("La conversion a romano del numero ingresado es 'V'");
                        break;
                    case 6:
                        System.out.println("La conversion a romano del numero ingresado es 'VI'");
                        break;
                    case 7:
                        System.out.println("La conversion a romano del numero ingresado es 'VII'");
                        break;
                    case 8:
                        System.out.println("La conversion a romano del numero ingresado es 'VIII'");
                        break;
                    case 9:
                        System.out.println("La conversion a romano del numero ingresado es 'IX'");
                        break;
                    case 10:
                        System.out.println("La conversion a romano del numero ingresado es 'X'");
                            
                }
            }else{
                System.out.println("Numero ingresado fuera de rango \n"+
                        "Intente nuevamente \n"+
                        "============================================== \n"+
                        "==============================================");
                
            }
        }while (num < 1 || num >10);
    }
    
}
