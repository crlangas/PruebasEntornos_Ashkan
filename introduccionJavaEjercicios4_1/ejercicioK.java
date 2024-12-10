package introduccionJavaEjercicios4_1;

import java.util.Scanner;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicioK {

    /*
    En el ejercicio anterior, dar las edades de mayor a menor, 
    ordenando manualmente (sin usar Arrays.sort()). 
     */
    public static void main(String[] args) {
        // definicion de variables

        Scanner sc = new Scanner(System.in);
        int edadAlumnosClase[] = new int[10];

        // fin definicion de variables
        //Pedir por pantalla edades de alumno
        System.out.println("Dime la edad de 10 alumnos");
        for (int i = 0; i < edadAlumnosClase.length; i++) {
            edadAlumnosClase[i] = sc.nextInt();
        }
        
        //Organizar numeros de array
        for (int i = 0; i < edadAlumnosClase.length; i++) { 
            int aux = 0; // variable auxiliar dentro del primer for
            for (int j = 0; j < edadAlumnosClase.length - 1; j++) { // el -1 es para que no se salga del array
                if (edadAlumnosClase[j] > edadAlumnosClase[j + 1]) { // comprueba si la primer posicion del array es mayor que la segunda posicion
                    aux = edadAlumnosClase[j]; // primero almacena la primera posicion en la variable auxiliar
                    edadAlumnosClase[j] = edadAlumnosClase[j + 1];
                    edadAlumnosClase[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < edadAlumnosClase.length; i++) {
            System.out.println(edadAlumnosClase[i]);
        }
    }
}
