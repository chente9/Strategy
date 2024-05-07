package SistemaDeNavegacion;

public class App {
    public static void main(String[] args) {

        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaMasLarga());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaConMejoresServicios());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaNormal());
        gps.calcularRuta("Punto A", "Punto B");
    }
}