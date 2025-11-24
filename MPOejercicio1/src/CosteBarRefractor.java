public class CosteBarRefactor {
    public static void main (String [] args) {
        int numBebidas=3;
        int numBocadillos=5;
        double precioBebida=1.20;
        double precioBocadillo=2.05;
        int numAlumnos=5;

        double subBebidas=CosteBar.subtotal (numBebidas,precioBebida);
        double subBocadillos=CosteBar.subtotal (numBocadillos, precioBocadillo);
        double total=CosteBar.total (subBebidas, subBocadillos);
        double porAlumno=CosteBar.porAlumno (total, numAlumnos);

        CosteBar.imprimirResumen(subBebidas,subBocadillos, total, porAlumno);
    }
}

