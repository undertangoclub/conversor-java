package conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Conversor de Monedas ---");
            System.out.println("1. Convertir monedas");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();

            if (option == 1) {
                converter.convert();
            } else if (option == 2) {
                System.out.println("Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }
}