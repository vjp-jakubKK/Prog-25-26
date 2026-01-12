/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjakub;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclistas implements Pedaleable{
    private float potencia;
    private float fuerza;

    // Constructores
    public CiclistaEscalador(float potencia, float fuerza, String nombre, float energia, boolean estaEscapado, float kmMeta, int numBidones, float velocidad, float hidratacion) {
        super(nombre, energia, estaEscapado, kmMeta, numBidones, velocidad, hidratacion);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }

    public CiclistaEscalador(float potencia, float fuerza) {
        this.potencia = 0;
        this.fuerza = 0;
    }
    
    // Getters
    public float getPotencia() {
        return potencia;
    }

    public float getFuerza() {
        return fuerza;
    }
    
    // Setters

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }
    
    // Métodos para sobreescribir los métodos abstractos de la clase Ciclistas
    @Override
    public void Comer(float kmMeta, float energia){
        if(kmMeta >= 20) {
             energia += 20;
            System.out.println("El escalador " + getNombre() + " acaba de tomar un gel. Su energía ahora es de " + getEnergia());
        } else {
            System.out.println("El escalador " +getNombre()+ " aún no puede comer.");
        }
    }
    
    @Override
    public void Beber(int numBidones, float energia, float hidratacion){
        if(numBidones == 0) {
            CogerBidones();
            hidratacion += 10;
            TirarBidon(numBidones);
            System.out.println("El escalador " + getNombre() + " se ha hidratado. Su nivel de hidratación es de " + getHidratacion());
        } else {
            System.out.println("El escaldor " +getNombre()+ " no se ha hidratado.");
        }
    }
    
    // Métodos para sobreescribir los métodos de la interfaz
    @Override
    public void Sprintar(float kmMeta, float energia, float velocidad) {
        if(kmMeta < 0.3 && energia > 20) {
            velocidad = potencia/fuerza;
            System.out.println("El escalador " +getNombre()+ " está esprintando.");
        }else {
            System.out.println("El escalador " +getNombre()+ " aún no puede sprintar.");
        }
    }
    
    @Override
    public void Atacar(boolean estaEscapado, float hidratacion) {
        if(estaEscapado = false) {
            estaEscapado = true;
            hidratacion /= 0.2;
            System.out.println("El escalador " + getNombre() + " está atacando.");
        } else {
            System.out.println("El escalador " +getNombre()+ " aun no puede atacar.");
        }
            
    }
    
    @Override
    public float recuperar(float kmMeta, float energia) {
       
    }
}
