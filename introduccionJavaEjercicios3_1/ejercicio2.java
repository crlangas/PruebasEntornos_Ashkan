package introduccionJavaEjercicios3_1;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        /*
         * Calcule el numero medio (el que no es ni el mayor ni el menor) de entre tres
         * introducidos.
         */

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Dime tres numeros ENTEROS por pantalla y te dire cual es el del medio");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        sc.close();
        if ((num1 < num2 && num1 > num3) || (num1 > num2 && num1 < num3)) {
            System.out.println("El numero " + num1 + " es el del medio");
        } else if ((num2 < num1 && num2 > num3) || (num2 > num1 && num2 < num3)) {
            System.out.println("El numero " + num2 + " es el del medio");
        } else if ((num3 < num1 && num3 > num2) || (num3 > num1 && num3 < num2)) {
            System.out.println("El numero " + num3 + " es el del medio");
        } else {
            System.out.println("Los tres numeros son iguales: " + num1 + ", " + num2 + ", " + num3);
        }
    }
}
