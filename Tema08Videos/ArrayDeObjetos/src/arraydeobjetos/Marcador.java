/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydeobjetos;

/**
 *
 * @author krosz
 */
public class Marcador {
    // Atributos
    private String color;
    private float precio;
    
    // Constructores
    public Marcador() {
        this.color = "";
        this.precio = 0.0f;
    }
    
    public Marcador(String color, float precio) {
        this.color = color;
        this.precio = precio;
    }
    
    // Getter y Setter
    public String getColor() {
        return color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    // TO STRING
    @Override
    public String toString(){
        return "Marcador{" + "color=" + color + ", precio = " + precio + "}";
    }
}
