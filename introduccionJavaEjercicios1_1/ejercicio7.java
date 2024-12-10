/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionJavaEjercicios1_1;
import java.util.Scanner;
/**
 *
 * @author Diurno
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        //Ejercicio 7
        System.out.println("Ejercicio 7: ");
        System.out.println("Sumaremos a continuaci�n dos numeros");
        System.out.println("Dime un numero"); //pedimos al usuario un numero entero
        int i; //creamos la variable para el numero entero
        i = reader.nextInt(); //leemos lo que se escriba por pantalla
        System.out.println("Dime otro numero"); //pedimos numero entero por pantalla
        int j; //leemos lo que se escriba por pantalla
        j = reader.nextInt(); //pedimos otro numero entero por pantalla
        System.out.println("La suma de los dos numeros es: " + (i + j)); //imprime por pantalla todo pedido anteriormente
        reader.close();
    }
    
}
