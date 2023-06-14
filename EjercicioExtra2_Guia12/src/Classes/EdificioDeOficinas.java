/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Sanplas8
 */
public final class EdificioDeOficinas extends Edificio{
    private Integer cantOficinas;
    private Integer cantPersXoficina;
    private Integer cantPisos;

    public EdificioDeOficinas() {
    }
    
    

    public EdificioDeOficinas(Integer cantOficinas, Integer cantPersXoficina, Integer cantPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersXoficina = cantPersXoficina;
        this.cantPisos = cantPisos;
    }

    public Integer getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(Integer cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public Integer getCantPersXoficina() {
        return cantPersXoficina;
    }

    public void setCantPersXoficina(Integer cantPersXoficina) {
        this.cantPersXoficina = cantPersXoficina;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    @Override
    public Double calcularSuperficie() {
        return this.largo*this.ancho*this.cantPisos;
    }

    @Override
    public Double clcularVolumen() {
        return this.largo*this.ancho*(this.alto);        
    }
    
    public void cantPersonas(){
        float superficieOficina = (float) (this.largo*this.ancho)/this.cantOficinas;
        this.cantPersXoficina = (int) Math.round(superficieOficina/4d);
        System.out.println("La cantidad de personas que entran por piso es de "+this.cantPersXoficina+ " personas y en todo el edificio entraran "+this.cantPersXoficina*this.cantOficinas*this.cantPisos); 
    }
    
    
}
