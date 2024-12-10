package pruebas.varios;

public class ejercicioI {
    public static void main(String[] args) {
        /*
         * Indica dos formas de concatenar las palabras "Voy", "a", "aprobar",
         * "programación", con sus respectivos espacios. Después reemplaza las "a" por "u".
         */

        // Declaracion de variables
        String palabra1 = "Voy";
        String palabra2 = "a";
        String palabra3 = "aprobar";
        String palabra4 = "programacion";
        String frase = "Voy a aprobar programacion";

        // Manera 2 de concatenar palabras
        // String[] palabras = { palabra1, palabra2, palabra3, palabra4 }; // junta todas las palabras
        // String fraseentera = String.join(" ", palabras);

        // Fin declaracion de variables

        frase = frase.replace('a', 'u'); // reemplazar a por u
        System.out.println("Palabra concatenada de primera mandera ");
        System.out.println(palabra1 + " " + palabra2 + " " + palabra3 + " " + palabra4); // forma 1 de concatenar palabras
        System.out.println("Remplazar a por u");
        System.out.println(frase);

        //System.out.println(fraseentera); // forma 2 de concatenar palabras

    }
}
