/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un Profesor
 * @author Julia Hernandez Nieves
 */
public class Profesor extends Empleado{
    private int numAlumnos;

    public Profesor() {
    }
/**
 * Metodo que muestra los datos de un Profesor
 * @param numAlumnos Numero de alumnos de un Profesor
 */
    public Profesor(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
/**
 * Metodo que muestra los datos de un Profesor
 * @return Número de alumnos de un Profesor
 */
    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    @Override
    public String toString() {
        return super.toString() +"Profesor{" + '}';
    }
    
    
    
}
