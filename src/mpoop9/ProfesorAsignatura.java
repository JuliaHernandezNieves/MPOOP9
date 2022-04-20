/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un ProfesorAsignatura
 * @author Julia Hernandez Nieves
 */
public class ProfesorAsignatura extends Profesor{
    private String nombreAsignatura;

    public ProfesorAsignatura() {
    }
/**
 * Metodo que muestra los datos de un ProfesorAsignatura
 * @param nombreAsignatura  Nombre de Asignatura de un ProfesorAsignatura
 */
    public ProfesorAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
/**
 * Metodo que muestra los datos de un ProfesorAsignatura
 * @return Asignatura de un ProfesorAsignatura
 */
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    @Override
    public String toString() {
        return super.toString() +"ProfesorAsignatura{" + '}';
    }
    
    
}
