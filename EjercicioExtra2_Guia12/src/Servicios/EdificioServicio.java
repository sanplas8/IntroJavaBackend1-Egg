/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Classes.Edificio;
import Classes.EdificioDeOficinas;
import Classes.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class EdificioServicio {
    private Scanner leerValores;

    public EdificioServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
    }

    public Scanner getLeerValores() {
        return leerValores;
    }

    public void setLeerValores(Scanner leerValores) {
        this.leerValores = leerValores;
    }
    
    public Edificio crearPolideportivo(){
        Edificio nuevoPolideportivo = new Polideportivo();
        System.out.println("----- Creando nuevo Polideportivo -----");
        System.out.print("Ingrese el nombre del polideportivo que desea crear: ");        
        ((Polideportivo) nuevoPolideportivo).setNombre(leerValores.next());        
        System.out.print("Indique (s/n) si el polideportivo es techado: ");
        String respuesta = leerValores.next();
        if(respuesta.equalsIgnoreCase("s")){
            ((Polideportivo) nuevoPolideportivo).setTipoDeInstalacion(true);
        }else {
            ((Polideportivo) nuevoPolideportivo).setTipoDeInstalacion(false);
        }        
        System.out.print("Ingrese la altura que va a tener: ");
        ((Polideportivo)nuevoPolideportivo).setAlto(leerValores.nextDouble());
        System.out.print("Ingrese el largo que va a tener: ");
        ((Polideportivo)nuevoPolideportivo).setLargo(leerValores.nextDouble());
        System.out.print("Ingrese el ancho que va a tener: ");
        ((Polideportivo)nuevoPolideportivo).setAncho(leerValores.nextDouble());
        return nuevoPolideportivo;        
    }
    
    public Edificio crearEdificioDeOficinas(){
        Edificio nuevoEdificioDeOficinas = new EdificioDeOficinas();
        System.out.println("----- Creando nuevo edificio de oficinas -----");
        System.out.print("Ingrese la altura que va a tener: ");
        ((EdificioDeOficinas)nuevoEdificioDeOficinas).setAlto(leerValores.nextDouble());
        System.out.print("Ingrese el largo que va a tener: ");
        ((EdificioDeOficinas)nuevoEdificioDeOficinas).setLargo(leerValores.nextDouble());
        System.out.print("Ingrese el ancho que va a tener: ");
        ((EdificioDeOficinas)nuevoEdificioDeOficinas).setAncho(leerValores.nextDouble());
        System.out.print("Ingrese la cantidad de pisos que contendra el edificio: ");
        ((EdificioDeOficinas)nuevoEdificioDeOficinas).setCantPisos(leerValores.nextInt());
        System.out.print("Ingrese la cantidad de oficinas por piso: ");
        ((EdificioDeOficinas)nuevoEdificioDeOficinas).setCantOficinas(leerValores.nextInt());
        ((EdificioDeOficinas)nuevoEdificioDeOficinas).setCantPersXoficina(null);
        return nuevoEdificioDeOficinas;
    }
    
    public void cuantosTechados(ArrayList<Edificio> edificio){
        int cant = 0;
        for (Edificio edi : edificio) {
            if(edi instanceof Polideportivo && ((Polideportivo)edi).isTipoDeInstalacion()){
                cant ++;
            }
        }
        System.out.println("La cantidad de polideportivos techados es: "+cant);
    }
    
    
}
