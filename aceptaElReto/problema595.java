package aceptaElReto;

import java.util.Scanner;

public class problema595 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = 0;
        int casosConcretos = 0;
        int resultado = 0;
        numCasos = sc.nextInt();

        for (int i = 0; i < numCasos; i++) {
            casosConcretos = sc.nextInt();
            resultado = (int) Math.floor(casosConcretos / 100);
            System.out.println(resultado);
        }
        sc.close();
    }
}