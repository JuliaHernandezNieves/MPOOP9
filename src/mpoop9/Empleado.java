/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un Empleado
 * @author Julia Hernandez Nieves
 */
public class Empleado extends Persona{
    private float salario;
    private int horaEntrada;
    private int horaSalida;

    public Empleado() {
    }
/**
 * Metodo que muestra los datos de un Empleado
 * @param salario Salario de un Empleado
 * @param horaEntrada Hora de entrada de un Empleado
 * @param horaSalida Hora de salida de un Empleado
 */
    public Empleado(float salario, int horaEntrada, int horaSalida) {
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
/**
 * Metodo que muestra los datos de un Empleado
 * @return Salario, horaEntrada, horaSalida de un Empleado
 */
    public float getSalario() {
        return salario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return super.toString() +"Empleado{" + '}';
    }  
}
