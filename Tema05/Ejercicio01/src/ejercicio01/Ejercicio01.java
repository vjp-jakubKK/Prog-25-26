/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        miCoche.establecerMarca("Toyota");
        miCoche.establecerModelo("Corolla");
        miCoche.establecerColor("Verde");

        cochePadre.establecerMarca("Honda");
        cochePadre.establecerModelo("Civic");
        cochePadre.establecerColor("Negro");

        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }

        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }

        cochePadre.apagarCoche();

        System.out.println("Estado de miCoche:");
        miCoche.obtenerEstado();

        System.out.println("Estado de cochePadre:");
        cochePadre.obtenerEstado();
    }
    
}
