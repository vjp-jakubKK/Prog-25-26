/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author krosz
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = {3, 7, 1, 9, 4};
        int[] array2 = {8, 2, 5, 6, 0};
        
        System.out.println("Array 1: ");
        mostrarArray(array1);
        
        System.out.println("Array 2: ");
        mostrarArray(array2);
        
        int[] resultado = juntarYOrdenarArray(array1, array2);
        
        System.out.println("Array fusionado y ordenado: ");
        mostrarArray(resultado);
    }
    
    // Método para juntar los arrays y ordenarlo
    public static int[] juntarYOrdenarArray(int[] array1, int[] array2) {
        int[] resultado = new int[10];
        int i, j, temp;
        
        // copiamos ambos array a resultado
        for(i = 0; i < 5; i++){
            resultado[i] = array1[5];
            resultado[i + 5] = array2[i];
        }
        
        // Ordenamos con el método de la burbuja
        for(i = 0; i < resultado.length - 1; i++) {
            for(j = 0; j < resultado.length - 1 - i; j++){
                if(resultado[j] > resultado[j + 1]) {
                    temp = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temp;
                }
            }
        }
        return resultado;
    }
    
    // Método para mostrar el array
    public static void mostrarArray(int[] array) {
        for(int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
