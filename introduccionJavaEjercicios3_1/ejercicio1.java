package introduccionJavaEjercicios3_1;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        /* Calcule la media de notas de 4 alumnos, introducidas por pantalla. */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int nota1, nota2, nota3, nota4 = 0;
        int sumaNotas = 0;
        // fin declaracion de variables
        System.out.println("Dime la nota que han sacado 4 alumnos en programacion");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();
        nota4 = sc.nextInt();
        int nota = (nota1 + nota2 + nota3 + nota4);
        sc.close();
        for (i = 0; i < 4; i++) {
            sumaNotas = (sumaNotas + nota);
        }

        System.out.println("La suma de las 4 notas es: " + sumaNotas + " y la media es: " + (sumaNotas / 4));

    }

}
