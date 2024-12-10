package introduccionJavaEjercicios3_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioFU10 {

    // Autor: Ashkan Sevinov Ashimov
    // Fecha: 30 de Octubre de 2024
    public static void main(String[] args) {
        /*
         * Pedir un numero y decir por qué numero es divisible
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        // fin declaracion de variables

        // ejercicio
        System.out.println("Dime un numero entero y te dire por que numeros se puede dividir");

        // comprobamos primero si es un numero entero
        try {
            numero = sc.nextInt(); // lee-num-por-pantalla
            // si no es un numero entero nos saldra el siguiente mensaje por pantalla
        } catch (InputMismatchException ime) {
            System.out.println("Tiene que ser un numero entero y positivo :D");
        }
        // fin de comprobacion
        
        sc.close(); // cerramos Scanner

        if (numero < 0) { // primero-comprobamos-que-no-sea-un-numero-negtivo
            System.out.println("No se puede dividir por un numero negativo :( ");
        } else {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}