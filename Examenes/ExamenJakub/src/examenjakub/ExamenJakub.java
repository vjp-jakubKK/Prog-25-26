/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenjakub;

/**
 *
 * @author alumno
 */
public class ExamenJakub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los objetos
        CiclistaEscalador escalador = new CiclistaEscalador(40, 50, "Carlos", 40, true, 50, 1, 40, 20);
        CiclistaSprinter sprinter = new CiclistaSprinter(50, "Juan", 30, false, 90, 2, 30, 50);
        
        escalador.Atacar(true, 40);
        escalador.Beber(1, 30, 10);
        escalador.Comer(30, 10);
        
        sprinter.Sprintar(60, 50, 30);
        sprinter.Beber(2, 50, 10);
        sprinter.Comer(50, 10);
        
        
    }
    
}
