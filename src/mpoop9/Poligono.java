/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un Poligono
 * @author Julia Hernandez Nieves
 */
public abstract class Poligono {
    public abstract float area();
    public abstract float perimetro();
/**
 * Metodo que muestra los datos de un Poligono
 * @return Área y perimetro de un Poligono
 */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}

