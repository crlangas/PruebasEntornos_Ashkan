/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionJavaEjercicios2_1;
import java.util.Scanner;
/**
 *
 * @author Diurno
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA) que entra por pantalla. 
        El IVA estar� almacenado en una variable.
        */
        Scanner reader = new Scanner(System.in);
        System.out.println("De cuanto quieres pedir el prestamo y te dire el total");
        int prestamosolicitado;
        prestamosolicitado = reader.nextInt();
        double iva;
        iva = 0.21;
        double total = (prestamosolicitado * iva) + prestamosolicitado;
        System.out.println("Tu prestamo total es de: " + total + " euros");
        reader.close();
    }
    
}
