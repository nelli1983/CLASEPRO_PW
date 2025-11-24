public class Compra {
    // Constantes del ejemplo
    static final double PRECIO_CON_IVA = 298.45;
    static final int IVA_PORCENTAJE = 12;

    public static void main(String[] args) {

        double precioSinIVA = calcularSinIVA(PRECIO_CON_IVA, IVA_PORCENTAJE);
        double iva = calcularIVA(PRECIO_CON_IVA, precioSinIVA);

        mostrar("Compra", precioSinIVA);
        mostrar("IVA", iva);
    }

    // ---- MÉTODOS ----

    public static double calcularSinIVA(double precioConIVA, int ivaPorcentaje) {
        return precioConIVA / (1 + ivaPorcentaje / 100.0);
    }

    public static double calcularIVA(double precioConIVA, double precioSinIVA) {
        return precioConIVA - precioSinIVA;
    }

    public static void mostrar(String texto, double valor) {
        System.out.printf("%s: %.2f €%n", texto, valor);
    }
}
