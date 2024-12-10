/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionJavaEjercicios1_1;

import java.util.Scanner;

/**
 *
 * @author Diurno
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner reader = new Scanner(System.in);
        System.out.println("Ejercicio 4: ");
        System.out.println("Calcule el diametro de una circunferencia a partir de un radio introducido."); // pide al
                                                                                                           // usuario un
                                                                                                           // radio de
                                                                                                           // un circulo
        double radio; // variable de radio de una circunferencia
        radio = reader.nextDouble(); // variable para introducir numeros con decimales (double)
        System.out.println("El diametro de tu circunferencia es: " + (radio * radio)); // slae por pantalla todo lo
                                                                                       // anterior dicho
        reader.close();
    }

}
