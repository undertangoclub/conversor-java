package conversor;

import com.google.gson.JsonObject;
import java.util.Scanner;

public class CurrencyConverter {
    private static final String[] SUPPORTED_CURRENCIES = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
    private ApiClient apiClient;
    private Scanner scanner;

    public CurrencyConverter() {
        this.apiClient = new ApiClient();
        this.scanner = new Scanner(System.in);
    }

    public void convert() {
        System.out.println("\nMonedas soportadas:");
        for (int i = 0; i < SUPPORTED_CURRENCIES.length; i++) {
            System.out.println((i + 1) + ". " + SUPPORTED_CURRENCIES[i]);
        }

        System.out.print("Seleccione la moneda de origen (1-6): ");
        String fromCurrency = SUPPORTED_CURRENCIES[scanner.nextInt() - 1];

        System.out.print("Seleccione la moneda de destino (1-6): ");
        String toCurrency = SUPPORTED_CURRENCIES[scanner.nextInt() - 1];

        System.out.print("Ingrese la cantidad a convertir: ");
        double amount = scanner.nextDouble();

        try {
            JsonObject rates = apiClient.getRates(fromCurrency);
            double rate = rates.get("conversion_rates").getAsJsonObject().get(toCurrency).getAsDouble();
            double result = amount * rate;

            System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, result, toCurrency);
        } catch (Exception e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }
}