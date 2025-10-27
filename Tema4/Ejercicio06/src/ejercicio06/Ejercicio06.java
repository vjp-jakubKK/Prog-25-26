/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduce la nota recibida: ");
        nota = entrada.nextInt();
        
        calificacion(nota);
        
    }
    
    public static void calificacion (int nota) {
        if (nota > 0 && nota <=4) {
            System.out.println("Suspenso");
        }else if (nota >= 4 && nota <= 6) {
            System.out.println("Bien");
        }else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        }else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }else {
            System.out.println("No has introducido un número válido.");
            System.out.println("Introduce un valor entre 0 y 10.");
        }
    }
    
}
