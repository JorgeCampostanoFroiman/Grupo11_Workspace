package Ejercicio1;

public class Empleado {

	private final int id;
	
	private String nombre;
	
	private int edad;
	
	private static int contador_Empleados = 999;
	
	public Empleado() 
	{
		contador_Empleados++;
		id = contador_Empleados;
		nombre="Sin nombre";
		edad=99;
		
		
		
	}
	
	public Empleado(String nombre, int edad) 
	{
		contador_Empleados++;
		id = contador_Empleados;
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

	@Override
	public String toString() {
		return "Empleado " + getNombre() + ", edad: " + getEdad() + ", legajo: " + getId();
	}
	
}
