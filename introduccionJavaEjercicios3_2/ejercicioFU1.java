package introduccionJavaEjercicios3_2;

import java.util.Scanner;

public class ejercicioFU1 {

    public static void main(String[] args) {
        /*
         * Pida una frase por teclado y muestre el número de caracteres que tiene.
         */
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        String frasecita = "";
        // Fin declaracion de variables

        System.out.println("Dime una frase y te dire el numero de caracteres que tiene");
        frasecita = sc.nextLine();
        int contarcaracter = frasecita.length();
        System.out.println("La frase tiene: " + contarcaracter + " caracteres");

        sc.close();
    }
}