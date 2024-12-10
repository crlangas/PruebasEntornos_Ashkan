package introduccionJavaEjercicios3_1;

import java.util.Scanner;

/**
 *
 * @author Ashkan
 */
public class ejercicio3 {

    public static void main(String[] args) {
        /*
         * Diga si una letra introducida por el usuario es vocal o consonante.
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);

        // fin declaracion de variables

        System.out.println(
                "Dime una letra y te dire si es vocal o consonante. Si es una palabra, cogere la primera letra"); // pedir
                                                                                                                  // letra
                                                                                                                  // al
                                                                                                                  // usuario
        char letra = sc.next().charAt(0); // si escribe una palabra, que eliga la primera letra
        letra = Character.toLowerCase(letra); // pasar la letra a minuscula

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') { // comprar si letra es igual
                                                                                            // a las vocales
            System.out.println("La letra que me has escrito es vocal");
        } else if (Character.isLetter(letra)) { // si es distinto que ponga que es consonante
            System.out.println("La letra que me has escrito es consonante");
        } else { // no ha escrito el usuario una letra o una palabra
            System.out.println("No me has escrito una letra");
        }

        sc.close();
    }
}
