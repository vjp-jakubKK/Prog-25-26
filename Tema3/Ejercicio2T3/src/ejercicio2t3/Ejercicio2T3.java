/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        int suma, producto;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce el primer número: ");
        numero1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = entrada.nextInt();
        
        if (numero1 > 10) {
            producto = numero1 * numero2;
            
            System.out.println("La operación que se realizó es producto y el resultado es: " + producto);
        }else {
            suma = numero1 + numero2;
            
            System.out.println("La operación que se realizó es suma y el resultado es: " + suma);
        }
    }
    
}
