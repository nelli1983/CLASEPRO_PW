public class CosteBar {
    public static void main (String [] args) {

int numBebidas=3;
int numBocadillos=5;
double precioBebida=1.20;
double precioBocadillo=2.05;
int numAlumnos=5;

double subtotalBebidas= numBebidas*precioBebida;
double subtotalBocadillos=numBocadillos*precioBocadillo;
double totalCompra=subtotalBebidas+subtotalBocadillos;
double cantidadPorAlumno=totalCompra/numAlumnos;

//Llamamos a los métodos que imprimen:
        CosteBar.subtotal (numBebidas,precioBebida);
        CosteBar.subtotal (numBocadillos, precioBocadillo);
        CosteBar.total (subtotalBebidas, subtotalBocadillos);
        CosteBar.porAlumno (total, numAlumnos);


System.out.printf("Subtotal bebidas:%.2f %n", subtotalBebidas);
System.out.printf("Subtotal bocadillos: %.2f %n", subtotalBocadillos);
System.out.printf("Total de la compra: %.2f %n", totalCompra);
System.out.printf("Cantidad por alumno: %.2f %n", cantidadPorAlumno);
    }
}
