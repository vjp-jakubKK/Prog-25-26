/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author krosz
 */
public class Ejercicio15 {

    private static int[] VENTAS = new int[12];
    private static String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private static boolean DATOSGENERADOS = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1:
                    generarVentasAleatorias();
                    break;
                case 2:
                    mostrarVentas();
                    break;
                case 3:
                    mostrarVentasAlReves();
                    break;
                case 4:
                    mostrarSumaTotal();
                    break;
                case 5:
                    mostrarVentasMesesPares();
                    break;
                case 6:
                    mostrarMesMasVentas();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }
    
    // método para mostrar el menu
    public static void mostrarMenu(){
        System.out.println("=== MENÚ VENTAS DE COCHES ===");
        System.out.println("1. Generar ventas aleatorias");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Mostrar ventas al revés");
        System.out.println("4. Suma total de ventas anuales");
        System.out.println("5. Ventas de meses pares");
        System.out.println("6. Mes con más ventas");
        System.out.println("7. Salir");
    }
    
    // Opción 1: Méotodo para generar ventas aleatorias
    public static void generarVentasAleatorias() {
        Random aleat = new Random();
        int i;
        
        for(i = 0; i < 12; i++){
            // números entre 10 y 100
            VENTAS[i] = 10 + aleat.nextInt(91);
        }
        
        DATOSGENERADOS = true;
        System.out.println("Las ventas aleatorias han sido generadas.");
    }
    
    // Opción 2: Método para mostrar las ventas
    public static void mostrarVentas(){
        int i;
        
        if(!DATOSGENERADOS) {
            System.out.println("Primero debes generar las ventas (Usa la opción 1)");
            return; // en caso de que el usuario no haya generado los datos, este return se sale del método ignorando el resto 
                    // del código, así me aseguro que haya datos que mostrar (pequeña ayuda de la IA en este método)
        }
        
        System.out.println("Ventas mensuales: ");
        for(i = 0; i < 12; i++){
            System.out.println(MESES[i] + ": " + VENTAS[i] + " coches");
        }
    }
    
    // Opción 3: Método para mostrar las ventas al revés
    public static void mostrarVentasAlReves() {
        int i;
        
        if(!DATOSGENERADOS) {
            System.out.println("Primero debes generar las ventas (Usa la opción 1)");
            return;
        }
        
        for(i = 11; i >= 0; i--){
            System.out.println(MESES[i] + ": " + VENTAS[i] + " coches");
        }
    }
    
    // Opción 4: Método para mostrar las suma total de las ventas
    public static void mostrarSumaTotal() {
        int suma = 0;
        
        if(!DATOSGENERADOS) {
            System.out.println("Primero debes generar las ventas (Usa la opción 1)");
            return;
        }
        
        for(int venta : VENTAS) { // la variable venta está inicializada dentro del for ya que si la inicio fuera me da error
            suma += venta;        // y no entiendo del todo porqué
        }
        
        System.out.println("Suma total de ventas: " + suma + " coches.");
    }
    
    // Opción 5: Método que solo muestra las ventas de los meses pares
    public static void mostrarVentasMesesPares() {
        int sumaPares = 0;
        int i;
        
        if(!DATOSGENERADOS) {
            System.out.println("Primero debes generar las ventas (Usa la opción 1)");
            return;
        }
        
        System.out.println("Ventas de los meses pares: ");
        
        for(i = 0; i < 12; i += 2){
            // Teniendo en cuenta que empezamos a contar desde el num 0, los meses pares 
            // corresponden a los indices impares, por eso mostramos esos
            if(i % 2 == 1) {
                System.out.println(MESES[i] + ": " + VENTAS[i] + " coches");
                sumaPares += VENTAS[i];
            }
        }
        
        System.out.println("Ventas en los meses pares: " + sumaPares + " coches.");
    }
    
    //Opción 6: Método para mostrar el mes con más ventas
    public static void mostrarMesMasVentas() {
        int maxVentas = VENTAS[0];
        int mesMax = 0;
        int i;
        
        if (!DATOSGENERADOS) {
            System.out.println("Primero genera las ventas (opción 1)");
            return;
        }
        
        for(i = 1; i < 12; i++) {
            if(VENTAS[i] > maxVentas){
                maxVentas = VENTAS[i];
                mesMax = i;
            }
        }
        
        System.out.println("El mes con más es: " + MESES[mesMax] + " con" + maxVentas + " coches");
    }
}
