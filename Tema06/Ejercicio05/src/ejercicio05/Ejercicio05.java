/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("SIN POLIMORFISMO");
        System.out.println("-------------------------");
        
        Ornitorrinco ornitorrinco = new Ornitorrinco("Perry", "Macho", "Marrón", 5, 2);
        Murcielago murcielago = new Murcielago("Batty", "Hembra", "Negro", 3, 10);
        
        System.out.println(ornitorrinco.obtenerMensajeOviparo());
        ornitorrinco.mostrarDatos();
        ornitorrinco.ponerHuevo();
        ornitorrinco.incubarHuevo();
        ornitorrinco.ponerHuevo();
        ornitorrinco.mostrarNumHuevos();
        
        System.out.println("-------------------------");
        
        System.out.println(murcielago.obtenerMensajeVolador());
        murcielago.mostrarDatos();
        murcielago.aumentarAlturaVuelo();
        murcielago.bajarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        
        System.out.println("CON POLIMORFISMO");
        System.out.println("-------------------------");
        
        Oviparo o = new Ornitorrinco("Felipe", "Hembra", "Marrón", 1, 0);
        Volador v = new Murcielago("Carlos", "Macho", "Gris", 4, 20);
        
        System.out.println(o.obtenerMensajeOviparo());
        o.ponerHuevo();
        o.incubarHuevo();
        o.ponerHuevo();
        o.mostrarNumHuevos();
        
        System.out.println("-------------------------");
        
        System.out.println(v.obtenerMensajeVolador());
        v.aumentarAlturaVuelo();
        v.bajarAlturaVuelo();
        v.mostrarAlturaVuelo();
        
    }
    
}
