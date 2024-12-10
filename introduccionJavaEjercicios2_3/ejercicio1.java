package introduccionJavaEjercicios2_3;

import java.util.Scanner;
    /*Escribe un programa que convierta una longitud en metros a pies y pulgadas. 
    El programa debe permitir al usuario ingresar una longitud en metros y luego realizar las conversiones correspondientes a pies y pulgadas. 
    Ten en cuenta que 1 metro equivale a aproximadamente 3.28084 pies y 39.3701 pulgadas. 
    El programa debe mostrar los resultados de las conversiones en un formato claro y legible. 
    Para realizar otra conversión, el usuario debe poder ingresar un nuevo valor en metros y ver los resultados actualizados. 
    El programa debe despedirse de manera educada.*/

    //Variables
    // 1 metro = 3.28084 pies
    // 1 metro = 39.3701 pulgadas
public class ejercicio1 {
    public static void main(String[] args) {

        //Declaración de variables
        double pies = 3.28084; 
        double pulgadas = 39.3701;
        double metroapie = 0;
        double metroapulgada = 0;
        int menu = 0;
        Scanner sc = new Scanner(System.in);

        //Fin declaracion de variables

        //Menu
        System.out.println("Elige una opción");
        System.out.println("1. Pasar de metros(m) a pies");
        System.out.println("2. Pasar de metros(m) a pulgadas");
        System.out.println("3. Cerrar");
        menu = sc.nextInt();
        
        //Opciones del menu en ejecucion
        switch (menu) {
            case 1:
                System.out.println("Dime cuántos metros quieres a pies");
                metroapie = sc.nextDouble();
                System.out.println("Los " + metroapie + " son metros " + (metroapie*pies) + " pies");
                break;
            case 2:
                System.out.println("Dime cuántos metros quieres a pulgadas");
                metroapulgada = sc.nextDouble();
                System.out.println("Los " + metroapulgada + " son metros " + (metroapulgada * pulgadas) + " pulgadas");
                break;
            default:
                break;
        }
        sc.close();
    }
}
