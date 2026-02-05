/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Random;

/**
 *
 * @author krosz
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = crearArraySinRepetir();
        
        mostrarArray(numeros);
    }
    
    // Método para crear array de 10 numeros únicos entre 0 y 9
    public static int[] crearArraySinRepetir() {
        Random aleat = new Random();
        int[] array = new int[10];
        int i, j, numero;
        boolean repetido;
        
        for(i = 0; i < array.length; i++){
            do {
                repetido = false;
                numero = aleat.nextInt(10); // Numeros entre 0 y 9
                
                // verificamos si el número ya está en el array
                for(j = 0; j < i; j++) {
                    if(array[j] == numero) {
                        repetido = true;
                        break;
                    }
                }
            } while(repetido); // Repetimos si el número ya existe
            
            array[i] = numero;
        }
        return array;
    }
    
    // Método para mostrar el array
    public static void mostrarArray(int[] array){
        int i;
        
        System.out.println("Se ha generado el array correctamente: ");
        
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
