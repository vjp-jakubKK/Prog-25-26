/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElMayor;

/**
 *
 * @author alumno
 */
public class Mayor {
    public static void calculo (int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor de los introducidos es: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El numero mayor de los introducidos es: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero mayor de los introducidos es: " + num3);
        }
    }
}
