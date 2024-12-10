import com.google.gson.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        // URL de la API
        String url_str = "https://v6.exchangerate-api.com/v6/1cd1ab759f382bac3620aaf8/latest/USD";

        // Hacer la solicitud
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convertir la respuesta a JSON
        JsonElement root = JsonParser.parseReader(new InputStreamReader(request.getInputStream()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Extraer las tasas de conversión
        JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");

        // Monedas disponibles (incluye MXN al inicio)
        String[] monedas = {"MXN", "ARS", "BOB", "BRL", "CLP", "COP", "USD"};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar menú de selección
            System.out.println("\nSelecciona la moneda de origen:");
            for (int i = 0; i < monedas.length; i++) {
                System.out.printf("%d. %s\n", i + 1, monedas[i]);
            }
            System.out.println("0. Salir");

            // Leer la selección del usuario
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo del programa. ¡Adiós!");
                break; // Salir del bucle
            }
            if (opcion < 1 || opcion > monedas.length) {
                System.out.println("Opción inválida. Intenta de nuevo.");
                continue; // Repetir el bucle
            }

            String monedaOrigen = monedas[opcion - 1];

            // Pedir el monto al usuario
            System.out.printf("Ingresa el monto en %s: ", monedaOrigen);
            double monto = scanner.nextDouble();

            // Obtener la tasa de conversión
            double tasaOrigen = conversionRates.get(monedaOrigen).getAsDouble();

            // Convertir a dólares
            double montoEnDolares = monto / tasaOrigen;

            // Mostrar el resultado
            System.out.printf("El monto en dólares (USD) es: %.2f\n", montoEnDolares);
        }
    }
}
