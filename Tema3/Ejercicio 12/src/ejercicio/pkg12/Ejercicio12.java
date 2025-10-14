/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=11; //creamos la variable contador y le damos el valor de 11
        
        do {
            if (contador % 2 == 0) { //ponemos un if para que si el resto es igual a 0 el programa sepa que este es par
                System.out.println("Par " +contador);
            }
            contador++; //aumentamos en 1 contador y se repite el bucle
        }while(contador <=133); //ponemos el limite en 133 para que salga del bucle
    }
    
}
