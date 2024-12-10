package aceptaElReto;

import java.util.Scanner;

public class problema217 {
    public static void main(String[] args) {
        /*
         * El programa recibirá, por la entrada estándar, un conjunto de casos de
         * prueba, cada uno en una línea. Cada caso de prueba estará compuesto de un
         * número de vivienda. Se garantiza que nunca será mayor que 1.000.
         * El último caso, que no deberá procesarse, será el número 0.
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num = 0;
        // fin declaracion de variables

        while (true) { 
                num = sc.nextInt();
                if (num == 0) {
                    break; // el bucle para si el numero introducido es 0
                }

            if (num % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
        }
        sc.close();

    }
}