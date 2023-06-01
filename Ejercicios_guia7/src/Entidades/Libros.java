/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Libros {
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    Scanner leerValores = new Scanner(System.in);
    public Libros() {
    }

    public Libros(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void cargarUnLibro(){
        System.out.println("----- Por favor ingrese los datos del libro a crear -----");
        
        System.out.println("Introduzca el codigo sbnd de 13 digitos: ");
        this.isbn = leerValores.nextLine();
        System.out.println("Introduzca el titulo del libro: ");
        this.titulo = leerValores.nextLine();
        System.out.println("Introduzca el autor del libro: ");
        this.autor = leerValores.nextLine();
        System.out.println("Introduzca el numero de paginas del libro: ");
        this.numeroPaginas = leerValores.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("Los datos ingresados son los siguientes: \n"+
                "ISBN :" +isbn+ "\n"+
                "Titulo: "+titulo+"\n"+
                "Autot: "+autor+"\n"+
                "Cantidad de paginas: "+numeroPaginas);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    
    
}
