/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora{
    private int multiplicador;
    
    public Multiplicacion(int numero, int multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }
    
    @Override
    public void realizarOperacion(){
        double resultado;
        
        resultado = numero * multiplicador;
        System.out.println("El resultado de la multiplicacion es " + resultado);
    }
}
