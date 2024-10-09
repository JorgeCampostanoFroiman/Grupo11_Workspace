package entidad;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private int dni;

	public Persona(int idPersona, String nombre, int dni)
	{
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.dni = dni;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

}
