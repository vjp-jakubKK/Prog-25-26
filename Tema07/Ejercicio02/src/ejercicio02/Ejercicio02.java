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
    
    // método para introducir datos al array
    public static void introducirDatos(int[] array) {
        int i;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 7 números enteros:");
        
        for (i = 0; i < array.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");  // al pedir ayuda a la IA salía que ese i+1 es más fácil de entender para el usuario
            array[i] = entrada.nextInt();                       // y en general dice que se usa de esta manera
        }
    }
    
    // método para mostrar los datos del array
    public static void mostrarDatos(int[] array) {
        int i;
        
        System.out.print("Array: [");
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i]);
                                                    // este método está hecho de ésta manera para que sea cómodo de entender el resultado en pantalla
            if (i < array.length - 1) {             // La IA ha echado una pequeña mano para que yo entienda las pijadas hechas
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // método para intercambiar los datos de la 2ª posición a la 4ª
    // 2ª posicion = índice 1 y 4ª posicion = índice 3
    public static void intercambiarPosiciones(int[] array) {
        int temp;
        
        if (array.length >=4) {     // Nos aseguramos que el array tenga como mínimo 4 números
            temp = array[1];
            array[1] = array[3];
            array[3] = temp;
            
            System.out.println("La posición 2 y 4 se han intercambiado");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[7];
        
        introducirDatos(numeros);
        
        System.out.println("Array original:");
        mostrarDatos(numeros);
        
        intercambiarPosiciones(numeros);
        
        System.out.println("Array intercambiado:");
        mostrarDatos(numeros);
        
        
    }
    
}
