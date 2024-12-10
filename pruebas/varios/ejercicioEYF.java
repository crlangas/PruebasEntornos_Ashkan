package pruebas.varios;

import java.util.Scanner;

public class ejercicioEYF {
    public static void main(String[] args) {
        /*Escribe un programa que sume los números enteros que el usuario vaya introduciendo por pantalla. 
        Se finalizará cuando se ponga un 0, momento en el cual se dará el resultado final. Hacer con while */

        //declaracion de variables
        int i = 0;
        int f = 1;
        Scanner sc = new Scanner(System.in);

        //fin declaracion de variables
        System.out.println("Dime un número");


        /*  CON (WHILE)

        while (f!= 0) {
            f = sc.nextInt();
            i = (i + f);
        }
        */
        
        /* CON (DO WHILE) */

        do { 
            f = sc.nextInt();
            i = (i + f);
        } while (f != 0);


        System.out.println("Has salido del programa");
        System.out.println("El total de la suma es: " + i);
        System.out.println("Hasta luego :D ");
        sc.close();
    }
}
