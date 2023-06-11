/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Sanplas8
 */
public final class YatesDeLujo extends AMotor {
    private Integer cantCamarotes;

    public YatesDeLujo(Integer cantCamarotes, Integer potenciaCV) {
        super(potenciaCV);
        this.cantCamarotes = cantCamarotes;
    }

    public YatesDeLujo(Integer cantCamarotes, Integer potenciaCV, String matricula, Date anioFabricacion, Double eslora) {
        super(potenciaCV, matricula, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    public Integer getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(Integer cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }
    
    
}
