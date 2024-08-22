package Ejercicio1;

public class Empleado {

	private final int id;
	
	private String nombre;
	
	private int edad;
	
	private static int contador_Empleados = 1000;
	
	public Empleado() 
	{
		//contador_Empleados++;
		//id = contador_Empleados;
		
		this.id = contador_Empleados++;
		nombre="Sin nombre";
		edad=99;
	}
	
	@Override
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
	}

	public Empleado(String nombre, int edad) 
	{
		//contador_Empleados++;
		//id = contador_Empleados;
		
		this.id = contador_Empleados++;
		this.edad=edad;
		this.nombre=nombre;
	}
	

	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
	
	
	// Método estático para devolver el próximo ID
    public static int devuelveProximoID() {
        return contador_Empleados;
    }

	@Override
	public String toString() {
		return "Empleado " + getNombre() + ", edad: " + getEdad() + ", legajo: " + getId();
	}
	
}
