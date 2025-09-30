/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15;

/**
 *
 * @author admin
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo, segundos, minutos, horas;
        
        tiempo=10000;
        horas=tiempo/3600;
        tiempo=tiempo%3600;
        minutos=tiempo/60;
        tiempo=tiempo%60;
        segundos=minutos%60;
        
        System.out.println("10000 segundos hacen un total de: " +horas+ " horas, " +minutos+ " minutos y " +segundos +" segundos");
    }
    
}
