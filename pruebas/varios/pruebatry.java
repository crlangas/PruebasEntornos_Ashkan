package pruebas.varios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pruebatry {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Dime un numero");
            num1 = sc.nextInt();
            System.out.println("Dime otro");
            num2 = sc.nextInt();

            System.out.println(num1 / num2);

        } catch (InputMismatchException ime) {
            System.out.println("No se puede dividir entre una letra");
        } catch (Exception e) {
            System.out.println("No se puede dividir entre 0");
        }
        sc.close();
    }
}