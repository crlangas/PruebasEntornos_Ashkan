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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ejercicio 3: ");
        System.out.println("?Como te llamas?"); //pregunta al usuario su nombre
        String nombre; //variable de nombre (en string) signifca que almacena letras
        nombre = reader.nextLine(); //creamos variable para que lea por pantalla lo que escriba el usuario (line)
        System.out.println("Hola " + nombre); //sale por pantalla todo lo anterior
        reader.close();
    }
    
}
