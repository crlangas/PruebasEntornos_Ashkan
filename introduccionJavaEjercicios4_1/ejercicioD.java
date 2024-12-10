package introduccionJavaEjercicios4_1;

import java.util.Scanner;

public class ejercicioD {

    public static void main(String[] args) {
        /*
        Generar 15 números aleatorios entre 1 y 999 y mostrar el que el usuario diga (del 1 al 15). 
         */
        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int numerosRandom[];
        int numeroPantalla = 0;
        // fin declaracion de variables

        // tamano de array numerosRandom
        numerosRandom = new int[15];
        // fin tamano

        for (int i = 0; i < numerosRandom.length; i++) {
            numerosRandom[i] = (int) (Math.floor(Math.random() * 999 + 1));
        }
        System.out.println("Dime un numero del 1 al 15");

        while (numeroPantalla < 1 || numeroPantalla > 15) {
            numeroPantalla = sc.nextInt();
            if (numeroPantalla < 1 || numeroPantalla > 15)
            System.out.println("Numero fuera de rango");
        }
        System.out.println("Tu numero es: " + numerosRandom[numeroPantalla - 1]);
    }
}
