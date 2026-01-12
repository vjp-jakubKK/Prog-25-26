/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("introduce un numero del 0 al 10: ");
        nota = entrada.nextInt();
        
        // Aqui lo que queremos saber es, dependiendo de la nota introducida, si tiene un suspenso, bien, notable o sobresaliente
        // Con el switch lo que hacemos es crear diferentes casos donde ponemos cada nota y a que se refiere
        
        switch(nota){
            case 0: {
                System.out.println("Tu nota es: suspenso");
                break;
            }
            case 1: {
                System.out.println("Tu nota es: suspenso");
                break;
            }
            case 2: {
                System.out.println("Tu nota es: suspenso");
                break;
            }
            case 3: {
                System.out.println("Tu nota es: suspenso");
                break;
            }
            case 4: {
                System.out.println("Tu nota es: suspenso");
                break;
            }
            case 5: {
                System.out.println("Tu nota es: bien");
                break;
            }
            case 6: {
                System.out.println("Tu nota es: bien");
                break;
            }
            case 7: {
                System.out.println("Tu nota es: notable");
                break;
            }
            case 8: {
                System.out.println("Tu nota es: notable");
                break;
            }
            case 9: {
                System.out.println("Tu nota es: sobresaliente");
                break;
            }
            case 10: {
                System.out.println("Tu nota es: sobresaliente");
                break;
            }
            default: {
                System.out.println("No has puesto una nota valida");
                }
        }
        
        
    }
    
}
