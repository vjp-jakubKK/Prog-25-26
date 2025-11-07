/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Instancio un objeto del tipo que he creado
        // 1.1 Con constructor parametrizado y estableciendo valores con setters
        Coche miCoche = new Coche();
        System.out.println(miCoche.toString());
        
        miCoche.setEspejos(5);
        System.out.println(miCoche.toString());
        
        System.out.println(miCoche.getEspejos());
        
        miCoche.acelerar();
        
        // 1.2 Con constructor parametrizado, inicializando los atributos
        // con los valores pasados por parámetro
        Coche tuCoche = new Coche("Michelin", "Bajo", 3);
        System.out.println(tuCoche.toString());
        
        // Esto hace lo mismo que la línea anterior, porque detecta el toString() automáticamente
        System.out.println(tuCoche); 
        
        System.out.println(tuCoche.getRuedas());
    }
    
}
