/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        try {
            System.out.println("Introduce el dividendo: ");
            numero1 = entrada.nextInt();
            System.out.println("Introduce el divisor: ");
            numero2 = entrada.nextInt();
            
            resultado = numero1 / numero2;
            
            System.out.println("El resultado es: " + resultado);
        }
        catch(ArithmeticException e) {
            System.out.println("Número introducido no válido");
        }
    }
    
}
