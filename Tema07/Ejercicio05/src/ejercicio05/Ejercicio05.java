/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author krosz
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] numeros = new int[4][2];
        
        pedirValores(numeros);
        mostrarMatriz(numeros);
        
        int mayor = encontrarMayor(numeros);
        int menor = encontrarMenor(numeros);
        int suma = sumaTotal(numeros);
        
        System.out.println("-- RESULTADOS --");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Suma total: " + suma);
    }
    
    // Méotodo para pedir valores al usuario
    public static void pedirValores(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        int i, j;
        
        System.out.println("Introduce 8 número enteros: ");
        
        for(i = 0; i < 4; i++) {
            System.out.print("Fila: " + (i+1) + " - ");
            
            for(j = 0; j < 2; j++) {
                System.out.println("Columna: " + (j+1));
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    // método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        int i, j;
        
        System.out.println("-- MATRIZ 4x2 --");
        
        for(i = 0; i < 4; i++) {
            System.out.print("| ");
            
            for(j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("| ");
        }
    }
    
    // método para encontrar el mayor
    public static int encontrarMayor(int[][] matriz) {
        int mayor = matriz[0][0];
        int i, j;
        
        for(i = 0; i < 4; i++){
            for(j = 0; j < 2; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }
    
    // método para encontrar el menor
    public static int encontrarMenor(int[][] matriz) {
        int menor = matriz[0][0];
        int i, j;
        
        for(i = 0; i < 4; i++){
            for(j = 0; j < 2; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }
    
    // método para calcular la suma total
    public static int sumaTotal(int[][] matriz) {
        int suma = 0;
        int i, j;
        
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 2; j++) {
                suma += matriz[i][j];
            }
        }
        
        return suma;
    }
}
