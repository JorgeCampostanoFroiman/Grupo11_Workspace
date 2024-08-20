package Ejercicio1;

public class Profesor extends Empleado {
	private String cargo;
	private int antiguedadDocente;
	
	
	// Constructores
	
	
	public Profesor() {
		super();
		this.cargo = "sin cargo";
		this.antiguedadDocente = 0;
	}
	
	public Profesor(String nombre, String cargo, int edad, int antiguedad) 
	{
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedad;
	}
	
	// Getters and Setters

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	
	// toString()
	
	@Override
	public String toString() {
		return "Profesor " + getNombre() + ", Id: " + getId() + ", edad: " +getEdad() + ", cargo: " + getCargo() + ", antiguedad: " + getAntiguedadDocente();
	}
	
	
	
	
}
