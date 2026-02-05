/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Random;

/**
 *
 * @author krosz
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = crearArrayAleatorio();
        
        System.out.println("Array original: ");
        mostrarArray(numeros);
        
        ordenarDescendiente(numeros);
        
        System.out.println("Array ordenado de mayor a menor: ");
        mostrarArray(numeros);
    }
    
    // Método para crear un array con numeros aleatorios
    public static int[] crearArrayAleatorio() {
        int i;
        Random aleat = new Random();
        int[] array = new int[10];
        
        for(i = 0; i < array.length; i++) {
            array[i] = aleat.nextInt(10);
        }
        return array;
    }
    
    // Método para mostrar el array
    public static void mostrarArray(int[] array) {
        
        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Método para ordenarlo de mayor a menor
    public static void ordenarDescendiente(int[] array) {
        int i, j, temp;
        
        for(i = 0; i < array.length - 1; i++) {
            for(j = 0; j < array.length - 1 - i; j++) {
                if(array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
