package introduccionJavaEjercicios4_1;

public class ejercicioA {
    public static void main(String[] args) {
        /*
         * Crear un array con los días de la semana, y mostrar por pantalla qué día es
         * hoy.
         */
        // declaracion de variables
        String diasSemana[];
        // fin declaracion de variables
        // tamaño de arrays
        diasSemana = new String[7];
        // fin tamaño arrays
        // llenado array diasSemana
        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miercoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Sabado";
        diasSemana[6] = "Domingo";
        // fin llenado array diasSemana
        // ejercicio
        System.out.println(diasSemana[0]);
        System.out.println(diasSemana[1]);
        System.out.println(diasSemana[2]);
        System.out.println(diasSemana[3]);
        System.out.println(diasSemana[4]);
        System.out.println(diasSemana[5]);
        System.out.println(diasSemana[6]);
        // ejercicio

    }
}
