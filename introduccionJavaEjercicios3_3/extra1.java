package introduccionJavaEjercicios3_3;

import java.util.Scanner;

public class extra1 {
    public static void main(String[] args) {
        /*
         * Determinar si un número de máximo 5 cifras es capicúa o no.
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        String numero = "";
        int menu = 0;
        // fin declaracion de variables

        // menu
        System.out.println("Elige del menu de cuanto será tu numero y te dire si es capicua o no"); // enunciado del ejercicio
        System.out.println("1. Un numero de 3 cifras"); // menu para 3 cifras
        System.out.println("2. Un numero de 4 cifras"); // menu para 4 cifras
        System.out.println("3. Un numero de 5 cifras"); // menu para 5 cifras
        System.out.println("4. Salir"); // salir del programa
        menu = sc.nextInt(); // lectura de menu

        // inicio de programa
        switch (menu) {
            case 1:
                System.out.println("Dime un numero entero de 3 cifras");
                numero = sc.next();
                char tresCifrasNum1 = numero.charAt(0); // compara el primero con el tercero
                char tresCifrasNum3 = numero.charAt(2); // compara el tercero con el primero
                if ((tresCifrasNum1 == tresCifrasNum3)) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
                break;
            case 2:
                System.out.println("Dime un numero entero de 4 cifras");
                numero = sc.next();
                char cuatroCifrasNum1 = numero.charAt(0); // compara el primero con el ultimo
                char cuatroCifrasNum4 = numero.charAt(3); // compara el ultimo con el primero
                char cuatroCifrasNum2 = numero.charAt(1); // compara el segundo con el tercero
                char cuatroCifrasNum3 = numero.charAt(2); // compara el tercero con el segundo
                if ((cuatroCifrasNum1 == cuatroCifrasNum4) || (cuatroCifrasNum2 == cuatroCifrasNum3)) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
                break;
            case 3:
                System.out.println("Dime un numero entero de 5 cifras");
                numero = sc.next();
                char cincoCifrasNum1 = numero.charAt(0); // compara el primero con el ultimo
                char cincoCifrasNum5 = numero.charAt(4); // compara el ultimo con el primero
                char cincoCifrasNum2 = numero.charAt(1); // compara el segundo con el cuarto
                char cincoCifrasNum4 = numero.charAt(3); // compara el cuarto con el segundo
                if ((cincoCifrasNum1 == cincoCifrasNum5) || (cincoCifrasNum2 == cincoCifrasNum4)) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
                break;
            case 4:
                System.out.println("Has salido del programa correctamente");
                break;
            default:
                System.out.println("Porfavor, elige una opcion del menu (1, 2, 3, 4)");
                break;
        }
        sc.close(); // cerrar scanner
        // fin de programa
    }
}
