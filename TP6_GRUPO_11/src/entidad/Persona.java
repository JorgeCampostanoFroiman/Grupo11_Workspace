package entidad;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;

	public Persona(String apellido, String nombre, int dni)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	
    @Override
    public String toString() {
        return nombre + " " + apellido + " (DNI: " + dni + ")";
    }

}
