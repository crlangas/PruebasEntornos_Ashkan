package introduccionJavaEjercicios3_1;

import java.util.Scanner;

/**
 *
 * @author Ashkan
 */
public class ejercicio7 {

    public static void main(String[] args) {
        /*
         * Sea una calculadora: se han de pedir al usuario dos numeros, y dar la opcion
         * de sumarlos, restarlos, multiplicarlos o dividirlos.
         * Segun la eleccion del usuario se dara el resultado final.
         */

        // declaracion de variables
        double num1, num2 = 0;
        int menu = 0;
        Scanner sc = new Scanner(System.in);
        // fin declaracion de variables

        System.out.println("Elige una opcion");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Has elegido sumar dos numeros");
                System.out.println("Dime dos numeros");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Has elegido restar dos numeros");
                System.out.println("Dime dos numeros");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Has elegido dividir dos numeros");
                System.out.println("Dime dos numeros");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("La division es: " + (num1 / num2));
                break;
            case 4:
                System.out.println("Has elegido multiplicar dos numeros");
                System.out.println("Dime dos numeros");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("La multiplicacion es: " + (num1 * num2));
                break;
            default:
                System.out.println("Elige una opcion del menu, porfavor y gracias");
        }
        sc.close();
    }
}
