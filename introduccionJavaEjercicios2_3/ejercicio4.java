package introduccionJavaEjercicios2_3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // Autor: Ashkan Sevinov Ashimov

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        double num1, num2 = 0;
        // Fin declaracion de variables

        // Inicio del programa
        System.out.println("Dime un numero"); // pide un numero al usuario
        num1 = sc.nextDouble(); // lee num1 por pantalla
        System.out.println("Dime otro numero"); // pide otro numero al usuario
        num2 = sc.nextDouble(); // lee num2 por pantalla

        if (num2 == 0) {
            System.out.println("No se puede dividir entre 0"); // se sale del if porque no se puede dividir entre 0
        } else {
            double decimal = (num1 / num2);
            int entero = (int) (decimal); // (int) para truncar sin decimales
            int redondeo = (int) (Math.ceil(decimal)); // (int) para truncar sin decimales pero con Math.ceil =
                                                       // redondear hacia arriba

            System.out.println("El decimal es: " + decimal);
            System.out.println("El numero entero sin decimales es: " + entero);
            System.out.println("El numero redondeado es: " + redondeo);
            sc.close(); // cerramos scanner para buena practica

        }
    }
}
