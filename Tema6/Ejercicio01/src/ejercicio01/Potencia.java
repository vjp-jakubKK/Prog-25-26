/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora {
    private int exponente;
    
    public Potencia(int numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }
    
    @Override
    public void realizarOperacion(){
        double resultado;
        
        resultado = Math.pow(numero, exponente);
        System.out.println("El resultado de la potencia es " + resultado);
    }
}
