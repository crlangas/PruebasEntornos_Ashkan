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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variable
        Scanner reader = new Scanner(System.in);
        System.out.println("Escribe un programa que dado el precio de un art�culo y el precio de venta real nos muestre el porcentaje de descuento realizado.");
        
        double preciobase = 1500; //precio base del ordenador portatil
        System.out.println("El precio de un ordenador Lenovo es de: " + preciobase); //saca por pantalla el precio base
        System.out.println("A que precio esta ahora el ordenador"); //pregunta al usuario a que precio esta ahora
        double precioahora; //variable para precioactual
        precioahora = reader.nextDouble(); //lee por pantalal lo que introduzca el usuario
        double diferenciaprecio;
        diferenciaprecio = (preciobase - precioahora);
        System.out.println("Entonces tiene una rebaja de: " + (diferenciaprecio/preciobase) * 100 + " %"); //hace el calculo para el porcentaje
        reader.close();
    }
    
}
