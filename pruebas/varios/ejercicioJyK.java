package pruebas.varios;

import java.util.Scanner;

public class ejercicioJyK {
    public static void main(String[] args) {
        /*
         * J) Intenta hacer un Scanner de un caracter (dato tipo char). ¿Qué observas?
         * Explora formas de hacerlo.
         * K) Pasa distintos String a booleano. ¿Cómo se puede obtener un valor "true"?
         * ¿Qué ocurre en los demás casos?
         */

        // Ejercicio J

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        char letra;
        // Fin de la declaracion de variables

        // Manera numero 1
        System.out.println("Dime una letra y te la leo");
        letra = sc.next().charAt(0); // lectura de una letra
        System.out.println("Manera numero 1: " + letra);

        // Manera numero 2
        char letrita = '\u0000';
        letrita = sc.next().charAt(letrita);
        System.out.println("Manera numero 2: " + letrita);
        sc.close(); // cerrar scanner

        // Ejercicio K

        // Declaracion de variables
        String palabra1 = "Hola";
        String palabra2 = "true"; // en booleano pondra true es la unica manera para sacar true
        String palabra3 = "Buenas Tardes soy Ashkan";

        boolean bol1 = Boolean.parseBoolean(palabra1);
        boolean bol2 = Boolean.parseBoolean(palabra2);
        boolean bol3 = Boolean.parseBoolean(palabra3);
        // Fin declaracion de variables

        System.out.println(bol1);
        System.out.println(bol2);
        System.out.println(bol3);
    }
}
