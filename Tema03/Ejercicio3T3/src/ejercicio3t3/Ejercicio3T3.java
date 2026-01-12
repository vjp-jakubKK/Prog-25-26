/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3t3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Por último introduzca el tercer número: ");
        num3 = entrada.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor introducido es el: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor introducido es el: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor introducido es el: " + num3);
        }
    }
    
}
