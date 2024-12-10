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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        
        //Escribe un programa que calcule y muestre el �rea de un cuadrado de lado que entre por pantalla.
        
        System.out.println("Dime el lado de un cuadrado");
        double ladoCuadrado; //variable
        ladoCuadrado = reader.nextDouble(); //leer por pantalla
        System.out.println("El area del cuadrado es: " + (ladoCuadrado*ladoCuadrado)); //resultado
        reader.close();
    }
    
}
