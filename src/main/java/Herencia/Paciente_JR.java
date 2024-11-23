/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author anton
 */
public class Paciente_JR extends Persona_JR
{
    private int NroHistorial_JR;
    private String Enfermedad_JR;

    public Paciente_JR(int NroHistorial_JR, String Enfermedad_JR, String Nombre_JR, int Edad_JR, String Direccion_JR) {
        super(Nombre_JR, Edad_JR, Direccion_JR);
        this.NroHistorial_JR = NroHistorial_JR;
        this.Enfermedad_JR = Enfermedad_JR;
    }

    public int getNroHistorial_JR() {
        return NroHistorial_JR;
    }

    public void setNroHistorial_JR(int NroHistorial_JR) {
        this.NroHistorial_JR = NroHistorial_JR;
    }

    public String getEnfermedad_JR() {
        return Enfermedad_JR;
    }

    public void setEnfermedad_JR(String Enfermedad_JR) {
        this.Enfermedad_JR = Enfermedad_JR;
    }
    
    public Paciente_JR(String Nombre_JR, int Edad_JR, String Direccion_JR) {
        super(Nombre_JR, Edad_JR, Direccion_JR);
    }
}
