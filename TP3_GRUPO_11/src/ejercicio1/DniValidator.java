package ejercicio1;

public class DniValidator {

    public static void verificarDniInvalido(String dni) throws DniInvalido {
        if (!dni.matches("\\d+")) {
            throw new DniInvalido("El DNI contiene caracteres no válidos. Debe contener solo números.");
        }
    }
}
