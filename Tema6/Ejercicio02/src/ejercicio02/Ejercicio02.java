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
        Persona p1 = new Alumno("Carlos", "2ºA");
        Persona p2 = new Profesor("Laura", "Informática");

        System.out.println(p1.saludar());
        System.out.println(p2.saludar());
    }
    
}
