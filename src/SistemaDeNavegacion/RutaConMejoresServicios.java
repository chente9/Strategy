package SistemaDeNavegacion;

public class RutaConMejoresServicios implements RutaStrategy {
    public String calcularRuta (String puntoA, String puntoB) {
        return "Esta ruta la que tiene muchos servios a su paso entre el " + puntoA + " y " + puntoB;
    }
}
