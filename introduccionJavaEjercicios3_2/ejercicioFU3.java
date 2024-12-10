package introduccionJavaEjercicios3_2;

import java.util.Scanner;

public class ejercicioFU3 {
    public static void main(String[] args) {
        /*
         * Pida una contraseña de tipo string en minúscula y compruebe si es correcta o
         * no. La contraseña NO distinguirá mayúsculas de minúsculas. Ejemplo: si la
         * contraseña es perro y se introduce Perro, es OK.
         */

        // declaracion de variables
        Scanner sc = new Scanner(System.in); // lector-de-texto-escrito-por-pantalla
        String nombreInicio = ""; // el-nombre-del-usuario
        String contrasenaInicio = ""; // esto-es-la-contrasena-que-escribira-el-usuario-por-pantalla
        String contrasenaCorrecta = "perro"; // contrasena-correcta
        String contraEnMinusculas = ""; // crear-variable-para-convertir-en-minusculas
        // fin declaracion de variables

        System.out.println("Iniciar sesion");
        System.out.println("Dime tu nombre");
        nombreInicio = sc.nextLine(); // lectura-de-nombre-del-usuario
        System.out.println("Hola " + nombreInicio + " , por favor, introduce tu contrasena"); // pedir-usuario-contrasena
        contrasenaInicio = sc.nextLine(); // lee-contrasena

        sc.close(); // cerrar-lectura-por-pantalla

        contraEnMinusculas = contrasenaInicio.toLowerCase(); // pasa-la-contrasena-a-minusculas

        if (!contraEnMinusculas.equals(contrasenaCorrecta)) {
            System.out.println("Contrasena incorrecta");
        } else {
            System.out.println("Contrasena correcta");
        }
    }
}
