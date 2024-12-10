package introduccionJavaEjercicios4_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicioJ {

    /*
     Pedir al usuario las edades de 10 alumnos de 1DAW. 
    El programa las ordenará de menor a mayor con Arrays.sort() y las sacará ordenadas por pantalla. 
     */
    public static void main(String[] args) {
        // definicion de variables

        Scanner sc = new Scanner(System.in);
        int alumnosClase[] = new int[10];
        int i = 0;
        int j = 0;

        // fin definicion de variables
        // ejercicio
        System.out.println("Dime la edad de 10 alumnos de tu clase.");
        for (i = 0; i < alumnosClase.length; i++) {
            alumnosClase[i] = sc.nextInt();
        }
        Arrays.sort(alumnosClase);
        System.out.println("Te muestro las edades de menor a mayor:");
        for (j = 0; j < alumnosClase.length; j++) {
            System.out.println(alumnosClase[j]);
        }

    }

}
