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
        
        //Punto 7 creacion de objetos profesor que commpara similitud y arrojan respuesta en caso de true 
        
        Profesor prof1 = new Profesor("Martin","Profesor",45,10);
        Profesor prof2 = new Profesor("Martin","Profesor",45,10);
        
        if (prof1.equals(prof2))
        {
        	System.out.println("Es el mismo profesor");
        }else
        {
        	System.out.println("No es el mismo profesor");
        }
	}

}
