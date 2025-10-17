/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg27;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        int opcion;
        int suma, resta, multiplicacion, division;
        
        Scanner entrada = new Scanner(System.in);
        
        try {
            System.out.println("Introduce el primer numero: ");
            numero1 = entrada.nextInt();
            System.out.println("Introduce el segundo numero: ");
            numero2 = entrada.nextInt();
        
        do {
            System.out.println("1. Sumar los números.");
            System.out.println("2. Restar los números.");
            System.out.println("3. Multiplicar los números.");
            System.out.println("4. dividir los números.");
            System.out.println("5. Salir del programa.");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1: {
                    suma = numero1 + numero2;
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                }
                case 2: {
                    resta = numero1 - numero2;
                    System.out.println("El resultado de la suma es: " + resta);
                    break;
                }
                case 3: {
                    multiplicacion = numero1 * numero2;
                    System.out.println("El resultado de la suma es: " + multiplicacion);
                    break;
                }
                case 4: {
                    division = numero1 / numero2;
                    System.out.println("El resultado de la suma es: " + division);
                }
                case 5: {
                    System.out.println("Gracias por usar el programa!");
                }
            }
        } while (opcion !=5);
        }
        catch (InputMismatchException e) {
            System.out.println("Introduce un número válido.");
        }
        
        
    }
    
}
