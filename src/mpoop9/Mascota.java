 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que muestra los datos de una Mascota
 * @author Julia Hernandez Nieves
 */
public class Mascota extends SerVivo{
    private String color;
    private int edad;
    private String raza;
    private String colorOjos;
    private String nombre;

    public Mascota() {
    }
/**
 * Metodo que muestra los datos de una Mascota
 * @param color Color de una Mascota
 * @param edad Edad de una Mascota
 * @param raza Raza de una Mascota
 * @param colorOjos Color de ojos de una Mascota
 */
    public Mascota(String color, int edad, String raza, String colorOjos) {
        this.color = color;
        this.edad = edad;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
/**
 * Metodo que muestra los datos de una Mascota
 * @return Color, edad, raza, colorOjos de una Mascota
 */
    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return super.toString() +"Mascota{" + '}';
    }

   
    @Override
    public int edad() {
        return edad;
    }

    @Override
    public String nombre() {     
        return nombre;
    }

    
    }

