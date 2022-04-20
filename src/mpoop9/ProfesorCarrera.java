/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un ProfesorCarrera
 * @author Julia Hernandez Nieves
 */
public class ProfesorCarrera extends Profesor{
    private String asignatura;
    private int grupos;

    public ProfesorCarrera() {
    }
/**
 * Metodo que muestra los datos de un ProfesorCarrera
 * @param asignatura Asignatura de un ProfesorCarrera
 * @param grupos Grupos de un ProfesorCarrera
 */
    public ProfesorCarrera(String asignatura, int grupos) {
        this.asignatura = asignatura;
        this.grupos = grupos;
    }
/**
 * Metodo que muestra los datos de un ProfesorCarrera
 * @return Asignatura y grupos de un ProfesorCarrera
 */
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return super.toString() +"ProfesorCarrera{" + '}';
    }
    
    
}
