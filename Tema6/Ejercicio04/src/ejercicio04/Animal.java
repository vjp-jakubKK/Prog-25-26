/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author krosz
 */
public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public abstract String mostrarSonido();
    public abstract String mostrarAlimentacion();
    public abstract String mostrarHabitat();
    public abstract String mostrarNombreCientifico();
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Sonido: " + mostrarSonido());
        System.out.println("Alimentacion: " + mostrarAlimentacion());
        System.out.println("Hábitat: " + mostrarHabitat());
        System.out.println("Nombre científico: " + mostrarNombreCientifico());
    }
    
}
