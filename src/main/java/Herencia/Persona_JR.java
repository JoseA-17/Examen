
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author anton
 */
public class Persona_JR
{
    private String Nombre_JR;
    private int Edad_JR;
    private String Direccion_JR;

    public Persona_JR(String Nombre_JR, int Edad_JR, String Direccion_JR) {
        this.Nombre_JR = Nombre_JR;
        this.Edad_JR = Edad_JR;
        this.Direccion_JR = Direccion_JR;
    }

    public String getNombre_JR() {
        return Nombre_JR;
    }

    public void setNombre_JR(String Nombre_JR) {
        this.Nombre_JR = Nombre_JR;
    }

    public int getEdad_JR() {
        return Edad_JR;
    }

    public void setEdad_JR(int Edad_JR) {
        this.Edad_JR = Edad_JR;
    }

    public String getDireccion_JR() {
        return Direccion_JR;
    }

    public void setDireccion_JR(String Direccion_JR) {
        this.Direccion_JR = Direccion_JR;
    } 
    
}
