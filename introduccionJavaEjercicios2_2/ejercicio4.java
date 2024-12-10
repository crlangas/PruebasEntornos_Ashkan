package introduccionJavaEjercicios2_2;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Escribe un programa que lea cinco números, calcule y muestre el promedio de ellos.
        System.out.println("Dime el primer numero");
        int numero1;
        numero1 = reader.nextInt();
        System.out.println("Dime el segundo numero");
        int numero2;
        numero2 = reader.nextInt();
        System.out.println("Dime el tercer numero");
        int numero3;
        numero3 = reader.nextInt();
        System.out.println("Dime el cuarto numero");
        int numero4;
        numero4 = reader.nextInt();
        System.out.println("Dime el quinto numero");
        int numero5;
        numero5 = reader.nextInt();
        int sumaentera = (numero1+numero2+numero3+numero4+numero5);
        System.out.println("La suma de los 5 números es: " + sumaentera);
        System.out.println("Y el promedio es: " + (sumaentera/5));

        reader.close();
    }
}
