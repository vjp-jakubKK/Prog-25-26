/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Carlos", "Matemáticas");
        Alumno alumno = new Alumno("Lucía", "2ºB");

        System.out.println("SALUDOS SIN POLIMORFISMO:");
        System.out.println(profesor.Saludar());
        System.out.println(alumno.Saludar());

        // Polimorfismo
        Persona p1 = new Profesor("Ana", "Historia");
        Persona p2 = new Alumno("Miguel", "1ºA");

        System.out.println("SALUDOS CON POLIMORFISMO:");
        System.out.println(p1.Saludar());
        System.out.println(p2.Saludar());
    }
    
}
