/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        
        do {
            System.out.print("Introduce un número no negativo para calcular su raíz cuadrada: ");
            numero = scanner.nextDouble();
            if (numero < 0) {
                System.out.println("Error: El número no puede ser negativo. Inténtalo de nuevo.");  
            }
        } while (numero < 0);
        
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
    }
    
}