/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author krosz
 */
public class Ejercicio09 {

    // método para pedir el número
    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número entero: ");
        numero = entrada.nextInt();
        
        return numero;
    }
    
    // método para calcular cuántas cifras tiene el número
    public static int contarCifras(int numero) {
        int contador = 0;
        int temp = numero;
        
        while (temp > 0) {
            temp = temp/10;
            contador++;
        }
        return contador;
    }
    
    // método para dividir el número en cifras y guardarlas en un array
    public static int[] dividirEnCifras(int numero, int cifras) {
        int[] arrayCifras = new int[cifras];
        int temp = numero;
        int i;
        
        // Se extraen las cifras de derecha a izquiera
        for (i = cifras - 1; i >= 0; i--){
            arrayCifras[i] = temp % 10;
            temp = temp / 10;
        }
        return arrayCifras;
    }
    
    // método para mostrar el array al revés
    public static void mostrarAlReves(int[] arrayCifras){
        int i;
        
        System.out.println("El número introducido al revés es: ");
        
        for(i = arrayCifras.length - 1; i >= 0; i--){
            System.out.print(arrayCifras[i]);
        }
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNum();
        int cifras = contarCifras(numero);
        int[] arrayCifras = dividirEnCifras(numero, cifras);
        mostrarAlReves(arrayCifras);
    }
    
}
