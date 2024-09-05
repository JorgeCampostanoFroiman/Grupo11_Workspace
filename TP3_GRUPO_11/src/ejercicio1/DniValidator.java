package ejercicio1;

public class DniValidator {

    public static boolean verificarDniInvalido(String dni) throws DniInvalido {
        if (!dni.matches("\\d+")) {
        	throw new DniInvalido("El DNI:" + dni + ", contiene caracteres no v�lidos. Debe contener solo n�meros.");
        }
        return true;
    }
}
