/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public class Calculo {
    public static void multiplicacion (int num1, int num2) {
        int multiplicacion;
        
        if (num1 > 10) {
            multiplicacion = num1 * num2;
            System.out.println("La operación que se realizó es producto y el resultado es: " + multiplicacion);
        }
    }
    
    public static void suma (int num1, int num2) {
        int suma;
        
        if (num1 < 10) {
            suma = num1 + num2;
            System.out.println("La operación que se realizó es suma y el resultado es: " + suma);
        }
    }
}
