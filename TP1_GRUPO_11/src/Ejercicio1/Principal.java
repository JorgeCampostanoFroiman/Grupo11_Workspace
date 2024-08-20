package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Luis", 30);
		Empleado empleado2 = new Empleado("Jose", 22);
		Empleado empleado3 = new Empleado("Valentina", 42);
		Empleado empleado4 = new Empleado("Luis", 30);
		Empleado empleado5 = new Empleado();
		
		
		System.out.println(empleado1.toString());
		
		System.out.println(empleado2.toString());
		
		System.out.println(empleado3.toString());
		
		System.out.println(empleado4.toString());
		
		System.out.println(empleado5.toString());

		// Mostrar el próximo ID que será generado
        System.out.println("El próximo ID será el " + Empleado.devuelveProximoID());
        
        
	}

}
