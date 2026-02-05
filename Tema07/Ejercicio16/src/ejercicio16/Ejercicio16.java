/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author krosz
 */
public class Ejercicio16 {

    // Arrays con los nombres de los alumnos y las asignaturas
    private static final String[] ALUMNOS = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
    private static final String[] ASIGNATURAS = {"Lengua", "Mates", "Historia", "Física"};
    
    // Matriz para almacenar las notas (6 alumnos x 4 asignaturas)
    private static double[][] NOTAS = new double[6][4];
    private static boolean NOTASINTRODUCIDAS = false;
    
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
                    rellenarNotas(entrada);
                    break;
                case 2:
                    mostrarNotas();
                    break;
                case 3:
                    calcularMejorAlumno();
                    break;
                case 4:
                    calcularMasSuspensos();
                    break;
                case 5:
                    calcularAsignaturaDificil();
                    break;
                default:
                    System.out.println("No has introducido una opción válida.");
            }
        } while(opcion != 6);
    }
    
    // Método para mostrar el manu
    public static void mostrarMenu() {
        System.out.println("=== MENÚ ===");
        System.out.println("1. Rellenar notas");
        System.out.println("2. Ver notas");
        System.out.println("3. Mejor alumno");
        System.out.println("4. Más suspensos");
        System.out.println("5. Asignatura más difícil");
        System.out.println("6. Salir");
    }
    
    // Opción 1; Método para rellenar las notas
    public static void rellenarNotas(Scanner entrada) {
        int i, j;
        
        System.out.println("Introduce las notas (0 - 10): ");
        
        for(i = 0; i < 6 ; i++) {
            System.out.println("Alumno: " + ALUMNOS[i]);
            for(j = 0; j < 4; j++) {
                System.out.print(ASIGNATURAS[j] + ": ");
                NOTAS[i][j] = entrada.nextDouble();
            }
        }
        
        NOTASINTRODUCIDAS = true;
        System.out.println("Las notas se han introducido correctamente.");
    }
    
    // Opción 2: Método para mostrar las notas introducidas
    public static void mostrarNotas() {
        int i, j;
        
        if(!NOTASINTRODUCIDAS) {
            System.out.println("No se han introducido las notas (Opción 1)");
            return; // usamos este return para que el programa no avance y no muestre nada
        }
        
        System.out.println("== NOTAS ==");
        for(i = 0; i < 6; i++){
            System.out.println(ALUMNOS[i] + ": ");
            for(j = 0; j < 4; j++){
                System.out.println(ASIGNATURAS[j] + ": " + NOTAS[i][j]);
            }
        }
        System.out.println();
    }
    
    // Opción 3: Método para calcular el mejor alumno de la clase
    public static void calcularMejorAlumno() {
        int i, j;
        double mejorMedia = 0;
        int mejorAlumno = 0;
        double suma, media;
        
        if(!NOTASINTRODUCIDAS) {
            System.out.println("No se han introducido las notas (Opción 1)");
            return; 
        }
        
        for(i = 0; i < 6; i++){
            suma = 0;
            for(j = 0; j < 4; j++){
                suma += NOTAS[i][j];
            }
            media = suma / 4;
            
            if(media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = i;
            }
        }
        
        System.out.println("Mejor alumno: " + ALUMNOS[mejorAlumno]);
        System.out.println("Nota media: " + mejorMedia);
    }
    
    // Opción 4: Método para calcular el alumno con más suspensos
    public static void calcularMasSuspensos(){
        int i, j;
        int maxSuspensos = 0;
        int alumnosSuspensos = 0;
        int suspensos;
        
        if(!NOTASINTRODUCIDAS) {
            System.out.println("No se han introducido las notas (Opción 1)");
            return; 
        }
        
        for(i = 0; i < 6; i++) {
            suspensos = 0;
            
            for(j = 0; j < 4; j++) {
                if(NOTAS[i][j] < 5) {
                    suspensos++;
                }
            }
            
            if(suspensos > maxSuspensos){
                maxSuspensos = suspensos;
                alumnosSuspensos = i;
            }
        }
        
        System.out.println("Alumno con más suspensos: " + ALUMNOS[alumnosSuspensos]);
        System.out.println("Suspensos: " + maxSuspensos);
    }
    
    // Opción 5: Método para calcular la asignatura más difícil
    public static void calcularAsignaturaDificil(){
        int i, j;
        double peorMedia = 10; // Como no va a haber una media mayor a 10 la iniciamos con este valor y así cualquier media que nos encontremos será menor a esta
        int asignaturaDificil = 0;
        double media, suma;
        
        if(!NOTASINTRODUCIDAS) {
            System.out.println("No se han introducido las notas (Opción 1)");
            return; 
        }
        
        for(j = 0; j < 4; j++) {
            suma = 0;
            for(i = 0; i < 6; i++){
                suma += NOTAS[i][j];
            }
            
            media = suma / 6;
            
            if(media < peorMedia) {
                peorMedia = media;
                asignaturaDificil = j;
            }
        }
        
        System.out.println("Asignatura más difícil: " + ASIGNATURAS[asignaturaDificil]);
        System.out.println("Nota media: " + peorMedia);
    }
}
