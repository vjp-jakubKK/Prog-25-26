/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author krosz
 */
public class Ejercicio08 {

    // método para pedir el número
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean numValido = false;
        
        while(!numValido) {
            System.out.println("Introduce un número de 5 cifras: ");
             
            try {
                numero = entrada.nextInt();
                
                if (numero >= 10000 && numero <= 99999) {
                    numValido = true;
                } else {
                    System.out.println("El número debe tener 5 cifras.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero válido.");
            }
        }
        return numero;
    }
    
    // método para dividir en cifras
    public static int[] dividirEnCifrasYRevolear(int numero) {
        int[] cifras = new int[5];
        int temp = numero;
        int i;
        
        for(i = 4; i >= 0; i--) {
            cifras[i] = temp % 10;
            temp = temp / 10;
        }
        
        for (i = cifras.length - 1; i >= 0; i--) {
            System.out.print(cifras[i]);
        }
        System.out.println();
        
        return cifras;
    }
    
    public static void mostrarArray(int[] array) {
        int i;
        
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            
            if (i < array.length - 1) {
                System.out.println(" ");
            }
        }
        System.out.println(); // sout puesto para que se vea bien en consola
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        int[] divido = dividirEnCifrasYRevolear(numero);
    }
    
}



