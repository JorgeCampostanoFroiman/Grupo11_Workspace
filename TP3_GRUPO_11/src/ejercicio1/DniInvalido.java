package ejercicio1;

public class DniInvalido extends Exception {

	public DniInvalido(){}

	@Override
	public String getMessage() {
		return "Error DNI. Tiene Letras";
	}
}
