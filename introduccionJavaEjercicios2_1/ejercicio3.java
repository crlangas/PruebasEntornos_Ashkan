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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        
        //Escribe un programa que calcule el �rea de un rect�ngulo cuyos lados se introducen por teclado.
        System.out.println("Escribeme las medidas de un rectangulo");
        System.out.println("Lado 1: ");
        double lado1; //variable1
         lado1 = reader.nextDouble();
        System.out.println("Lado 2: "); //leer por pantalla
        double lado2; //variable2
        lado2 = reader.nextDouble(); //leer por pantalla
        
        System.out.println("El area de tu reactangulo es: " + (lado1*lado2)); //resultado
        reader.close();
    }
    
}
