/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de una Persona
 * @author Julia Hernandez Nieves
 */
public class Persona extends SerVivo{
    private Mascota mascota;
    private String nombre;
    private int edad;

    public Persona() {
    }
/**
 * Metodo que muestra los datos de una Persona
 * @param mascota Mascota de una Persona
 */
    public Persona(Mascota mascota) {
        this.mascota = mascota;
    }
/**
 * Metodo que muestra los datos de una Persona
 * @return Mascota de una Persona
 */
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return super.toString() +"Persona{" + '}';
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int edad() {
        return edad;

    }
}
