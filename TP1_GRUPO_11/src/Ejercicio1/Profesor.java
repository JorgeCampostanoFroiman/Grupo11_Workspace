package Ejercicio1;

import java.util.Objects;

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

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}*/
	
    @Override
    public boolean equals(Object self) {
        if (this == self) return true;
        if (self == null || getClass() != self.getClass()) return false;
        Profesor profesor = (Profesor) self;
        return antiguedadDocente == profesor.antiguedadDocente &&
               Objects.equals(getNombre(), profesor.getNombre()) &&
               getEdad() == profesor.getEdad() &&
               Objects.equals(cargo, profesor.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad(), cargo, antiguedadDocente);
    }
}
