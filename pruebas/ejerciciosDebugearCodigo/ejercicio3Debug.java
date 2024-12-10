package pruebas.ejerciciosDebugearCodigo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3Debug {
    public static void main(String[] args) {
        int numero = 0;
        boolean pedirDato = true;
        Scanner reader = new Scanner(System.in);

        while (pedirDato == true) {
            try {
                System.out.println("Introduce un número entero: ");
                numero = reader.nextInt();
                reader.close();
                pedirDato = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no es un número.");
                break;
            }
        }
        System.out.println("El número es " + numero);
    }
}
