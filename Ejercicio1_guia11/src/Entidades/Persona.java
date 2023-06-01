/*
 
 */
package Entidades;

/**
 *
 * @author toto_
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int dni, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona: \n" + 
                "Nombre y apellido: " + nombre +" "+ apellido + " \n"+
                "Edad: " + edad + " \n"+ 
                "Dni: " + dni + " \n"+
                "Perro: " + mascota ;
    }
    
    
}
