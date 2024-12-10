package introduccionJavaEjercicios4_1;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        /*
        Pida 10 n�meros por teclado y saque lo siguiente por pantalla:  - Suma de esos 10 n�meros. - Cu�ntos n�meros positivos hay. - Cu�ntos n�meros negativos hay.  
         */
        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int numPantalla[];
        int suma = 0;
        int positivos = 0;
        int negativos = 0;
        // fin declaracion de variables
        // tamano array numPantalla
        numPantalla = new int[10];
        // fin tamano array numPantalla
        System.out.println("Dime 10 numeros");

        //suma de los 10 numeros
        for (int i = 0; i < numPantalla.length; i++) {
            numPantalla[i] = sc.nextInt();
            suma = numPantalla[i] + suma;
        }
        sc.close();

        //numeros positivos
        for (int i = 0; i < numPantalla.length; i++) {
            if (numPantalla[i] >= 0) {
                positivos++;
            } else {
                negativos++;
            }
        }
        System.out.println("La suma de los 10 numeros es: " + suma);
        System.out.println("Contador de numeros negativos:  " + negativos);
        System.out.println("Contador de numeros positivos: " + positivos);
    }
}
