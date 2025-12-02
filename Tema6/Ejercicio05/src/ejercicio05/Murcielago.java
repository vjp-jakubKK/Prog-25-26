/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador{
    public int alturaVuelo;
    
    public Murcielago(String nombre, String sexo, String color, int edad, int alturaVuelo) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }
    
    @Override
    public String obtenerMensajeVolador() {
        return "El murciélago es un animal volador";
    }
    
    @Override
    public void aumentarAlturaVuelo() {
        alturaVuelo = alturaVuelo + 5;
        System.out.println("La altura de vuelo ha aumentado 5 metros");
    }
    
    @Override
    public void bajarAlturaVuelo() {
        alturaVuelo = alturaVuelo - 5;
        System.out.println("La altura de vuelo ha disminuido 5 metros");
    }
    
    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("La altura de vuelo es: " + alturaVuelo + " metros");
    }
}
