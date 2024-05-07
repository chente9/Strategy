package SistemaDeNavegacion;

public class RutaMasLarga implements RutaStrategy {
    public String calcularRuta (String puntoA, String puntoB) {
        return "Esta ruta la mas larga entre el " + puntoA + " y " + puntoB;
    }
}
