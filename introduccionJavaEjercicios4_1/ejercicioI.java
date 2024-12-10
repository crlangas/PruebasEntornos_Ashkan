package introduccionJavaEjercicios4_1;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicioI {

    /*
    Sacar por pantalla el nombre "Pablito" desde la frase "Pablito clavó un clavito.". 
    Hazlo recorriendo la frase hasta que encuentres el primer espacio, 
    momento en el cual pararás y concatenarás las letras anteriores. 
     */
    public static void main(String[] args) {
        // definicion de variables

        String frase = "Pablito clavo un clavito";
        String nombrePablo = "";
        int i = 0;
        char letra = frase.charAt(i);
        // fin definicion de variables
        // recorrer toda la frase 
        for (i = 0; i < frase.length(); i++) {

            // una vez recorrida, cuando se encuentre un espacio imprimira por pantalla pablito
            letra = frase.charAt(i);
            if (letra == ' ') {
                break;
            }
            nombrePablo = nombrePablo + letra;
        }
        
        // imprimir por pantalla pablito
        System.out.println(nombrePablo);
    }

}
