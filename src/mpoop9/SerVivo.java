/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de un SerVivo
 * @author Julia Hernandez Nieves
 */
public abstract class SerVivo {
     public abstract String nombre();
      public abstract int edad();
/**
 * Metodo que muestra los datos de un SerVivo
 * @return Nombre y edad de un SerVivo
 */
    @Override
    public String toString() {
        return "SerVivo{" + '}';
    }
      
     
}
