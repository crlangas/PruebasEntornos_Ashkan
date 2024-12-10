package aceptaElReto;

import java.util.Scanner;

/**
 * autor: Ashkan Sevinov Ashimov
 */
public class problema710 {

    /*
    En la Copa Mundial Femenina de Fútbol de 2023 participaron 32 equipos, cada uno representando a su país, 
    entre ellos Espa?a. El número de países del mundo es mucho mayor que 32, de modo que para poder participar, los equipos tuvieron que superar una fase clasificatoria previa.

    La Federación Internacional de Fútbol (FIFA) asignó un número de plazas en el mundial a cada una de las seis confederaciones continentales.
    Así, la UEFA (Europa) recibió 11 plazas, la AFC (Asia) recibió 6, la CAF (África) y la CONCACAF (América del Norte y Centroamérica) recibieron 4 cada una, 
    la CONMEBOL (Sudamérica) recibió 3 y la OFC (Oceanía) recibió 1. El resto de plazas se utilizaron para una repesca intercontinental 
    en la que participaron las selecciones nacionales mejor clasificadas de cada confederación que se hubieran quedado sin hueco.
     */
    public static void main(String[] args) {

        // definicion de variables
        Scanner sc = new Scanner(System.in);
        int numCasos = 0;
        int datos[] = new int[7];
        // fin definicion de variables

        System.out.println("Dime el numero de casos");
        numCasos = sc.nextInt();
        sc.nextLine();
    }
}
