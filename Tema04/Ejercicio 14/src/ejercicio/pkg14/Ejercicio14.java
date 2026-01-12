/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {
    
    /**
     * Método para pedir el número al usuario
     * @return el número introducido 
     */
    public static int pedirNum() {
        int num;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.print("Introduce un número mayor que 0: ");
            num = entrada.nextInt();
            if (!mayorQue0(num)) {
                System.out.println("Error: el número debe ser mayor que 0. Inténtalo de nuevo.");
            }
        } while (!mayorQue0(num));
        return num;
    }
    
    /**
     * Método que comprueba que el método introducido por el usuario
     * @param num
     * @return 
     */
    public static boolean mayorQue0(int num) {
        return num > 0;
    } 
    
    /**
     * Método que muestra los múltiplos de 3
     * y cuenta la cantidad de múltiplos entre 0 y 
     * el número introducido por el usuario
     * @param limite 
     */
    public static void mostrarMultiplosDeTres(int limite) {
        int contador = 0;
        int i;
        
        System.out.println("Los múltiplos de 3 entre 1 y " + limite + " son:");
        for (i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println("Total de números múltiplos de 3: " + contador);
    }
    
    /**
     * En el main lo unico que hacemos es llamar al método
     * mostrarMultiplosDeTres
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = pedirNum();
        mostrarMultiplosDeTres(num);
        
    }
    
}
