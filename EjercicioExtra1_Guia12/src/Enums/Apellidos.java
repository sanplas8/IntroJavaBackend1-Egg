/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Sanplas8
 */
public enum Apellidos {
    APELLIDO1("Plastine"),APELLIDO2("Fernandez"),APELLIDO3("Lopez"),APELLIDO4("Gutierrez"),
    APELLIDO5("Ramirez"),APELLIDO6("Hernandez"),APELLIDO7("Garcia"),APELLIDO8("Gonzalez"),
    APELLIDO9("Gomez"),APELLIDO10("Pujadas"),APELLIDO11("Leiva"),APELLIDO12("Villanueva"),
    APELLIDO13("Galvan"),APELLIDO14("Galarza"),APELLIDO15("Posse"),APELLIDO16("Brites"),
    APELLIDO17("De Niro"),APELLIDO18("Stalone"),APELLIDO19("Balboa"),APELLIDO20("Guzman");
    
    private String apellido;

    private Apellidos(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
