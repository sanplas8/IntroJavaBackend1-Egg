/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class ProductoServicio {

    private Scanner leerValores;
    private HashMap<Integer, Producto> productos;

    public ProductoServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter(" \n");
        this.productos = new HashMap();
    }

    public Producto crearProducto() {
        
        System.out.println("Ingrese los productos y su precio");
        System.out.println("Producto: ");
        String producto = leerValores.next();
        System.out.println("Precio: ");
        double precio = leerValores.nextDouble();
        return new Producto(producto, precio);
    }

    public void agregarProducto() {
        String respuesta = "";
        System.out.println("----- Agregando producto a la lista-----");
        do {
            int cont = productos.size()+1;
            Producto nuevoProducto = crearProducto();
            productos.put(cont, nuevoProducto);
            System.out.println("Desea agregar otro producto?(s/n)");
            respuesta = leerValores.next();
            while (!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n"))) {
                System.out.println("Respuesta incorrecta \n"
                        + "Intente nuevamente: ");
                respuesta = leerValores.next();
            }
            
        } while (respuesta.equalsIgnoreCase("s"));

    }

    public void modificarPrecio() {
        System.out.println("-----Modificador de precios-----");
        System.out.println("Ingrese el ID de producto al que quiere modificar el precio");
        mostrarLista();
        System.out.println("");
        System.out.print("ID: ");
        int respuesta = leerValores.nextInt();
        double nuevoPrecio = 0;

        if (productos.containsKey(respuesta)) {
            System.out.println("Ingrese el precio a cambiar");
            nuevoPrecio = leerValores.nextDouble();
            productos.get(respuesta).setPrecio(nuevoPrecio);
            System.out.println("Precio cambiado con exito");
        } else {
            System.out.println("El producto no esta en la lista");
        }
    }

    public void eliminarProducto() {
        System.out.println("-----Eliminador de productos-----");
        System.out.println("Ingrese el ID del producto que desea eliminar:");
        mostrarLista();
        System.out.println("");
        System.out.print("ID: ");
        int respuesta = leerValores.nextInt();
        if (productos.containsKey(respuesta)) {

            productos.remove(respuesta);
            System.out.println("El producto fue eliminado");
        } else {
            System.out.println("El producto no esta en la lista");
        }
    }

    public void mostrarLista() {
        System.out.println("-----Listado de productos-----");
        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Integer key = entry.getKey();
            Producto value = entry.getValue();
            System.out.println("ID: " + key +"  "+value.getNombre()+"   $"+value.getPrecio());
        }
    }

    public void menu() {
        String opcion = "";

        do {
            System.out.println("-----Menu----- \n"
                    + "Ingrese una opcion del menu: \n"
                    + "1- Agregar producto: \n"
                    + "2- Modificar precio \n"
                    + "3- Eliminar producto \n"
                    + "4- Mostrar listado \n"
                    + "5- Salir \n"
                    +" \n"
                    +"Opcion: ");
            
            opcion = leerValores.next();
            leerValores.nextLine();
            switch (opcion) {
                case "1":
                    agregarProducto();
                    break;
                case "2":
                    modificarPrecio();
                    break;
                case "3":
                    eliminarProducto();
                    break;
                case "4":
                    mostrarLista();
                    break;
                case "5":
                    System.out.println("Muchas gracias");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!opcion.equalsIgnoreCase("5"));

    }

}
