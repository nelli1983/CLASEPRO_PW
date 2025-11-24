public class OperacionesBasicas {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;

        mostrar("Número 1", numero1);
        mostrar("Número 2", numero2);

        mostrar("Suma", sumar(numero1, numero2));
        mostrar("Resta", restar(numero1, numero2));
        mostrar("Multiplicación", multiplicar(numero1, numero2));
        mostrar("División", dividir(numero1, numero2));
    }

    // ---- MÉTODOS DE OPERACIÓN ----

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    // ---- MÉTODO PARA MOSTRAR ----

    public static void mostrar(String texto, int valor) {
        System.out.println(texto + ": " + valor);
    }
}
