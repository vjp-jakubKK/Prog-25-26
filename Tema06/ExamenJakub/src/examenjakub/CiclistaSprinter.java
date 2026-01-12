/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjakub;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclistas implements Pedaleable{
    private float aceleracion;

    // Constructores
    public CiclistaSprinter(float aceleracion, String nombre, float energia, boolean estaEscapado, float kmMeta, int numBidones, float velocidad, float hidratacion) {
        super(nombre, energia, estaEscapado, kmMeta, numBidones, velocidad, hidratacion);
        this.aceleracion = aceleracion;
    }

    public CiclistaSprinter(float aceleracion) {
        this.aceleracion = 0;
    }
    
    // Getters
    public float getAceleracion() {
        return aceleracion;
    }
    
    // Setters
    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    // Métodos para sobreescribir los métodos abstractos de la clase Ciclistas
    @Override
    public void Comer(float kmMeta, float energia){
        if(kmMeta >= 10) {
            energia += 25;
            System.out.println("El sprinter " + getNombre() + " acaba de tomar un gel. Su energía ahora es de " + getEnergia());
        } else {
            System.out.println("El sprinter " +getNombre()+ " no ha podido comer");
        }
    }
    
    @Override
    public void Beber(int numBidones, float energia, float hidratacion){
        if(numBidones == 0) {
            CogerBidones();
            hidratacion += 10;
            TirarBidon(numBidones);
            System.out.println("El sprinter " + getNombre() + " se ha hidratado. Su nivel de hidratación es de " + getHidratacion());
        } else {
            System.out.println("El sprinter " +getNombre()+ " no ha podido comer.");
        }
    }
    
    // Métodos para sobreescribir los métodos de la interfaz
    @Override
    public void Sprintar(float kmMeta, float energia, float velocidad) {
        if(kmMeta < 1 && energia > 50) {
            velocidad = aceleracion;
            energia -= 50;
            System.out.println("El sprinter " + getNombre() + " está esprintando a " +getVelocidad()+ "km/h.");
        }else {
            System.out.println("El sprinter " +getNombre()+ " aún no puede esprintar.");
        }
    }
    
    @Override
    public void Atacar(boolean estaEscapado, float hidratacion) {
        if(estaEscapado = false) {
            estaEscapado = true;
            hidratacion /= 0.1;
            System.out.println("El sprinter " + getNombre() + " está atacando.");
        } else {
            System.out.println("El sprinter " +getNombre()+ " no ha podido atacar.");
        }
    }
    
    @Override
    public float recuperar(float kmMeta, float energia) {
        
    }
}
