/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduce el segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer número: ");
        num3 = entrada.nextInt();
        
        ElMayor.Mayor.calculo(num1, num2, num3);
    }
    
}
