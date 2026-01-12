/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasherencia;

/**
 *
 * @author alumno
 */
public class jugador extends personaje {
    // ATRIBUTOS
    public String inventario;
    
    // CONSTRUCTORES
    public jugador() {
        // llamar al constructor por defecto de personaje
        super();
        this.inventario = "";
    }
    
    public jugador(int vida, String inventario) {
        super(vida);
        this.inventario = inventario;
    }
    
    // GETTER Y SETTERS
    public String getInventario() {
        return this.inventario;
    }
    
    public void setInventario(String inventario) {
        this.inventario = inventario;
    }
    
    // MÉTODOS
    public void recoger(String objeto) {
        System.out.println("Recogiendo " + objeto + "...");
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "y es un JUGADOR con " + this.inventario;
    }
}
