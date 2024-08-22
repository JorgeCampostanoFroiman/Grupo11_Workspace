package Ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {
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

	@Override
	public int compareTo(Profesor arg0) {
		
		if (arg0.getId() == this.getId()) {
			return 0;
		}
		
		if (arg0.getId() < this.getId()) {
			return 1;
		}
	
		return -1;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
	
	
	
	
}
