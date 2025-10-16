public class Main {
    public static void main(String[] args) {
        final String APLICACION = "MiApp";
        final String VERSION = "1.0.0";
        final double PI = 3.14159;

        String usuario = "Laura";
        int nivel = 1;
        int puntuacion = 0;

        System.out.println("Aplicación:"+APLICACION);
        System.out.println("Versión:"+VERSION);
        System.out.println("Valor de PI:"+PI);
        System.out.println("Usuario actual:"+usuario);
        System.out.println("Nivel:"+nivel);
        System.out.println("Puntuación:"+puntuacion);

        usuario = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.println("Usuario actualizado:"+usuario);
        System.out.println("Nivel actualizado:"+nivel);
        System.out.println("Puntuación actualizada:"+puntuacion);

    }
}
