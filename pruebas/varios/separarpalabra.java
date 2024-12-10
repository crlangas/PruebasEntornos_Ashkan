
package pruebas.varios;

import java.util.Scanner;

/**
 *
 * @author Diurno
 */
public class separarpalabra {
    public static void main(String[] args) {

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        String frase = "";
        int longitud = 0;
        int i = 0;
        // fin declaracion de variables

        // pedir frase
        System.out.println("Dime una frase y la deletreo");
        frase = sc.nextLine();
        sc.close();
        // calcular la longitud
        longitud = frase.length();

        // deletrear con for
        for (i = 0; i < longitud; i++) {
            System.out.println(frase.substring(i, (i + 1)));
        }
        
    }
}
