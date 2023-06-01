/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Sanplas8
 */
public class Voto {
    private Alumno alumnoQuevota;
    private HashSet<Alumno> alumnosQueVoto;

    public Voto() {
        this.alumnosQueVoto = new HashSet();
    }

    public Voto(Alumno alumnoQuevota, HashSet<Alumno> alumnosQueVoto) {
        this.alumnoQuevota = alumnoQuevota;
        this.alumnosQueVoto = alumnosQueVoto;
    }

    public Alumno getAlumnoQuevota() {
        return alumnoQuevota;
    }

    public void setAlumnoQuevota(Alumno alumnoQuevota) {
        this.alumnoQuevota = alumnoQuevota;
    }

    public HashSet<Alumno> getAlumnosQueVoto() {
        return alumnosQueVoto;
    }

    public void setAlumnosQueVoto(HashSet<Alumno> alumnosQueVoto) {
        this.alumnosQueVoto = alumnosQueVoto;
    }

    @Override
    public String toString() {
        ArrayList<Alumno> alumnosQueVoto = new ArrayList(this.alumnosQueVoto);
        return  "Y los alumnos que voto son: \n" + 
                "1- Nombre: "+alumnosQueVoto.get(0).getNombreCompleto()+", Dni: "+alumnosQueVoto.get(0).getDni()+ " \n"+
                "2- Nombre: "+alumnosQueVoto.get(1).getNombreCompleto()+", Dni: "+alumnosQueVoto.get(1).getDni()+ " \n"+
                "3- Nombre: "+alumnosQueVoto.get(2).getNombreCompleto()+", Dni: "+alumnosQueVoto.get(2).getDni()+ " \n";
    }
    
    
}
