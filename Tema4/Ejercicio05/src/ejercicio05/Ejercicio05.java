/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import Calculo.parImpar;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        
        parImpar.parOImpar(num);
    }
    
}
