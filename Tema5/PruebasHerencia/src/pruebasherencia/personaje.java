/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasherencia;

/**
 *
 * @author alumno
 */
public class personaje {
    // ATRIBUTOS 
    private int vida;
    
    // CONTRUCTORES
    public personaje() {
        this.vida = 100;
    }
    
    public personaje(int vida) {
        this.vida = vida;
    }
    
    // GETTERS Y SETTERS
    public int getVida() {
        return this.vida;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    // MÉTODOS
    public void atacar() {
        System.out.println("Atacando...");
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "El personaje tiene " + this.vida + "% de vida";
    }
    
}
