package Ejercicio1;

public class Empleado {

	private final int id;
	
	private String nombre;
	
	private int edad;
	
	static int contador_Empleados = 999;
	
	
	public Empleado() 
	{
		contador_Empleados++;
		
		id = contador_Empleados;
	}
}
