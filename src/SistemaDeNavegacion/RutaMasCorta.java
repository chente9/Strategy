package SistemaDeNavegacion;

public class RutaMasCorta implements RutaStrategy {
    public String calcularRuta (String puntoA, String puntoB) {
        return "Ruta mas corta entre " + puntoA + " y " + puntoB;
    }
}

