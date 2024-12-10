package pruebas.varios;

import java.util.Scanner;

public class ejercicioG {
    public static void main(String[] args) {
        /*
         * Realiza un programa que diga la tabla de multiplicar de un número introducido
         * por pantalla.
         */

        // declaracion de variables
        int i = 0;
        int j = 0;
        Scanner sc = new Scanner(System.in);
        // fin declaracion de variables

        System.out.println("Te voy a decir la tabla hasta del 10");

        for (i = 0; i <= 10; i++) {
            System.out.println("La tabla del: " + i);
            for (j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " es: " + (j * i));
            }

            System.out.println("");
        }
        sc.close();
    }
}
