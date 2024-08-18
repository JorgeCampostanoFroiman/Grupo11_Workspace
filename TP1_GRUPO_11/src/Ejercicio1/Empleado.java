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
