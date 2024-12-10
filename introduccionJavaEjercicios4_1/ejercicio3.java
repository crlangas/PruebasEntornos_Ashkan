package introduccionJavaEjercicios4_1;

import java.util.Scanner;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicio3 {

    /*
    Pida al usuario 5 n�meros enteros (pueden ser positivos y negativos). 
    Despu�s deber� decir cu�les de ellos son PARES O IMPARES. 
    Al final dejar inicializado el array (con todos los valores igual a 0). 
     */
    public static void main(String[] args) {
        // definicion de variables
        Scanner sc = new Scanner(System.in);
        int numerosUsuario[];
        int i = 0;
        int j = 0;
        // fin definicion de variables
        numerosUsuario = new int[5]; //tamano del array
        System.out.println("Dime 5 numeros");
        for (i = 0; i < numerosUsuario.length; i++) {
            numerosUsuario[i] = sc.nextInt();
        }
        sc.close();
        for (j = 0; j < numerosUsuario.length; j++) {
            if (numerosUsuario[j] == 0) {
                System.out.println("El n�mero 0, es una excepcion ");
            } else if (numerosUsuario[j] % 2 == 0) {
                System.out.println("Tu n�mero " + numerosUsuario[j] + " es par");
            } else {
                System.out.println("Tu n�mero " + numerosUsuario[j] + " es impar");
            }
        }
    }
}
