package introduccionJavaCancion;

public class ejercicioCancion {
    public static void main(String[] args) {
        /*
         * La canción más escuchada en España durante 2022 fue “Bzrp Music Sessions,
         * Vol. 52”, del artista argentino Bizarrap con la voz melodiosa del canario
         * Quevedo (el bueno).
         * La profunda letra de su estribillo es la que sigue:
         * Y nos fuimos en una Empezamo' a la 1 Y con la nota rápido Nos dieron las 3
         * Perreamos toda la noche Y nos dormimo' a las 10' Ando rezándole a Dios Pa'
         * repetirlo otra ve'.
         */

        // declaracion de variables
        String frase = "Y nos fuimos en una Empezamo' a la 1 Y con la nota rápido Nos dieron las 3 Perreamos toda la noche Y nos dormimo' a las 10' Ando rezándole a Dios Pa' repetirlo otra ve'.";
        int numCaracteres = frase.length(); // sacar numero de caracteres
        String fraseNueva = "Dime, beba Fecha y hora y te paso a buscar"; // la frase nueva
        String crearFrase = frase + fraseNueva; // añadir la frase nueva
        int nuevosCaracteres = crearFrase.length(); // sacar numero de caracteres nuevos
        // fin declaracion variables

        // Ejercicio1
        System.out.println("Ejercicio 1: tiene " + numCaracteres + " caracteres");

        // Ejercicio2
        System.out.println("Ejercicio 2: tiene " + nuevosCaracteres + " caracteres");
    }
}
