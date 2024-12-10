package introduccionJavaEjercicios2_3;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //Crea un programa que lea un número entero introducido y lo muestre como un byte, double y booleano.


        //Declaración de variables
        int num = 0;
        Scanner sc = new Scanner(System.in);
        //Fin declaracion de variables
        System.out.println("Dime un número entero");
        num = sc.nextInt();
        sc.close();
        System.out.println("El numero introducido en byte es: " + num );
        
    }
}
