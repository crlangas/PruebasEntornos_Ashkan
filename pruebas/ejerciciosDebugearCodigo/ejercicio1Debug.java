package pruebas.ejerciciosDebugearCodigo;

import java.util.Scanner;

public class ejercicio1Debug {
    public static void main(String[] args) {
        int i, num;
        int fact = 1;
        Scanner sc = new Scanner(System.in);

        // instrucciones y pedir valor
        System.out.println("Di un número natural");
        num = sc.nextInt();
        sc.close();
        for (i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("El factorial es " + fact);
    }
}
