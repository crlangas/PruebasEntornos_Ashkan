package pruebas.ejerciciosDebugearCodigo;

public class ejercicio4Debug {
    public static void main(String[] args) {
        int[] datos = new int[5];
        for (int i = 0; i < 5; i++) {
            datos[i] = (int) Math.floor(Math.random() * 10);
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("El dato " + (j + 1) + " es " + datos[j]);
        }
    }
}