/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author krosz
 */
public class Leon extends Felinos {
    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public String mostrarSonido() {
        return "Rugido";
    }
    
    @Override
    public String mostrarAlimentacion() {
        return "Carnívora";
    }
    
    @Override
    public String mostrarHabitat() {
        return "Sabana";
    }
    
    @Override
    public String mostrarNombreCientifico() {
        return "Panthera leo";
    }
}
