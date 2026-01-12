/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo, segundos, minutos, horas, dias; // creamos las variables necesarias 
        
        Scanner entrada = new Scanner (System.in); // iniciamos el scanner
        
        System.out.println("Por favor, introduzca un número de segundos: ");
        tiempo = entrada.nextInt();
        dias = tiempo/86400;
        tiempo = tiempo%86400;
        horas=tiempo/3600;                        // hacemos los calculos necesarios para convertir el tiempo
        tiempo=tiempo%3600;                       // en dias, horas, minutos y segundos
        minutos=tiempo/60;
        segundos=minutos%60;
        System.out.println("Esa cantidad de segundos hacen un total de: " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
    
}
