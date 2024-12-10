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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        
        //Escribe un programa que lea dos n�meros, calcule y muestre el valor de sus suma, resta, producto y divisi�n.
        
        System.out.println("Dime un numero entero"); //pide un numero
        int num1; //variable num1
        num1 = reader.nextInt(); //lee por pantalla num1
        System.out.println("Dime otro numero entero"); //pide un numero 2
        int num2; //variable num2
        num2 = reader.nextInt(); //lee por pantalla num2
        
        System.out.println("La suma es: " + (num1+num2)); //suma 
        System.out.println("La resta es: " + (num1-num2)); //resta
        System.out.println("La multiplicacion es: " + (num1*num2)); //multiplicacion
        System.out.println("La division es: " + (num1/num2)); //division
        reader.close();
    }
    
}
