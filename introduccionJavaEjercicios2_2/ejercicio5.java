package introduccionJavaEjercicios2_2;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Escribe un programa que calcule el porcentaje de una parte con respecto al total. La parte y el total se introducen por teclado.
        System.out.println("¿Cuanto dinero tienes?");
        double dineroinicio;
        dineroinicio = sc.nextDouble();
        System.out.println("¿Qué porcentaje quieres ahorrar?");
        double porcentaje;
        porcentaje = sc.nextDouble();
        double finalporcentaje = (porcentaje/100);

        System.out.println("El dinero que ahorrarás será de: " + (dineroinicio*finalporcentaje) + " euros");
        sc.close();
    }
}
