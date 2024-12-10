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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        //Ejercicio 5
        System.out.println("Ejercicio 5: ");
        System.out.println("Por favor, dime tu edad"); //pregunta al usuario su edad
        int edad; //variable de edad (int) significa numeros enteros
        edad = reader.nextInt(); //creamos variable para que lea por pantalla lo que escriba el usuario (int) enteros
        System.out.println("Hola, tienes " + edad + " anos"); //sale por pantalla todo lo anterior dicho
        reader.close();
    }
    
}
