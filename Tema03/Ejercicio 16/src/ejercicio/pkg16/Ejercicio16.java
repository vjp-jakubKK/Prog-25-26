/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contadorImpares = 0; //creamos esta variable para contar los numeros impares
        int x; //creamos la variable x para el bucle for

        System.out.println("Números impares entre 20 y 160:");

        for (x = 21; x < 160; x += 2) { // Comenzamos en el 21 ya que es el primer numero impar, la condición es que sea menor a 160 y luego se sumamos 2
            System.out.println(x); //se muestra el valor de x
            contadorImpares++; // le sumamos 1 a la variable contadorImpares
        }
        System.out.println("Total de números impares impresos: " + contadorImpares); //mostramos en pantalla la cantidad de impares que el programa a mostrado
    }
    
}
