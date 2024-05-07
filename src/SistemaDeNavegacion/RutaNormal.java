package SistemaDeNavegacion;

public class RutaNormal implements RutaStrategy {
    public String calcularRuta (String puntoA, String puntoB) {
        return "Esta ruta la que tiene mejor acceso entre el " + puntoA + " y " + puntoB;
    }
}
