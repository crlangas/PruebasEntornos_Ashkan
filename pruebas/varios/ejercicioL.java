package pruebas.varios;
import java.util.Scanner;
public class ejercicioL {
    /*
     * ¿Recuerdas el operador %? Utilízalo para dar una lista de todos los números divisibles por 3, desde el 1 hasta el 100. 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerito = 0;
        System.out.println("Hasta que numero te digo los divisibles entre 3");
        numerito = sc.nextInt();

        for (int i = 0; i <= numerito ; i++) { 
            if (i % 3 == 0 ) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
