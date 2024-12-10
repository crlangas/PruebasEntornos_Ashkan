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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        //Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1852 metros.
        
        System.out.println("Cuantas millas quieres calcular a metros (Numeros Enteros por favor)"); //pregunta al usuario
        int millasleidas; //variable de millas
        millasleidas = reader.nextInt(); //lee por pantalla las millas
        System.out.println("Las milla/s " + millasleidas + " son en metros: " + (millasleidas * 1852) + " metros"); //calculo de millas
        reader.close();
    }
    
}
