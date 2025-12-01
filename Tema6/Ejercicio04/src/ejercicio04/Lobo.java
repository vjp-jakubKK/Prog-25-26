/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author krosz
 */
public class Lobo extends Canidos{
    public Lobo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    } 
    
    @Override
    public String mostrarSonido() {
        return "Aullido";
    }
    
    @Override
    public String mostrarAlimentacion() {
        return "Carnívora";
    }
    
    @Override
    public String mostrarHabitat() {
        return "Bosque";
    }
    
    @Override
    public String mostrarNombreCientifico() {
        return "Canis lupus";
    }
}
