/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un Perro
 * @author Julia Hernandez Nieves
 */
public class Perro extends Mascota{
    private boolean colaCortada;

    public Perro() {
    }
/**
 * Metodo que muestra los datos de un Perro
 * @param colaCortada  colacortada de un Perro
 */
    public Perro(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
/**
 * Metodo que muestra los datos de un Perro
 * @return colaCortada de un Perro
 */
    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    @Override
    public String toString() {
        return super.toString() +"Perro{" + '}';
    }

    
    
    
}
