package introduccionJavaEjercicios4_1;

import java.util.Scanner;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicio4 {

    /*
    Pedir por pantalla la altura de 10 personas. 
    Y cuántos de ellos están por encima de la media
     */
    public static void main(String[] args) {
        // definicion de variables
        int i = 0;
        int j = 0;
        int k = 0;
        int[] alturaPersona;
        int sumaPersonas = 0;
        int media = 0;
        Scanner sc = new Scanner(System.in);
        // fin definicion de variables

        alturaPersona = new int[10]; //tama?o array

        //pedir altura personas
        System.out.println("Dime la altura de 10 personas (en cm)");
        for (i = 0; i < alturaPersona.length; i++) {
            alturaPersona[i] = sc.nextInt();
        }

        //hacer la media
        for (j = 0; j < alturaPersona.length; j++) {
            sumaPersonas = alturaPersona[j] + sumaPersonas;
        }
        media = sumaPersonas / 10;
        System.out.println("La media de las 10 alturas es: " + media + " cm");

        //por encima de la media
        for (k = 0; k < alturaPersona.length; k++) {
            if (alturaPersona[k] > media) {
                System.out.println("Los que estan por encima de la media es la siguiente altura:  " + alturaPersona[k] + " cm");
            }
        }
    }
}
