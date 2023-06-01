/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Sanplas8
 */
public enum Nombres {
    NOMBRE1("Hugo"),NOMBRE2("Mateo"),NOMBRE3("Martin"),NOMBRE4("Lucas"),NOMBRE5("Leonardo"),NOMBRE6("Daniel"),NOMBRE7("Alejandro"),
    NOMBRE8("Manuel"),NOMBRE9("Pablo"),NOMBRE10("Alvaro"),NOMBRE11("Adrian"),NOMBRE12("Enzo"),NOMBRE13("Mario"),NOMBRE14("Diego"),
    NOMBRE15("David"),NOMBRE16("Marcos"),NOMBRE17("Thiago"),NOMBRE18("Marco"),NOMBRE19("Alex"),NOMBRE20("Javier"),NOMBRE21("Bruno"),
    NOMBRE22("Miguel"),NOMBRE23("Antonio"),NOMBRE24("Gonzalo"),NOMBRE25("Carlos"),NOMBRE26("Juan"),NOMBRE27("Nicolas"),NOMBRE28("Jose"),
    NOMBRE29("Sergio"),NOMBRE30("Gabriel"),NOMBRE31("Jorge"),NOMBRE32("Dario"),NOMBRE33("Francisco"),NOMBRE34("Rodrigo"),NOMBRE35("Ian"),
    NOMBRE36("Ruben"),NOMBRE37("Victor"),NOMBRE38("Guillermo"),NOMBRE39("Luis"),NOMBRE40("Santiago");
    
    private String nombre;

    private Nombres(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
