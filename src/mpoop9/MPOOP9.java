/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop9;

/**
 *
 * @author Julia Gabriela Hernandez 
 */
public class MPOOP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Poligono pol = new Poligono() {}; X No se pueden instanciar clases abstractas
        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo);
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        
        System.out.println(triangulo.getBase());
        Triangulo triangulo2 = triangulo;
        System.out.println(triangulo2.getBase());
        triangulo2.setBase(9);
        System.out.println(triangulo2.getBase());
        System.out.println(triangulo.getBase());
        
        triangulo2.setBase(triangulo.getBase());
        
        
        System.out.println("############");
        
        Mascota mascota = new Mascota();
        System.out.println(mascota);
        Persona persona = new Persona();
        System.out.println(persona);
        
        Perro perro = new Perro();
        System.out.println(perro);
        Gato gato = new Gato();
        System.out.println(gato);
        
        Alumno alumno = new Alumno();
        System.out.println(alumno);
        Empleado empleado = new Empleado();
        System.out.println(empleado);
        
        Mesero mesero = new Mesero();
        System.out.println(mesero);
        Profesor profesor = new Profesor();
        System.out.println(profesor);
        
        ProfesorAsignatura profesorAsignatura = new ProfesorAsignatura();
        System.out.println(profesorAsignatura);
        ProfesorCarrera profesorCarrera = new ProfesorCarrera();
        System.out.println(profesorCarrera);
    }
    
}
