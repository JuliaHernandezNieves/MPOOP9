/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un Mesero
 * @author Julia Hernandez Nieves
 */
public class Mesero extends Empleado{
    private String restaurante;
    private int numMesas;
    private String colorDeUniforme;

    public Mesero() {
    }
/**
 * Metodo que muestra los datos de un Mesero
 * @param restaurante Restaurante donde trabaja un Mesero
 * @param numMesas Numero de mesas que atiende un Mesero
 * @param colorDeUniforme Color de uniforme de un Mesero
 */
    public Mesero(String restaurante, int numMesas, String colorDeUniforme) {
        this.restaurante = restaurante;
        this.numMesas = numMesas;
        this.colorDeUniforme = colorDeUniforme;
    }
/**
 * Metodo que muestra los datos de un Mesero
 * @return Restaurante, numero de mesas, color de uniforme de un Mesero
 */
    public String getRestaurante() {
        return restaurante;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public String getColorDeUniforme() {
        return colorDeUniforme;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public void setColorDeUniforme(String colorDeUniforme) {
        this.colorDeUniforme = colorDeUniforme;
    }

    @Override
    public String toString() {
        return super.toString() +"Mesero{" + '}';
    } 
}
