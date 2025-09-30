/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg24;

import java.util.Scanner; // importamos java util 
/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float notaProg, notaLM, notaBD, notaED, notaSI, notaFOL, notaMedia; // creamos las variables necesarias para el ejercicio
        
        Scanner entrada = new Scanner (System.in); // Creamos el scanner
        
        System.out.println("Introduzca su nota de programacion: ");
        notaProg = entrada.nextFloat();
        System.out.println("Introduzca su nota de lenguaje de marcas: ");
        notaLM = entrada.nextFloat();
        System.out.println("Introduzca su nota de bases de datos: ");                 // Pedimos al usuario que introduzca las notas con los scanner
        notaBD = entrada.nextFloat();                                                 // que sean necesarios 
        System.out.println("Introduzca su nota de entornos de desarrollo: ");
        notaED = entrada.nextFloat();
        System.out.println("Introduzca su nota de sistemas informaticos: ");
        notaSI = entrada.nextFloat();
        System.out.println("Introduzca su nota de FOL: ");
        notaFOL = entrada.nextFloat();
        notaMedia = (notaProg + notaLM + notaBD + notaED + notaSI + notaFOL) / 6; // hacemos la media de los datos introducidos por el usuario
        System.out.println("Su nota media es " + notaMedia); // Mostramos por pantalla el resultado
     }
    
}
