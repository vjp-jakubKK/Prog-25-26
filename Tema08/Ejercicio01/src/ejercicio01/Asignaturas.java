/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author krosz
 */
public class Asignaturas {
    private String nombre;
    private double nota;
    
    // Constructores
    public Asignaturas(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public Asignaturas() {
        this.nombre = "";
        this.nota = 0;
    }
    
    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    // Método toString
    @Override
    public String toString(){
        return "";
    }
}
