/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora{
    private int sumando;
    
    public Suma(int numero, int sumando) {
        super(numero);
        this.sumando = sumando;
    }
    
    @Override
    public void realizarOperacion(){
        double resultado;
        
        resultado = numero + sumando;
        System.out.println("El resultado de la suma es " + resultado);
    }
}
