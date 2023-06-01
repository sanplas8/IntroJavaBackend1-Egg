/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class PaisesServicio {
    private Scanner leerValores;
    private HashSet<Paises> paises;

    public PaisesServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet();
    }
    
    public Paises crearPais(){
        System.out.println("Ingrese un pais");
        String pais = leerValores.next();
        return new Paises(pais);
    }
    
    public void agregarYMostrarPais(){
        String respuesta = "";
        do{
           paises.add(crearPais());
            System.out.println("Desea agregar otro pais?(si/no)");
            respuesta = leerValores.next();
            while(!(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("no"))){
                System.out.println("Respuesta incorrecta \n"+
                        "Intente nuevamente: ");
                respuesta = leerValores.next();
            }
        }while(respuesta.equalsIgnoreCase("si"));
        System.out.println("Mostrar conjunto");
        System.out.println(paises.toString());
        
    }
    
    public void OrdenarAlfabeticamente(){
        System.out.println("-----Conjunto ordenado alfabeticamente-----");
        ArrayList<Paises> paisesLista = new ArrayList(paises);
        paisesLista.sort(Paises.OrdenarAlfabeticamente);
        System.out.println(paisesLista.toString());
    }
    
    public void EliminarPais(){
        System.out.println("Ingrese un pais a eliminar: ");
        String pais = leerValores.next();
        boolean encontrado = false;
        Iterator<Paises> it = paises.iterator();
        while(it.hasNext()){
            if(it.next().getPais().equalsIgnoreCase(pais)){
                it.remove();
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("El pais no se encuentra en la lista");
        }else{
            System.out.println(paises.toString());
        }
    }
    
    
}
