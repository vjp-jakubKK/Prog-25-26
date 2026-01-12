/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    public int numHuevos;
    
    public Ornitorrinco(String nombre, String sexo, String color, int edad, int numHuevos) {
        super(nombre, sexo, color, edad);
        this.numHuevos = numHuevos;
    }
    
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo";
    }
    
    @Override
    public void ponerHuevo() {
        numHuevos++;
        System.out.println("El ornitorrinco ha puesto un huevo");
    }
    
    @Override
    public void incubarHuevo() {
        numHuevos--;
        System.out.println("El ornitorrinco ha incubado el huevo");
    }
    
    @Override
    public void mostrarNumHuevos() {
        System.out.println("El ornitorrinco ha puesto: " +numHuevos+ " huevos");
    }
}
