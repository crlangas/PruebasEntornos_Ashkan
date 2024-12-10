

package introduccionJavaEjercicios4_1;

/**
 * author Ashkan Sevinov Ashimov
 */
public class ejercicioH {

    /*
    Cambiar las vocales "a" de la frase "Pablito clavó un clavito." por "i". 
    */
    public static void main(String[] args) {
        // definicion de variables
        
        String frase = "Pablito clavo un clavito";
        frase = frase.replace('a', 'i');
        
        // fin definicion de variables
        
        System.out.println(frase);
        
    }

}
