package introduccionJavaEjercicios3_1;

public class ejercicio9 {
    public static void main(String[] args) {

        // De 2 a 15
        for (int i = 0; i < 1; i++) {
            System.out.println(2 + Math.floor((14 * Math.random())));
        }

        // De 222 a 535 = hay 314 numeros
        for (int j = 0; j < 1; j++)
            System.out.println(222 + Math.floor(314 * Math.random()));
            
        // Con letras
        double numero = (1 + Math.floor(5 * Math.random()));
        int numnuevo = (int) numero;
        switch (numnuevo) {
            case 1:
                System.out.println("La letra es: a");
                break;
            case 2:
                System.out.println("La letra es: e");
                break;
            case 3:
                System.out.println("La letra es: i");
                break;
            case 4:
                System.out.println("La letra es: o");
            case 5:
                System.out.println("La letras es: u");
            default:
                break;
        }
    }
}
