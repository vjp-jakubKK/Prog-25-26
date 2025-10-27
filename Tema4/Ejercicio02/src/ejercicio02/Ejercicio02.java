/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un número: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número");
        num2 = entrada.nextInt();
        
        Calculo.multiplicacion(num1, num2);
        Calculo.suma(num1, num2);
        
    }
}
    

