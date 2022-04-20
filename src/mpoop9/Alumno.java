/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un Alumno
 * @author Julia Hernandez Nieves
 */
public class Alumno extends Persona{
    private String carrera;
    private int semestre;

    public Alumno() {
    }
/**
 * Metodo que muestra los datos de un Alumno
 * @param carrera Carrera de un Alumno
 * @param semestre Semestre de un Alumno
 */
    public Alumno(String carrera, int semestre) {
        this.carrera = carrera;
        this.semestre = semestre;
    }
/**
 * Metodo que muestra los datos de un Alumno
 * @return Carrera y semestre de un Alumno
 */
    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() +"Alumno{" + '}';
    }  
}
