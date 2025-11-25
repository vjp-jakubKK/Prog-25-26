/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    public int numero;
    
    public Calculadora (int numero) {
        this.numero = numero;
    }
    
    public Calculadora() {
        
    }
    
    public abstract void realizarOperacion();
}
