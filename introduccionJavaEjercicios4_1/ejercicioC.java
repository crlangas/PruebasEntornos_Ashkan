package introduccionJavaEjercicios4_1;

public class ejercicioC {

    public static void main(String[] args) {
        /*
        Generar 15 números aleatorios entre 1 y 999 y mostrar el primero de ellos. 
         */

        // declaracion de variables
        int numerosRandom[];
        // fin declaracion de variables
        // tamano de array numerosRandom
        numerosRandom = new int[15];
        // fin tamano

        for (int i = 0; i < numerosRandom.length; i++) {
            numerosRandom[0] = (int) Math.floor(Math.random() * 999 + 1);
        }
        System.out.println("Tu primer numero aleatorio es: " + numerosRandom[0]);
    }
}
