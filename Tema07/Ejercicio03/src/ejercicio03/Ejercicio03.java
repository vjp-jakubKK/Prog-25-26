/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author krosz
 */
public class Ejercicio03 {

    // método para pedir la longitud del array
    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        
        // este while(true) me lo ha dado la IA, no era capaz de sacarlo y no acabo de entenderlo del todo
        // Por lo que he entendido un poco, es como un bucle infinito intencional del cual solo salimos con el break del else
        while(true) {
            try {
                System.out.println("¿Cuántos números quieres en el array (entre 1 y 10)?");
                longitud = entrada.nextInt();
                
                if (longitud < 1 || longitud > 10) {
                    System.out.println("La longitud debe estar entre 1 y 10.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número");
                entrada.nextLine();  // En caso de no poner esto se crea un bucle infinito al introducir una palabra en vez de un número
            }
        }
        return longitud;
    }
    
    // método para crear el array con números aleatorios
    public static int[] crearArray(int tamano) {
        Random aleatorio = new Random();
        int[] array = new int[tamano];
        int i;
        
        for(i = 0; i < tamano; i++) {
            array[i] = aleatorio.nextInt(6) + 1;
        }
        
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        int i;
        
        System.out.println("Array generado: ");
        
        System.out.print("[");
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano = pedirLongitud();
        int[] numeros = crearArray(tamano);
        mostrarArray(numeros);
    }
    
}
