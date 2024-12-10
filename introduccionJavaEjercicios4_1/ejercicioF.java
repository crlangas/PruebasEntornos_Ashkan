package introduccionJavaEjercicios4_1;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicioF {

    /*
    Generar un array con longitud aleatoria (entre 1 y 27). 
    Serán letras desde la z en adelante. 
    Es decir: el primer término será z, el segundo y, y así sucesivamente. 
    Al final se sacará por pantalla su longitud y cada uno de los términos. 
     */
    public static void main(String[] args) {
        // definicion de variables

        // generar num aleatorio de 1 a 27
        int longitud = (int) (Math.random() * 27 + 1);
        // crear array de char con la variable longitud
        char longitudArray[] = new char[longitud];
        char letrasAbecedario[] = {
            'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r',
            'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i',
            'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
        
        // fin definicion de variables
        
        // ejercicio
        for (int i = 0; i < longitudArray.length; i++) {
            System.out.println("Las letras del array son: " + letrasAbecedario[i]);
        }
        
        System.out.println("El tamano del array es de: " + longitud);
    }

}
