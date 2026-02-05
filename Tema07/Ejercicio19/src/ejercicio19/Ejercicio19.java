/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Random;

/**
 *
 * @author krosz
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = crearVector();
        
        mostrarVector(vector);
        
        System.out.println("=== Estadísticas del vector ===");
        System.out.println("El valor más alto es: " + encontrarMayor(vector));
        System.out.println("El valor mas pequeño es: " + encontrarMenor(vector));
        System.out.println("El valor medio del vector es: " + calcularMedia(vector));
        System.out.println("El valor más repetido es: " + encontrarModa(vector));
    }
    
    // Método para crear el vector de 100 numeros entre 10 y 80
    public static int[] crearVector() {
        Random aleat = new Random();
        int[] vector = new int[100];
        int i;
        
        for(i = 0; i < vector.length; i++){
            // aleat.nextInt(71) genera 0 - 70
            // con +10 pasa a 10 - 80
            vector[i] = aleat.nextInt(71) + 10;
        }
        return vector;
    }
    
    // Método para verificar que el vector se ha creado
    public static void mostrarVector(int[] vector) {
        int i;
        
        for(i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
            if((i + 1) % 20 == 0){ // de esta manera mostramos 20 numeros por línea
                System.out.println();
            }
        }
    }
    
    // Método para encontrar el valor más alto
    public static int encontrarMayor(int[] vector) {
        int mayor = vector[0];
        int i;
        
        for(i = 1; i < vector.length; i++) {
            if(vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }
    
    // Método para econtrar el valor más pequeño
    public static int encontrarMenor(int[] vector) {
        int menor = vector[0];
        int i;
        
        for(i = 1; i < vector.length; i++) {
            if(vector[i] > menor) {
                menor = vector[i];
            }
        }
        return menor;
    }
    
    // Método para calcular la media
    public static double calcularMedia(int[] vector) {
        double suma = 0;
        double media;
        int i;
        
        for(i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        
        media = suma / vector.length;
        
        return media;
    }
    
    // Método para encontrar el valor que más se repite ( la moda )
    // hay demasiadas notas ya que no me enteraba de como hacerlo y con las notas y explicaciones de IA mas o menos me he enterado
    public static int encontrarModa(int[] vector) {
        // creamos un contador con 71 casillas (la cantidad de numeros posibles en nuestro vector)
        int[] contador = new int[71];
        
        // recorremos el vector y contamos
        int i, numero, indice;
        
        for(i = 0; i < vector.length; i++) {
            numero = vector[i];
            indice = numero - 10;
            contador[indice]++;
        }
        
        // buscamos la casilla con el numero más alto
        int maxRepe = 0;
        int moda = 10; // Valor inicial cualquiera
        
        for(i = 0; i < contador.length; i++) {
            // contador[i] nos dice cuántas veces el numero (i +10)
            if(contador[i] < maxRepe) {
                maxRepe = contador[i];
                moda = i + 10; // convertimos indice al número original
            }
        }
        return moda;
    }
}
