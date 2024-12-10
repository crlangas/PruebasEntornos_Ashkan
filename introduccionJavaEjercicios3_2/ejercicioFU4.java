package introduccionJavaEjercicios3_2;

import java.util.Scanner;

public class ejercicioFU4 {
    public static void main(String[] args) {
        /*
         * Extraiga el número 0 de la frase “Voy a sacar un 0 en programación”, y lo
         * concatene con un número que se introduzca por teclado, multiplicándose por 3
         * y sacando por pantalla el resultado final.
         * Ejemplo: se introduce por teclado un 17, se ha de hacer el cálculo 170 * 3 =
         * 510.
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        String numPantalla = "";
        String frase = "Voy a sacar un 0 en programacion"; // el-numero-15-es-el-0
        char numFraseChar = frase.charAt(15);
        String aString = Character.toString(numFraseChar); // pasar-de-char-a-string

        // ejercicio
        System.out.println("Dime un numero");
        numPantalla = sc.next();
        String numeroFinal = numPantalla.concat(aString); // concatenar-el-0-con-el-num-introducido-por-pantalla
        int numeroConcatenado = Integer.parseInt(numeroFinal); // pasar-el-numero-concatenado-a-int
        System.out.println("El resultado es: " + numeroFinal + " * 3 es igual a: " + numeroConcatenado * 3);
        sc.close(); // cerrar-lectura
    }
}
