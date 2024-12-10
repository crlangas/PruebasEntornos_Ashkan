package introduccionJavaEjercicios4_1;
import java.util.Scanner;
/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicioG {

    /*
    Definir un array rellenándolo desde el inicio con 5 palabras.
    Después, dejarlo limpio para que pueda usarse con otros datos. 
     */
    public static void main(String[] args) {
        // definicion de variables
        Scanner sc = new Scanner(System.in);
        String palabras[] = new String [5];
        // fin definicion de variables
        
        System.out.println("Dime 5 palabras.");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = sc.next();
        }
        System.out.println("Tus palabras son: ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = "";
        }
        System.out.println("Comprobacion de que se ha limpiado el array");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        
    }

}
