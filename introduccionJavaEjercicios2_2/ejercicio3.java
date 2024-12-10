package introduccionJavaEjercicios2_2;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Escribe un programa que calcule el volumen de un cilindro. El radio y la altura se introducen por teclado
        System.out.println("Calcularemos el volumen de un cilindro por su radio y altura");
        System.out.println("Dime su radio");
        double radio;
        radio = reader.nextDouble();
        System.out.println("Dime su altura");
        double altura;
        altura = reader.nextDouble();
        System.out.println("El volumen es: " + (Math.PI*altura*(Math.pow(radio,2))));
        reader.close();
    }
}
