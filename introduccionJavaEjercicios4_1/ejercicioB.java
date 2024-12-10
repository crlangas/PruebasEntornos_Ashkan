package introduccionJavaEjercicios4_1;

import java.util.Scanner;

public class ejercicioB {
    public static void main(String[] args) {
        /*
         * Hacer un programa que pida 5 números y luego los muestre por pantalla. (B
         * bis):
         * Intenta hacer el llenado de números con un bucle, o al menos si no te sale
         * piensa cómo sería.
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int numeros[];
        int i = 0;
        // fin declaracion de variables

        // tamano de arrays
        numeros = new int[5];
        // fin tamano arrays

        // llenar arrays
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 1;
        numeros[3] = 1;
        numeros[4] = 1;
        // fin llenar arrays

        System.out.println("Dime 5 numeros");
        // pedir 5 numeros por pantalla
        for (i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }
        // mostar los 5 numeros por pantalla
        for (i = 0; i < 5; i++) {
            System.out.println("Tu numero es: " + numeros[i]);
        }
    }
}
