/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    private String grupo;
    
    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }
    
    @Override
    public String Saludar() {
        return "Hola soy el alumno " + nombre +
                " y soy del grupo " + grupo;
    }
}
