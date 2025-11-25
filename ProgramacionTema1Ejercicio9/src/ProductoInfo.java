public class ProductoInfo {
    public static void main(String[] args) {

        // Declaramos las variables del producto
        String nombre = "Auriculares Bluetooth";
        double precio = 29.99;
        String codigo = "AUR-2023";
        boolean disponible = true;

        // Mostramos los datos formateados
        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("--------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + "€");
        System.out.println("Código: " + codigo);
        System.out.println("Disponible: " + disponible);
    }
}
