/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg32;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int billetes50, billetes20, billetes10, billetes5;
        int monedas2, monedas1;
        int dinero, operaciones;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        dinero = entrada.nextInt();
        
        operaciones=dinero;
        billetes50 = operaciones/50;
        operaciones = operaciones%50;
        billetes20 = operaciones/20;
        operaciones = operaciones%20;
        billetes10 = operaciones/10;
        operaciones = operaciones%10;
        billetes5 = operaciones/5;
        operaciones = operaciones%5;
        monedas2 = operaciones/2;
        operaciones = operaciones%2;
        monedas1 = operaciones;
                
        
        System.out.println(dinero + " euros se descomponen en " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros y " + monedas1 + " monedas de 1 euro");
    }
    
}
