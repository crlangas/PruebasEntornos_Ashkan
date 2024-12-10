package introduccionJavaEjercicios3_2;

public class ejercicioFU9 {
    public static void main(String[] args) {
        // Sea un Keygen (generador de contraseñas aleatorio) de 3 cifras numéricas.
        // declaracion de variables
        String letraA = "a";
        String letraE = "e";
        String letraI = "i";
        String letraO = "o";
        String letraU = "u";
        double numeroDouble = (100 + Math.floor((900 * Math.random()))); // numrandom-de-100-a-999
        int numeroEntero = (int) numeroDouble; // pasar-de-Double-a-Entero
        // fin declaracion de variables

        System.out.println("Te creare un generador de contrasena de 3 numeros y una letra");
        double numero = (1 + Math.floor(5 * Math.random())); // elige-aleatoriamente-un-numero-del-1-al-5-(para-el-switch-case)
        int numnuevo = (int) numero; // convertir-de-Double-a-Entero
        switch (numnuevo) {
            case 1:
                System.out.println(numeroEntero + letraA);
                break;
            case 2:
                System.out.println(numeroEntero + letraE);
                break;
            case 3:
                System.out.println(numeroEntero + letraI);
                break;
            case 4:
                System.out.println(numeroEntero + letraO);
            case 5:
                System.out.println(numeroEntero + letraU);
            default:
                break;
        }
    }
}
