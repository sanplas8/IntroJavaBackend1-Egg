/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alumno;
import Entidades.Voto;
import Enums.Apellidos;
import Enums.Nombres;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class Simulador {

    private Scanner leerValores;

    public Simulador() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
    }

    public ArrayList<String> nombresAlumnos() {
        Nombres[] listadoNombres = Nombres.values();
        Apellidos[] listadoApellidos = Apellidos.values();
        ArrayList<String> nombresCompletos = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            String nombre = listadoNombres[(int) (Math.random() * (listadoNombres.length))].getNombre();
            String apellido = listadoApellidos[(int) (Math.random() * (listadoApellidos.length))].getApellido();
            nombresCompletos.add(nombre + " " + apellido);
        }
        return nombresCompletos;
    }

    public HashSet<Integer> dni() {
        HashSet<Integer> listadoDni = new HashSet();
        do {
            int dni = (int) (Math.random() * (45000000 - 14000000 + 1)) + 14000000;
            listadoDni.add(dni);
        } while (listadoDni.size() < 1000);
        return listadoDni;
    }

    public ArrayList<Alumno> crearAlumnos() {
        ArrayList<String> listadoNombres = nombresAlumnos();
        ArrayList<Integer> listadoDni = new ArrayList(dni());
        ArrayList<Alumno> listadoAlumnos = new ArrayList();
        System.out.print("Ingrese la cantidad de alumnos que desea crear. \n"
                + "Cantidad: ");
        int cantAlumnos = leerValores.nextInt();
        while (cantAlumnos < 15) {
            System.out.print("La cantidad de alumnos debe ser mayor a 15, intente nuevamente. \n"
                    + "Cantidad: ");
            cantAlumnos = leerValores.nextInt();
        }
        for (int i = 0; i < cantAlumnos; i++) {
            Alumno nuevoAlumno = new Alumno();
            nuevoAlumno.setNombreCompleto(listadoNombres.get((int) (Math.random() * listadoNombres.size())));
            nuevoAlumno.setDni(listadoDni.get(i));
            listadoAlumnos.add(nuevoAlumno);
        }

        return listadoAlumnos;
    }

    public void mostrarAlumnos(ArrayList<Alumno> nuevoListado) {
        int j = 1;
        System.out.println("-----Listado de Alumnos-----");
        for (Alumno alumno : nuevoListado) {
            System.out.println("Alumno " + j);
            System.out.println(alumno.toString());
            j++;
        }

        System.out.println("-----------------------------");
    }

    public HashSet<Voto> votacion(ArrayList<Alumno> nuevoListado) {
        HashSet<Voto> listaVotacion = new HashSet();
        int posAlumno;
        for (Alumno aux : nuevoListado) {
            Voto nuevoVoto = new Voto();
            nuevoVoto.setAlumnoQuevota(aux);
            do {
                posAlumno = (int) (Math.random() * nuevoListado.size());
                if (aux != nuevoListado.get(posAlumno)) {
                    nuevoVoto.getAlumnosQueVoto().add(nuevoListado.get(posAlumno));
                    nuevoListado.get(posAlumno).setCantVotos((nuevoListado.get(posAlumno).getCantVotos() + 1));
                }
            } while (nuevoVoto.getAlumnosQueVoto().size() < 3);
            /*for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0:
                        do {
                            posAlumno = (int) (Math.random() * nuevoListado.size());
                        } while (aux == nuevoListado.get(posAlumno));
                        nuevoVoto.getAlumnosQueVoto().add(nuevoListado.get(posAlumno));
                        nuevoListado.get(posAlumno).setCantVotos((nuevoListado.get(posAlumno).getCantVotos() + 1));
                        break;
                    case 1:
                        do {
                            posAlumno = (int) (Math.random() * nuevoListado.size());
                        } while (aux == nuevoListado.get(posAlumno) || nuevoVoto.getAlumnosQueVoto().get(0) == nuevoListado.get(posAlumno));
                        nuevoVoto.getAlumnosQueVoto().add(nuevoListado.get(posAlumno));
                        nuevoListado.get(posAlumno).setCantVotos((nuevoListado.get(posAlumno).getCantVotos() + 1));
                        break;
                    case 2:
                        do {
                            posAlumno = (int) (Math.random() * nuevoListado.size());
                        } while (aux == nuevoListado.get(posAlumno) || nuevoVoto.getAlumnosQueVoto().get(0) == nuevoListado.get(posAlumno)
                                || nuevoVoto.getAlumnosQueVoto().get(1) == nuevoListado.get(posAlumno));
                        nuevoVoto.getAlumnosQueVoto().add(nuevoListado.get(posAlumno));
                        nuevoListado.get(posAlumno).setCantVotos((nuevoListado.get(posAlumno).getCantVotos() + 1));

                }
            }*/
            listaVotacion.add(nuevoVoto);
        }
        return listaVotacion;
    }

    public void mostrarVotaciones(HashSet<Voto> nuevaVotacion) {
        int j = 1;
        System.out.println("-----Listado de votaciones-----");
        for (Voto aux : nuevaVotacion) {
            System.out.println("Alumno " + j + ": " + aux.getAlumnoQuevota().getNombreCompleto() + ", Dni: " + aux.getAlumnoQuevota().getDni());
            System.out.println("Obtuvo " + aux.getAlumnoQuevota().getCantVotos() + " votos");
            System.out.println(aux.toString());
            j++;
        }
        System.out.println("-------------------------------------");
    }

    public void ordenarMasVotados(ArrayList<Alumno> nuevoListado) {
        nuevoListado.sort(Alumno.compararVotos);
    }

    public void mostrarFacilitadores(ArrayList<Alumno> nuevoListado) {
        ordenarMasVotados(nuevoListado);
        System.out.println("-----Listado de facilitadores-----");
        System.out.println("*****Titulares******");
        int j = 1;
        for (Alumno aux : nuevoListado.subList(0, 5)) {
            System.out.println("Alumno " + j + " \n"
                    + aux.toString());
            j++;
        }
        System.out.println("*****Suplentes******");
        int i = 1;
        for (Alumno aux : nuevoListado.subList(5, 10)) {
            System.out.println("Alumno " + i + " \n"
                    + aux.toString());
            i++;
        }
    }
}
