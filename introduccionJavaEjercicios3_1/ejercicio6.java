package introduccionJavaEjercicios3_1;

import java.util.Scanner;

/**
 *
 * @author Ashkan
 */
public class ejercicio6 {

    public static void main(String[] args) {
        /*
         * Cuente de forma descendente solo numeros impares hasta el 1, desde el numero
         * que indique el usuario.
         */

        // declaracion de variables
        int numpantalla = 0;
        Scanner sc = new Scanner(System.in);
        // fin declaracion de variables

        System.out.println("Dime un numero entero y te dire los numeros impares hasta el 1");
        numpantalla = sc.nextInt();

        for (int i = numpantalla; i >= 0; i--) {
            if (i % 2 == 0) {
            } else {
                System.out.println(i);
            }
        }
        sc.close();

    }
}
