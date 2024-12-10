package introduccionJavaEjercicios3_3;

import java.util.Scanner;

public class extra3 {
    public static void main(String[] args) {
        /*
         * Hacer un contador de letras. A partir de una frase que desee el programador
         * (por ejemplo, la letra de una canción), el programa preguntará al usuario qué
         * letra quiere que se cuente. El programa dirá el número de esas letras
         * contenidas en la frase. (Ejemplo: "Mi mamá me mima", si el usuario dice que
         * quiere contar letras "a" el resultado será 3).
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        String mensaje; // mensaje pedida para usuario
        int contador = 0; // contador que pasa letra por letra por toda el mensaje
        char letra = '\u0000'; // letra pedida por usuario
        // fin declaracion de variables

        System.out.println("Escribe lo que tu quieras");
        mensaje = sc.nextLine();

        System.out.println("Que letra quieres que te cuente");
        letra = sc.next().charAt(0);
        sc.close(); // cerrar scanner

        mensaje = mensaje.toLowerCase(); // pasar el mensaje a minusculas

        for (int i = 0; i < mensaje.length(); i++) {
            if (!Character.isLowerCase(letra)) { // comprobar si la letra esta en minuscula
                mensaje.toUpperCase();
                if (mensaje.charAt(i) == letra) {
                    contador++;
                }
            } else if (mensaje.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + contador + " veces en la frase");

        /*
         * explicacion (indexOF)
         * nos devuelve la posicion, mediante un numero entero de una cadena o caracter
         * dentro de una cadena de texto
         */
        // System.out.println("x\nxx\nxxx\nxxxx\nxxxxx\nxxxx\nxxx\nxx\nx"); ejercicio
        // pedido por paco
    }
}
