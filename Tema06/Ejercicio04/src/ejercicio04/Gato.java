/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author krosz
 */
public class Gato extends Felinos {
    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public String mostrarSonido() {
        return "Maullido";
    }
    
    @Override
    public String mostrarAlimentacion() {
        return "Ratone";
    }
    
    @Override
    public String mostrarHabitat() {
        return "Doméstico";
    }
    
    @Override
    public String mostrarNombreCientifico() {
        return "Felis silvestris catus";
    }
}
