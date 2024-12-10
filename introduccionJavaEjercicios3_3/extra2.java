package introduccionJavaEjercicios3_3;

import java.util.Scanner;

public class extra2 {
    public static void main(String[] args) {
        /*
         * Determinar si un año introducido por teclado es bisiesto (busca TODAS las
         * reglas que cumple un bisiesto).
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int ano = 0;
        // fin declaracion de variables

        System.out.println("Dime un ano y te digo si es bisiesto o no");
        ano = sc.nextInt();
        sc.close();

        /*
         * Explicacion del ejercicio
         * se divide el ano entre 4 (cada 4 años es bisiesto) y dividiendo entre 100
         * (para que no sea igual a 0)
         * y se divide entre 400 para los anos centenarios
         */

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Es un ano bisiesto");
        } else {
            System.out.println("No es un ano bisiesto");
        }
    }
}
