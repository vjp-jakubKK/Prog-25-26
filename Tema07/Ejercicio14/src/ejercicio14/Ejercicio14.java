/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author krosz
 */
public class Ejercicio14 {

    // Creamos las constantes
    private static final int SEMANAS = 4;
    private static final int DIAS_SEMANA = 7;
    private static final int TOTAL_DIAS = SEMANAS * DIAS_SEMANA;

    // Array para las temperaturas
    private static double[][] temperaturas = new double[SEMANAS][DIAS_SEMANA];

    // Array con el nombre de los dias
    private static final String[] DIAS = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    // Variable para controlar si los datos han sido cargados
    private static boolean datosCargados = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-- REGISTRO DE TEMPERATURAS --");
            System.out.println("1. Rellenar las temperaturas");
            System.out.println("2. Mostrar las temperaturas");
            System.out.println("3. Visualizar temperatura media");
            System.out.println("4. Dias más calurosos");
            System.out.println("5. Salir del programa");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    rellenarTemperaturas();
                    break;
                case 2:
                    mostrarTemperaturas();
                    break;
                case 3:
                    mostrarTemperaturaMedia();
                    break;
                case 4:
                    mostrarDiasMasCalurosos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    // métodos para rellenar las temperaturas
    public static void rellenarTemperaturas() {
        Scanner entradaTemp = new Scanner(System.in);
        System.out.println("Introduce las temperaturas: ");
        
        int semana, dia;
    
        for(semana = 0; semana < SEMANAS; semana++) {
            System.out.println("Semana " + (semana + 1) + (":"));
            
            for(dia = 0; dia < DIAS_SEMANA; dia++) {
                System.out.print(DIAS[dia] + ": ");
                temperaturas[semana][dia] = entradaTemp.nextDouble();
            }
        }
        System.out.println("Las temperaturas han sido guardadas.");
    }
    
    // método para mostrar las temperaturas introducidas en el método anterior
    public static void mostrarTemperaturas() {
        int semana, dia;
        
        for(semana = 0; semana < SEMANAS; semana++) {
            System.out.print("Semana " + (semana + 1) + ": ");
            
            for(dia = 0; dia < DIAS_SEMANA; dia++) {
                System.out.print(temperaturas[semana][dia] + " ");
            }
        }
        System.out.println("");
    }
    
    // méotodo para mostrar la temperatura media
    public static void mostrarTemperaturaMedia() {
        double suma = 0;
        double media;
        int dia, semana;
        
        for (semana = 0; semana < SEMANAS; semana++) {
            for (dia = 0; dia < DIAS_SEMANA; dia++) {
                suma += temperaturas[semana][dia];
            }
        }
        
        media = suma / (SEMANAS * DIAS_SEMANA);
        System.out.println("La temperatura media del mes ha sido: " + media);
    }
    
    // método para buscar y mostrar los días más calurosos
    public static void mostrarDiasMasCalurosos() {
        // primero buscamos la temperatura máxima
        double maxima = temperaturas[0][0];
        int semana, dia;
        
        for (semana = 0; semana < SEMANAS; semana++){
            for (dia = 0; dia < DIAS_SEMANA; dia++) {
                if (temperaturas[semana][dia] > maxima) {
                    maxima = temperaturas[semana][dia];
                }
            }
        }
        
        // ahora mostramos los resultados
        System.out.println("Días más calurosos (temperatura: " + maxima +")");
        
        for (semana = 0; semana < SEMANAS; semana++){
            for (dia = 0; dia < DIAS_SEMANA; dia++) {
                if (temperaturas[semana][dia] == maxima) {
                    System.out.println("- " + DIAS[dia] + " de la Semana " + (semana + 1));
                } 
            }
        }
    }
}
