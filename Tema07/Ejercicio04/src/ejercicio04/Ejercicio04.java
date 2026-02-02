/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Random;

/**
 *
 * @author krosz
 */
public class Ejercicio04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz= rellenarMatriz();
        
        mostrarMatriz(matriz);
        mostrarPares(matriz);
    }
 
    // método en el que creamos y rellenamos el array
    public static int[][] rellenarMatriz() {
        int[][] matriz = new int[4][3];
        Random aleat = new Random();
        int i;
        int j;
        
        for (i = 0; i < 4; i++) {
            for(j = 0; j < 3; j++){
                matriz[i][j] = 100 + aleat.nextInt(101);
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz 4x3:");
        int i;
        int j;
        
        for (i = 0; i < matriz.length; i++) {
            for(j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void mostrarPares(int[][] matriz){
        System.out.println("Números pares: ");
        int i;
        int j;
        
        for(i = 0; i < matriz.length; i++) {
            for(j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
