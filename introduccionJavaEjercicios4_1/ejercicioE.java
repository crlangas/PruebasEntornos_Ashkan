package introduccionJavaEjercicios4_1;

public class ejercicioE {

    public static void main(String[] args) {
        /*
        Generar 15 números aleatorios entre 1 y 999 y mostrarlos todos. 
         */

        // declaracion de variables
        int numRandoms[];
        // fin declarcion de variables

        // tamano array numRandoms
        numRandoms = new int[15];
        // fin tamano array numRandoms

        for (int i = 0; i < numRandoms.length; i++) {
            numRandoms[i] = (int) Math.floor(Math.random() * 999 + 1);
            System.out.println(numRandoms[i]);
        }

    }
}
