/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionJavaEjercicios1_1;

import java.util.Scanner;

/**
 *
 * @author Ashkan Sevinov Ashimov
 */
public class ejerciciosV1 {

    //Ejercicios simples para aprender a escribir
    //Ashkan Sevinov Ashimov
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner reader = new Scanner(System.in); //declaracion de variable de scanner

        //Ejercicio 1
        System.out.println("Ejercicio 1: ");
        System.out.println("Hola Mundo");
      
        //Ejercicio 2 = son comentarios
        
        //Ejercicio 3
        System.out.println("Ejercicio 3: ");
        System.out.println("?Como te llamas?"); //pregunta al usuario su nombre
        String nombre; //variable de nombre (en string) signifca que almacena letras
        nombre = reader.nextLine(); //creamos variable para que lea por pantalla lo que escriba el usuario (line)
        System.out.println("Hola " + nombre); //sale por pantalla todo lo anterior
        
        //Ejercicio 4
        System.out.println("Ejercicio 4: ");
        System.out.println("Calcule el diametro de una circunferencia a partir de un radio introducido."); //pide al usuario un radio de un circulo
        double radio; //variable de radio de una circunferencia
        radio = reader.nextDouble(); //variable para introducir numeros con decimales (double)
        System.out.println("El diametro de tu circunferencia es: " + (radio * radio)); //slae por pantalla todo lo anterior dicho
        
        //Ejercicio 5
        System.out.println("Ejercicio 5: ");
        System.out.println("Por favor, dime tu edad"); //pregunta al usuario su edad
        int edad; //variable de edad (int) significa numeros enteros
        edad = reader.nextInt(); //creamos variable para que lea por pantalla lo que escriba el usuario (int) enteros
        System.out.println("Hola " + nombre + ", tienes " + edad + " anos"); //sale por pantalla todo lo anterior dicho

        //Ejercicio 7
        System.out.println("Ejercicio 7: ");
        System.out.println("Sumaremos a continuaci�n dos numeros, ? vale " + nombre + " ? ");
        System.out.println("Dime un numero"); //pedimos al usuario un numero entero
        int i; //creamos la variable para el numero entero
        i = reader.nextInt(); //leemos lo que se escriba por pantalla
        System.out.println("Dime otro numero"); //pedimos numero entero por pantalla
        int j; //leemos lo que se escriba por pantalla
        j = reader.nextInt(); //pedimos otro numero entero por pantalla
        System.out.println("La suma de los dos numeros es: " + (i + j)); //imprime por pantalla todo pedido anteriormente
        System.out.println("Muy bien " + nombre + " la suma es: " + (i + j) + " y tienes " + edad + " anos ");
        
        reader.close();

    }

}
