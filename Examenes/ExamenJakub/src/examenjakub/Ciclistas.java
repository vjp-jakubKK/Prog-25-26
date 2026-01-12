/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjakub;

/**
 *
 * @author alumno
 */
public abstract class Ciclistas {
    private String nombre;
    private float energia;
    private boolean estaEscapado;
    private float kmMeta;
    private int numBidones;
    private float velocidad;
    private float hidratacion;
    static private int ciclistasCreados;

    // Constructores
    public Ciclistas(String nombre, float energia, boolean estaEscapado, float kmMeta, int numBidones, float velocidad, float hidratacion) {
        this.nombre = nombre;
        this.energia = energia;
        this.estaEscapado = estaEscapado;
        this.kmMeta = kmMeta;
        this.numBidones = numBidones;
        this.velocidad = velocidad;
        this.hidratacion = hidratacion;
        this.ciclistasCreados = ciclistasCreados;
    }
    
    public Ciclistas() {
        this.nombre = "";
        this.energia = 50;
        this.estaEscapado = false;
        this.kmMeta = 120;
        this.numBidones = 2;
        this.velocidad = 0;
        this.hidratacion = 50;
        this.ciclistasCreados = 0;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public float getEnergia() {
        return energia;
    }

    public boolean isEstaEscapado() {
        return estaEscapado;
    }

    public float getKmMeta() {
        return kmMeta;
    }

    public int getNumBidones() {
        return numBidones;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public float getHidratacion() {
        return hidratacion;
    }
    
    public int getCiclistasCreados() {
        return ciclistasCreados;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public void setEstaEscapado(boolean estaEscapado) {
        this.estaEscapado = estaEscapado;
    }

    public void setKmMeta(float kmMeta) {
        this.kmMeta = kmMeta;
    }

    public void setNumBidones(int numBidones) {
        this.numBidones = numBidones;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void setHidratacion(float hidratacion) {
        this.hidratacion = hidratacion;
    }
    
    public void setCiclistasCreados(int ciclistasCreados) {
        this.ciclistasCreados = ciclistasCreados;
    }
    
    // Método para que el objeto recoja o no bidones
    public void CogerBidones() {
        if(kmMeta >= 10) {
            numBidones += 2;
        } else {
            System.out.println("No puedes coger bidones a mennos de 10km de meta");
        }
    }
    
    // Método para que el ciclista se deshaga de 1 bidón
    public static void TirarBidon(int numBidones) {
        numBidones -= 1;
    }
    
    // Método para aumentar el nº de ciclistas
    public void AumentarCiclistas(int ciclistasCreados) {
        ciclistasCreados++;
    }
    
    // Método para ver el número de ciclistas creados
    public void VerCiclistas(int ciclistasCreados) {
        System.out.println("El número de ciclistas es: " + ciclistasCreados);
    }
    
    //Métodos abstractos
    public abstract void Comer(float kmMeta, float energia);
    public abstract void Beber(int numBidones, float energia, float hidratacion);
}
