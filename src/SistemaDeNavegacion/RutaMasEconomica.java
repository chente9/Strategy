package SistemaDeNavegacion;

public class RutaMasEconomica implements RutaStrategy {
    public String calcularRuta (String puntoA, String puntoB) {
        return "Ruta mas economica entre " + puntoA + " y " + puntoB;
    }
}
