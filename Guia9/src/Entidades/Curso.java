/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author toto_
 */
public class Curso {
    private String nombreCurso;
    private int cantHorasDia;
    private int cantDiasSemana;
    private String turno;
    private double precioHora;
    private String [] alumnos = new String [5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHorasDia, int cantDiasSemana, String turno, double precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantHorasDia = cantHorasDia;
        this.cantDiasSemana = cantDiasSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasDia() {
        return cantHorasDia;
    }

    public void setCantHorasDia(int cantHorasDia) {
        this.cantHorasDia = cantHorasDia;
    }

    public int getCantDiasSemana() {
        return cantDiasSemana;
    }

    public void setCantDiasSemana(int cantDiasSemana) {
        this.cantDiasSemana = cantDiasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
