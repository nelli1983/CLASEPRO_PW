public class ConversorTemperaturas {
    public static void main(String[] args) {

        // Variables que pueden cambiar
        double celsius = 25.0;

        // Conversión usando método
        double fahrenheit = convertirCelsiusAFahrenheit(celsius);

        // Mostramos los resultados
        mostrar("Temperatura en Celsius", celsius, "°C");
        mostrar("Temperatura en Fahrenheit", fahrenheit, "°F");

        // --- Ejemplo: si cambia la temperatura ---
        System.out.println("\n--- Después de cambiar la variable ---");

        celsius = 10.0;  // Cambiamos el valor
        fahrenheit = convertirCelsiusAFahrenheit(celsius);

        mostrar("Temperatura en Celsius", celsius, "°C");
        mostrar("Temperatura en Fahrenheit", fahrenheit, "°F");
    }

    // Método que convierte C → F
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    // Método para mostrar datos formateados
    public static void mostrar(String texto, double valor, String unidad) {
        System.out.println(texto + ": " + valor + " " + unidad);
    }
}
