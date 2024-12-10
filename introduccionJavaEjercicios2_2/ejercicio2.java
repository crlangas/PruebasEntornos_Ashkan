package introduccionJavaEjercicios2_2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Escribe un programa que calcule el perímetro de un triángulo cuyos tres lados se introducen por teclado.
        System.out.println("Dime el primer lado del triangulo");
        float lado1;
        lado1 = reader.nextFloat();
        System.out.println("Dime el segundo");
        float lado2;
        lado2 = reader.nextFloat();
        System.out.println("Dime el tercer");
        float lado3;
        lado3 = reader.nextFloat();

        System.out.println("El perímetro del triángulo es: " + (lado1+lado2+lado3));
        reader.close();
    }
}
