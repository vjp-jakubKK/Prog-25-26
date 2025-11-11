/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecorreos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ColaDeCorreos {

    public static final char LETRA_INICIAL = 'A';  
    public static final char LETRA_FINAL = 'F';    
    public static int numeroEnvio = 1;     
    public static int numeroRecogida = 1;  
    
    // En este método lo que hacemos es mostrar el menú
    public static void mostrarMenu() {
        System.out.println("1. Solicitar número para envío");
        System.out.println("2. Solicitar número para recogida");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }
    
    // Aquí pedimos la opción al usuario
    public static int pedirOpcion() {
        int opcion = -1; // inicialicé la variable opción en -1 para que no me de un error en el return (salía que no estaba inicializada la variable)
        Scanner entrada = new Scanner(System.in);
        
        try {
            opcion = entrada.nextInt();
        } catch (InputMismatchException e) { 
            System.out.println("Introduce un valor válido");
        }
        return opcion;  
    }
    
    // Este método lo que hace es generar una letra aleatoria entre la letra A y la F
    public static char generarLetraAleatoria(char inicio, char fin) {
        int rango = fin - inicio + 1;
        return (char) (inicio + Math.random() * rango);
    }
    
    // Aumentamos el número de envío en 1
    public static void incrementarNumeroEnvio() {
        numeroEnvio++;
    }

    // En este aumentamos el numero de recogida en 1
    public static void incrementarNumeroRecogida() {
        numeroRecogida++;
    }
    
    // generamos el número de espera para el envío
    public static void generarNumeroEsperaEnvio() {
        char mesa = generarLetraAleatoria(LETRA_INICIAL, LETRA_FINAL);
        System.out.println("Su número de envío es: E-" + numeroEnvio + ", Mesa: " + mesa);
        incrementarNumeroEnvio(); // incrementamos el nº de envío
    }

    // generamos el numero de espera para la recogida
    public static void generarNumeroEsperaRecogida() {
        char mesa = generarLetraAleatoria(LETRA_INICIAL, LETRA_FINAL);
        System.out.println("Su número de recogida es: R-" + numeroRecogida + ", Mesa: " + mesa);
        incrementarNumeroRecogida(); // aumentamos el nº de recogida
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = pedirOpcion();

            switch (opcion) {
                case 1:
                    generarNumeroEsperaEnvio();
                    break;
                case 2:
                    generarNumeroEsperaRecogida();
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("No has introducido un número válido. Prueba otra vez.");
            }
        } while (opcion != 3);
    }
}
