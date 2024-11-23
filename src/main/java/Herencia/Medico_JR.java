/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author anton
 */
public class Medico_JR extends Persona_JR
{
    private String Especialidad_JR;
    private int AniosExp_JR;

    public Medico_JR(String Especialidad_JR, int AniosExp_JR, String Nombre_JR, int Edad_JR, String Direccion_JR) {
        super(Nombre_JR, Edad_JR, Direccion_JR);
        this.Especialidad_JR = Especialidad_JR;
        this.AniosExp_JR = AniosExp_JR;
    }

    public String getEspecialidad_JR() {
        return Especialidad_JR;
    }

    public void setEspecialidad_JR(String Especialidad_JR) {
        this.Especialidad_JR = Especialidad_JR;
    }

    public int getAniosExp_JR() {
        return AniosExp_JR;
    }

    public void setAniosExp_JR(int AniosExp_JR) {
        this.AniosExp_JR = AniosExp_JR;
    }
    
            
    public Medico_JR(String Nombre_JR, int Edad_JR, String Direccion_JR)
    {
        super(Nombre_JR, Edad_JR, Direccion_JR);
    }
    
}
