/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.AMotor;
import Clases.Alquiler;
import Clases.Barco;
import Clases.Cliente;
import Clases.Velero;
import Clases.YatesDeLujo;
import Enums.Apellidos;
import Enums.Nombres;
import com.sun.source.tree.InstanceOfTree;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class AlquilerServicio {

    private Scanner leerValores;
    private HashSet<Barco> listadoBarcos;
    private HashSet<Cliente> listadoClientes;

    public AlquilerServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.listadoBarcos = new HashSet();
        this.listadoClientes = new HashSet();
    }

    public AlquilerServicio(Scanner leerValores, HashSet<Barco> listadoBarcos, HashSet<Cliente> listadoClientes) {
        this.leerValores = leerValores;
        this.listadoBarcos = listadoBarcos;
        this.listadoClientes = listadoClientes;
    }

    public Scanner getLeerValores() {
        return leerValores;
    }

    public void setLeerValores(Scanner leerValores) {
        this.leerValores = leerValores;
    }

    public HashSet<Barco> getListadoBarcos() {
        return listadoBarcos;
    }

    public void setListadoBarcos(HashSet<Barco> listadoBarcos) {
        this.listadoBarcos = listadoBarcos;
    }

    public HashSet<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public void setListadoClientes(HashSet<Cliente> listadoClientes) {
        this.listadoClientes = listadoClientes;
    }

    public void crearListadoClientes(Alquiler alquiler) {
        do {
            Nombres[] listadoNombres = Nombres.values();
            Apellidos[] listadoApellidos = Apellidos.values();
            String nombre = listadoNombres[(int) (Math.random() * (listadoNombres.length))].getNombre();
            String apellido = listadoApellidos[(int) (Math.random() * (listadoApellidos.length))].getApellido();
            Integer dni = (int) (Math.random() * (45000000 - 14000000 + 1)) + 14000000;
            Cliente nuevoCliente = new Cliente(nombre, apellido, nombre + apellido, dni);
            listadoClientes.add(nuevoCliente);
        } while (listadoClientes.size() < alquiler.getPosicionAmarrre().length);
    }

    public void crearVelero() {
        System.out.print("Ingrese cantidad de mastiles: ");
        Integer mastiles = leerValores.nextInt();
        System.out.print("Ingrese matricula: ");
        String matricula = leerValores.next();
        System.out.println("Ingrese anio de fabricacion: ");
        System.out.print("Anio: ");
        Integer anio = leerValores.nextInt();
        System.out.print("Mes: ");
        Integer mes = leerValores.nextInt();
        System.out.print("Dia: ");
        Integer dia = leerValores.nextInt();
        Date anioFabricacion = new Date(anio - 1900, mes + 1, dia);
        System.out.print("Ingrese tamanio en mts: ");
        Double slora = leerValores.nextDouble();
        Velero nuevoVelero = new Velero(mastiles, matricula, anioFabricacion, slora);
        listadoBarcos.add(nuevoVelero);
    }

    public void crearAMotor() {
        System.out.print("Ingrese potencia CV del motor: ");
        Integer potenciaCV = leerValores.nextInt();
        System.out.print("Ingrese matricula: ");
        String matricula = leerValores.next();
        System.out.println("Ingrese anio de fabricacion: ");
        System.out.print("Anio: ");
        Integer anio = leerValores.nextInt();
        System.out.print("Mes: ");
        Integer mes = leerValores.nextInt();
        System.out.print("Dia: ");
        Integer dia = leerValores.nextInt();
        Date anioFabricacion = new Date(anio - 1900, mes + 1, dia);
        System.out.print("Ingrese tamanio en mts: ");
        Double slora = leerValores.nextDouble();
        AMotor nuevoAMotor = new AMotor(potenciaCV, matricula, anioFabricacion, slora);
        listadoBarcos.add(nuevoAMotor);
    }

    public void crearYate() {
        System.out.print("Ingrese potencia CV del motor: ");
        Integer potenciaCV = leerValores.nextInt();
        System.out.print("Ingrese cantidad de camarotes: ");
        Integer cantCamarotes = leerValores.nextInt();
        System.out.print("Ingrese matricula: ");
        String matricula = leerValores.next();
        System.out.println("Ingrese anio de fabricacion: ");
        System.out.print("Anio: ");
        Integer anio = leerValores.nextInt();
        System.out.print("Mes: ");
        Integer mes = leerValores.nextInt();
        System.out.print("Dia: ");
        Integer dia = leerValores.nextInt();
        Date anioFabricacion = new Date(anio - 1900, mes + 1, dia);
        System.out.print("Ingrese tamanio en mts: ");
        Double slora = leerValores.nextDouble();
        YatesDeLujo nuevoYate = new YatesDeLujo(cantCamarotes, potenciaCV, matricula, anioFabricacion, slora);
        listadoBarcos.add(nuevoYate);
    }

    public Integer diasDeOcupacion(Alquiler alquiler) {
        Calendar inicio = Calendar.getInstance();
        inicio.setTime(alquiler.getFechaAlquiler());
        Calendar finalizacion = Calendar.getInstance();
        finalizacion.setTime(alquiler.getFechaDevolucion());
        Integer difDias = (int) (finalizacion.getTimeInMillis() - inicio.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        return difDias;
    }

    public Double costo(Barco tipoBarco, Alquiler alquiler) {
        Double moduloBase = tipoBarco.getEslora() * 10d;
        Integer costoPorDias = diasDeOcupacion(alquiler);
        Double costoTotal = costoPorDias * moduloBase;
        if (tipoBarco instanceof Velero) {
            costoTotal += (((Velero) tipoBarco).getNumMastiles());
        } else if (tipoBarco instanceof AMotor) {
            costoTotal += (((AMotor) tipoBarco).getPotenciaCV());
        } else if (tipoBarco instanceof YatesDeLujo) {
            costoTotal += (((AMotor) tipoBarco).getPotenciaCV() + ((YatesDeLujo) tipoBarco).getCantCamarotes());
        }
        return costoTotal;
    }

    public Alquiler simularAlquiler() {
        return new Alquiler();
    }
    
    public Date solicitarFechaInicio(){
        System.out.println("Ingrese fecha de inicio del alquiler: ");
        System.out.print("Anio: ");
        int anio = leerValores.nextInt();
        
        System.out.print("Mes: ");
        int mes = leerValores.nextInt();
        
        System.out.print("Dia: ");
        int dia = leerValores.nextInt();
        return new Date(anio-1900, mes+1, dia);
    }
    
    public Date solicitarFechaDevolucion(){
        System.out.println("Ingrese fecha de devolucion del alquiler: ");
        System.out.print("Anio: ");
        int anio = leerValores.nextInt();
        
        System.out.print("Mes: ");
        int mes = leerValores.nextInt();
        
        System.out.print("Dia: ");
        int dia = leerValores.nextInt();
        return new Date(anio-1900, mes+1, dia);
    }
    
    

    public void mostrarAlquiler(Alquiler alquiler, int i) {
        System.out.println("-----Info Alquiler-----");
        alquiler.setCliente(listadoClientes.iterator().next());
        alquiler.setBarco(listadoBarcos.iterator().next());
        alquiler.setFechaAlquiler(solicitarFechaInicio());
        alquiler.setFechaDevolucion(solicitarFechaDevolucion());
        System.out.println(alquiler.getCliente().toString());
        System.out.println("Fecha inicio de alquiler: "+alquiler.getFechaAlquiler());
        System.out.println("Fecha devolucion de alquiler: "+alquiler.getFechaDevolucion());
        System.out.println("Barco: "+alquiler.getBarco().getClass().getSimpleName());
        System.out.println("Posicion de Amarre: "+i);
        System.out.println("Costo alquiler: "+costo(alquiler.getBarco(), alquiler));
        System.out.println("-------------------------------");
    }
}
