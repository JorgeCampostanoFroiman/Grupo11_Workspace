package ejercicio1;

import java.io.IOException;

public class DniInvalido extends IOException {

	public DniInvalido(String mensaje){
		super(mensaje);
	}

	/*@Override
	public String getMessage() {
		return "Error DNI. Tiene Letras";
	}*/
}

