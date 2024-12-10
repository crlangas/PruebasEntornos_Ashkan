/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionJavaEjercicios2_1;

import java.util.Scanner;

/**
 *
 * @author Ashkan
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        
        //Escribe un programa que d� los ?buenos d�as? seguido del nombre que se introduzca por pantalla.
        System.out.println("Cual es tu nombre? ");
        String nombre; //variable
        nombre = reader.nextLine(); //leer texto por pantalla
        
        System.out.println("Buenos dias " +  nombre); //resultado
        reader.close();
    }
    
}
