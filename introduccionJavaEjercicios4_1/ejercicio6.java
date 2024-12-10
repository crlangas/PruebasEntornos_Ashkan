package introduccionJavaEjercicios4_1;

import java.util.Scanner;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicio6 {

    /*
    Dé pistas para adivinar el nombre de una ciudad, haciéndolo con un array de Char:  
    a) El programador fija en un String el nombre secreto a adivinar (ejemplo: Valladolid).  
    b) El usuario tiene 3 oportunidades para elegir letras. 
       En cada intento, el programa contará cuántas veces está repetida esa letra en el nombre. 
       (en nuestro ejemplo: si el usuario quiere saber cuántas ?a? hay, se responderá que la ciudad secreta tiene 2).  
    c) Al final, tras obtener las pistas de las 3 letras, el usuario tiene que introducir un nombre de ciudad definitivo como respuesta final. 
       El programa lo comparará con la ciudad secreta (sin distinguir mayúsculas y minúsculas), y dirá si el usuario ha ganado o no. Capturar excepciones. 
     */
    public static void main(String[] args) {
        // definicion de variables
        Scanner sc = new Scanner(System.in); //leer por pantalla
        String[] ciudades = {
            "Albacete", // Castilla-La Mancha
            "Alicante", // Comunidad Valenciana
            "Oviedo", // Asturias
            "Badajoz", // Extremadura
            "Barcelona", // Cataluna
            "Bilbao", // Pais Vasco
            "Burgos", // Castilla y Leon
            "Caceres", // Extremadura
            "Cordoba", // Andalucia
            "Girona", // Cataluna
            "Granada", // Andalucia
            "Logrono", // La Rioja
            "Madrid", // Comunidad de Madrid
            "Murcia", // Region de Murcia
            "Pamplona", // Navarra
            "Santander", // Cantabria
            "Sevilla", // Andalucia
            "Valencia", // Comunidad Valenciana
            "Vitoria", // Pais Vasco
            "Zaragoza" // Aragon
        };

        int n = 0;
        n = (int) (Math.random() * 20);
        char [] letrasCiudad = ciudades[n].toCharArray(); //pasar ciudad elegida aleatoriamente, para descomponerlo en char
        // fin definicion de variables
        
        System.out.println("Mi ciudad es: " + ciudades[n]);
        System.out.println("Vas a tener 3 oportuniades para adivinar mi ciudad.");
        

    }

}
