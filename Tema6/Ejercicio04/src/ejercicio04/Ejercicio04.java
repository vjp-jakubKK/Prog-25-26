/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author krosz
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Perro perro = new Perro("Gordito", 3, 12.5);
        Lobo lobo = new Lobo("Arthur", 5, 40.2);
        Leon leon = new Leon("Will", 6, 190.8);
        Gato gato = new Gato("Pelusita", 2, 4.3);

        perro.mostrarDatos();
        lobo.mostrarDatos();
        leon.mostrarDatos();
        gato.mostrarDatos();

        System.out.println("CON POLIMORFISMO");

        Animal a1 = new Perro("Jawy", 4, 11.1);
        Animal a2 = new Lobo("Paul", 7, 42.0);
        Animal a3 = new Leon("Benji", 5, 170.0);
        Animal a4 = new Gato("Robin", 1, 3.8);

        a1.mostrarDatos();
        a2.mostrarDatos();
        a3.mostrarDatos();
        a4.mostrarDatos();
    }
    
}
