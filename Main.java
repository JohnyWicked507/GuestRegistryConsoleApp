import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración y asignación de variables para representar la información del visitante
        String nombre;
        int edad;
        char genero;
        boolean esResidente;

        // Solicitar al usuario que ingrese la información del visitante
        System.out.println("Ingrese el nombre del visitante:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del visitante:");
        edad = scanner.nextInt();

        System.out.println("Ingrese el género del visitante (M/F):");
        genero = scanner.next().charAt(0);

        System.out.println("¿El visitante es residente? (true/false):");
        esResidente = scanner.nextBoolean();

        // Imprimir la información del visitante en pantalla
        System.out.println("\nInformación del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("¿Es residente?: " + esResidente);
    }
}
