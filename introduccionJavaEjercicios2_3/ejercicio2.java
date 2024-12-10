package introduccionJavaEjercicios2_3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que sea capaz de poner en mayúsculas cualquier frase que se introduzca (explora la ayuda de Java para ello). 
         * Luego intenta, con las herramientas de Scanner (next(), nextLine()) que una palabra quede en mayúscula, y otra en minúscula, y así sucesivamente.
         */

        //Declaración de variables
        String textodefecto;
        int menu = 0;
        Scanner sc = new Scanner (System.in);
        //Fin de la declaración de variables
       
        //Pregunta y respuesta de programa
        System.out.println("Escribe un texto en mayúsculas y en minúsculas y te lo cambio como tu quieras");
        textodefecto = sc.nextLine();

        //Menu
        System.out.println("Selecciona una opción");
        System.out.println("1. Pasar el texto a mayúsculas");
        System.out.println("2. Pasar el texto a minúsculas");
        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println(textodefecto.toUpperCase());
                break;
            case 2:
                System.out.println(textodefecto.toLowerCase());
                break;
            default:
                System.out.println("Has escrito algo mal de seguro :(");
                break;
        }
        sc.close();
    }
}
