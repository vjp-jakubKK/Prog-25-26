/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0; // Esta variable la creamos para contar los numeros pares que tenemos
        int contador = 0; // Esta variable la creamos para contar los 100 numeros pares

        while (contador < 100) {
            int numeroPar = i * 2; // de esta manera calcularemos los numeros pares
            System.out.println(numeroPar); // sacamos el numero
            i++; // aumentamos i en 1
            contador++; // aumentamos contador en 1
        }
    }
}
    
    

