package ejerciciosAlpha;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicio1 {

    public static void main(String[] args) {
        // definicion de variables

        // fin definicion de variables
        int[] numeros = {1, 5, 4, 2, 6, 7, 3, 10, 8, 9};

        int aux = 0;

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros.length - 1; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    aux = numeros[j];

                    numeros[j] = numeros[j + 1];

                    numeros[j + 1] = aux;

                }

            }

        }

        for (int k = 0; k < numeros.length; k++) {

            System.out.print(numeros[k] + " ");

        }
    }

}
