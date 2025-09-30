/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

/**
 *
 * @author admin
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dineroCartera = 130;
        int billetes50;
        int billetes10;
        
        billetes50= 130 / 50;
        dineroCartera= 130 % 50;
        billetes10= dineroCartera / 10;
        
        System.out.println("130 euros hacen un total de: " +billetes50+ " billetes de 50 euros y " +billetes10+ " billetes de 10 euros");
    }
    
}
