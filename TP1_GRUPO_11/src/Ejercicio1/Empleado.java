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
	
	
}
