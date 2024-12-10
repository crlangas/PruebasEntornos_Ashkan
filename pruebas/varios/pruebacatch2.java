package pruebas.varios;

import java.util.Scanner;

public class pruebacatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        sc.close();
            try {

                System.out.println(frase.substring(4, 10));
            } catch (StringIndexOutOfBoundsException sioobe) {
                System.out.println("Te has salido de la frase: " + sioobe);
            } catch (Exception e) {
                System.out.println("Error desconocido: " + e);

            }
    }
}