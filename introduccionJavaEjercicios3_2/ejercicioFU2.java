package introduccionJavaEjercicios3_2;
import java.util.Scanner;
public class ejercicioFU2 {
    public static void main(String[] args) {
        /*
         * Use el método concat() para concatenar un nombre pedido por teclado con un saludo.
         */

         //declaracion de variables
         Scanner sc = new Scanner(System.in);
         String nombre = "";
         //fin declaracion de variables

         System.out.println("Dime tu nombre");
         nombre = sc.nextLine();
         System.out.println("Hola, ".concat(nombre)); 
         sc.close();

    }
}
