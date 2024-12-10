package pruebas.ejerciciosDebugearCodigo;

public class ejercicio2Debug {
    public static void main(String[] args) {
        for (int i = 3; i >= 0; i--) {
            for (int j = 5; j > 0; j--) {
                if (j == 2) {
                    continue;
                }
                System.out.println(j);
            }
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
    }
}
