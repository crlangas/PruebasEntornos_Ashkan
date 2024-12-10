package introduccionJavaEjercicios3_1;

import java.util.Scanner;

/**
 *
 * @author Ashkan
 */
public class ejercicio5 {

    public static void main(String[] args) {
        /*
         * Diga el numero mayor de entre 5 introducidos.
         */
        // Declaracion de variables
        int num1, num2, num3, num4, num5 = 0;
        Scanner sc = new Scanner(System.in);
        // Fin declaracion de variables
        System.out.println("Dime 5 numeros y te digo cual es el mayor");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();
        sc.close();

        if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5) {
            System.out.println("Has anadido el mismo numero: " + num1);
        } else if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
            System.out.println("El numero " + num1 + " es el mayor");
        } else if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) {
            System.out.println("El numero " + num2 + " es el mayor");
        } else if ((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) {
            System.out.println("El numero " + num3 + " es el mayor");
        } else if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)) {
            System.out.println("El numero " + num4 + " es el mayor");
        } else {
            System.out.println("El numero " + num5 + " es el mayor");
        }

    }

}
