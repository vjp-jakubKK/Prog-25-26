/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15;
import java.util.Scanner; // importamos el scanner para que el usuario pueda introducir el numero que quiera
/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero; // creamos la variable numero para que el usuario introduzca su valor
        int resultado; // la variable resultado la creamos para la solucion de la multiplicación
        int i; // esta variable la creamos para el bucle for
        
        Scanner scanner = new Scanner(System.in); //creamos la entrada para el usuario
        
        System.out.print("introduce un número para tu tabla de multiplicar: "); // le pedimos un numero al usuario
        numero = scanner.nextInt(); // guardamos el numero que nos ha dado el usuario
        
        for (i = 1; i <= 10; i++) { //bucle for donde la variable i sea 1, la condición de que i sea menor o igual a 10 y luego le sumamos 1 a i
            resultado = numero * i; //multiplicamos numero por la variable i
            System.out.println(numero + " x " + i + " = " + resultado); //mostramos el resultado
        }
    }
    
}
