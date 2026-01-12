/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void rellenarArray (int array[]){
        Scanner entrada = new Scanner(System.in);
        int i;
        
        System.out.println("Array 10 números enteros");
        for(i = 0; i < 10; i++){
            System.out.println("Introduce un valor para la posición" +i+ ":");
            array[i] = entrada.nextInt();
        }
    }
    
    public static void mostrarPares(int array[]){
        int i;
        
        System.out.println("Números pares dentro del array:");
        for(i = 0; i < 10; i++){
            if(array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
    
    public static void mostrarArray(int array[]) {
        int i;
        
        System.out.println("Mostrando array...");
        for(i = 0; i < 10; i++){
            System.out.println("El valor guardado en la posicion " +i+ " es de:" +array[i]);
        }
    }
    
}
