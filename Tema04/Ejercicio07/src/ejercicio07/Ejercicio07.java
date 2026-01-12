/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {

    /**
     * Método main donde pedimos al usuario 4 números
     * para enviarlos al método "ordenar"
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer número: ");
        num3 = entrada.nextInt();
        System.out.println("Por último, introduzca el cuarto número: ");
        num4 = entrada.nextInt();
        
        ordenar(num1, num2, num3, num4);
    }
    
    /**
     * En este método lo que hacemos es ordenar
     * los números introducidos por el usuario y
     * mostrar los números ordenadores de menor a mayor
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void ordenar (int num1, int num2, int num3, int num4) {
        int aux, i; 
        
        for(i = 0;i < 3;i++){
            if (num1 > num2){
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num2 > num3){    // Usamos el método de la burbuja para
                aux = num2;      // ordenar los números y mostramos los números
                num2 = num3;     // por pantalla
                num3 = aux;
            }
            if (num3 > num4){
                aux = num3;
                num3 = num4;
                num4 = aux;
            }    
        }
        System.out.print("El orden de los números introducidos es: "+num1+" - "+num2+" - "+num3+" - "+num4);
    }
}
