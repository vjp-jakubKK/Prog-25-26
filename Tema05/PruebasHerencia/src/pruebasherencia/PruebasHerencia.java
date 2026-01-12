/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasherencia;

/**
 *
 * @author alumno
 */
public class PruebasHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaje personaje = new personaje();
        System.out.println(personaje);
        
        jugador jugador = new jugador(50, "Palo");
        System.out.println(jugador);
        
        enemigo enemigo = new enemigo(30, "Espada");
        System.out.println(enemigo);
        
        personaje.atacar();
        jugador.atacar();
        enemigo.atacar();
        
        jugador.recoger("moneda");
//        personaje.recoger("moneda"); ambos no tienen el método recoger
//        enemigo.recoger("moneda");

        enemigo.crearSoldados();
        
        System.out.println(jugador.getInventario());
        System.out.println(jugador.getVida());
        
        System.out.println(enemigo.getVida());
        jugador.atacar();
        
    }
    
}
