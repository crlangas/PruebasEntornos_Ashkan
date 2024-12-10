package introduccionJavaEjercicios2_2;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Escribe un programa que pregunte la edad de una persona y muestre cuántos años tendrá dentro de 10 años.
        System.out.println("¿Cuántos años tienes ahora?");
        int edad;
        edad = reader.nextInt();
        System.out.println("En 10 años tendrás: " + (10+edad) + " años");
        reader.close();
    }
}
