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
        
        Suma suma = new Suma(13, 4);
        Multiplicacion multiplicacion = new Multiplicacion(5, 3);
        Potencia potencia = new Potencia(3,5);
        
        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
        
        // Polimorfismo
        
        Calculadora calc1 = new Suma(10, 5);
        Calculadora calc2 = new Multiplicacion(10, 2);
        Calculadora calc3 = new Potencia(5, 3);
        
        calc1.realizarOperacion();
        calc2.realizarOperacion();
        calc3.realizarOperacion();
    }
    
}
