/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionJavaEjercicios2_1;

import java.util.Scanner;

/**
 *
 * @author Diurno
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner reader = new Scanner(System.in);
        System.out.println("Saca el volumen de una esfera a partir del radio");
        System.out.println("Introduce el radio"); // pide radio
        double radio; // variable radio
        radio = reader.nextDouble(); // lee por pantalla el radio
        System.out.println("El volumen de la esfera es:" + (4 / 3 * (Math.PI * (Math.pow(radio, 3))))); // calculo de
                                                                                                        // esfera
        reader.close();
    }

}
