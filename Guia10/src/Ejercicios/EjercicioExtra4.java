/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer, String> mapaCiudades = new HashMap();

        mapaCiudades.put(1900, "La Plata");
        mapaCiudades.put(4700, "San Fernando del Valle de Catamarca");
        mapaCiudades.put(3500, "Resistencia");
        mapaCiudades.put(9121, "Biedma");
        mapaCiudades.put(5000, "Cordoba");
        mapaCiudades.put(3400, "Corrientes");
        mapaCiudades.put(3200, "Concordia");
        mapaCiudades.put(3600, "Formosa");
        mapaCiudades.put(4600, "San Salvador de Jujuy");
        mapaCiudades.put(6300, "Santa Rosa");
        
        agregar10Ciudades(mapaCiudades);
        ciudadAsociada(mapaCiudades);
        System.out.println("-----Lista de ciudades-----");
        for (Map.Entry<Integer, String> entry : mapaCiudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Codigo Postal: "+key+", Ciudad: "+value);
            
        }
        
        System.out.println("----------------------------");
        agregar1Ciudad(mapaCiudades);
        eliminarCiudad(mapaCiudades);
        System.out.println("-----Lista de ciudades final-----");
        for (Map.Entry<Integer, String> entry : mapaCiudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Codigo Postal: "+key+", Ciudad: "+value);
            
        }
        
        System.out.println("----------------------------");

    }

    public static void agregar10Ciudades(HashMap map) {
        System.out.println("------Agregando ciudades-----");
        HashMap<Integer, String> ciudadesAniadidas = new HashMap();
        System.out.println("Ingrese por favor 10 ciudades y sus codigos postales");
        do {
            Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
            
            System.out.print((map.size()-10 + 1) + "° Codigo postal: ");
            int codigoPostal = leerValores.nextInt();
            System.out.print((map.size()-10 + 1) + "° Ciudad: ");
            String ciudad = leerValores.next();
            ciudadesAniadidas.put(codigoPostal, ciudad);
            map.put(codigoPostal, ciudad);
        } while (map.size() < 20);
        System.out.println("-----Ciudades aniadidas-----");
        for (Map.Entry<Integer, String> entry : ciudadesAniadidas.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Codigo Postal: "+key+" Ciudad: "+value);
        }
        System.out.println("---------------------------");
    }
    
    public static void ciudadAsociada(HashMap map){
        HashMap<Integer, String> ciudadesAniadidas = new HashMap(map);
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-----A que ciudad corresponde?-----");
        System.out.println("Ingrese un codigo postal");
        System.out.print("Codigo Postal: ");
        int codigoPostal = leerValores.nextInt();
        boolean encontrado = false;
        for (Map.Entry<Integer, String> entry : ciudadesAniadidas.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if(key == codigoPostal){
                System.out.println("El codigo postal corresponde a la ciudad de: "+value);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("El codigo postal no existe");
        }
    }
    
    public static void agregar1Ciudad(HashMap map) {
        System.out.println("------Agregando una ciudad mas-----");
        
        System.out.println("Ingrese por favor 1 ciudad y su codigo postal");
        
            Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
            
            System.out.print("Codigo postal: ");
            int codigoPostal = leerValores.nextInt();
            System.out.print("Ciudad: ");
            String ciudad = leerValores.next();
            
            map.put(codigoPostal, ciudad);  
    }
    
    public static void eliminarCiudad(HashMap map){
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer, String> nuevoMap = new HashMap(map);
        System.out.println("-----Eliminando 3 ciudades-----");
        System.out.println("Ingrese las ciudades a eliminar");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ciudad: ");
            String ciudad = leerValores.next();
            for (Map.Entry<Integer, String> entry : nuevoMap.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                if(value.equalsIgnoreCase(ciudad)){
                    map.remove(key);
                }
            }
        }
    }

}
