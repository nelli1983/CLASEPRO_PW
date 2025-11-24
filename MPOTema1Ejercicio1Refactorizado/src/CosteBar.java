public class CosteBar {
    // 1. Constantes (mejor organización)
    static final int NUM_BEBIDAS = 3;
    static final int NUM_BOCADILLOS = 5;
    static final double PRECIO_BEBIDA = 1.20;
    static final double PRECIO_BOCADILLO = 2.05;
    static final int NUM_ALUMNOS = 5;

    public static void main(String[] args) {

        // 2. Cálculos usando funciones
        double subtotalBebidas = calcularSubtotal(NUM_BEBIDAS, PRECIO_BEBIDA);
        double subtotalBocadillos = calcularSubtotal(NUM_BOCADILLOS, PRECIO_BOCADILLO);
        double total = subtotalBebidas + subtotalBocadillos;
        double porAlumno = total / NUM_ALUMNOS;

        // 3. Mostrar resultados usando función
        mostrar("Subtotal bebidas", subtotalBebidas);
        mostrar("Subtotal bocadillos", subtotalBocadillos);
        mostrar("Total de la compra", total);
        mostrar("Cantidad por alumno", porAlumno);
    }

    // ---- MÉTODOS REFACORIZADOS ----

    public static double calcularSubtotal(int cantidad, double precio) {
        return cantidad * precio;
    }

    public static void mostrar(String texto, double valor) {
        System.out.println(texto + ": " + valor + " €");
    }
}

