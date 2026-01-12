/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 11; //Creamos la variable y le damos el valor de 11
        
        while (contador <= 133) { //mientras contador sea menor o igual a 133 se cumplirá la condición
            if (contador % 2 == 0){
                System.out.println(+contador); //si el resto de la división del contador / 2 es igual a 0 el numero será par
            }
            contador++; // aquí aumentamos el valor de contador en 1
        }    
    }
    
}
