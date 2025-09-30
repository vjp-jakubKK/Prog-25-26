/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;

import java.util.Scanner; // Importamos Java util
/**
 *
 * @author admins
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unidadProd; 
        float precioProd, precioTotal; // creamos las variables necesarias
        
        Scanner entrada = new Scanner (System.in); // Creamos el scanner
        
        System.out.println("Introduzca el precio del producto: ");
        precioProd = entrada.nextFloat(); // pedimos que el usuario introduzca el precio
        System.out.println("Introduzca cuantas unidades quiere: ");
        unidadProd = entrada.nextInt(); // pedimos la cantidad de unidades que quiere
        precioTotal = unidadProd*precioProd;
        System.out.println("El precio total es " +precioTotal); // Sacamos por pantalla el precio total 
    }
    
}
