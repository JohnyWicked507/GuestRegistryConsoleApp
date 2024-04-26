import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaracion de variables para representar la informacion del visitante
        String nombre;
        int edad = 0;
        char genero;
        boolean esResidente;
        int totalVisitas = 0;
        double tiempoPromedio = 0;

        // Solicitar al usuario que ingrese la informacion del visitante y el tiempo de estadia
        for (int i = 1; i <= 7; i++) {
            print("\nIngrese la informacion del visitante #" + i + ":");

            print("Nombre del visitante:");
            nombre = input();

            print("Edad del visitante:");
            edad = Integer.parseInt(input());

            print("Genero del visitante (M/F):");
            genero = input().charAt(0);

            print("¿El visitante es residente? (Si/No):");
            esResidente = obtenerRespuestaSiNo(input());

            totalVisitas++;

            tiempoPromedio += calcularTiempoPromedio();

            print("Informacion del visitante #" + i + ":");
            print("Nombre: " + nombre);
            print("Edad: " + edad);
            print("Genero: " + genero);
            print("¿Es residente?: " + (esResidente ? "Si" : "No"));
        }

        tiempoPromedio /= 7;

        // Imprimir resultados
        print("\nResultados:");
        print("Cantidad total de visitas: " + totalVisitas);
        print("Tiempo promedio de estadia: " + tiempoPromedio + " horas");

        if (edad >= 18) {
            print("El visitante es mayor de edad.");
        }
        print("El visitante es menor de edad.");
    }

    // Metodo para convertir la respuesta del usuario a booleano
    private static boolean obtenerRespuestaSiNo(String respuesta) {
        return respuesta.equalsIgnoreCase("Si");
    }

    // Metodo para simular el calculo del tiempo promedio de estadia
    // Supongamos que el tiempo promedio de estadia es de 2.5 horas
    private static double calcularTiempoPromedio() {
        return 2.5;
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
