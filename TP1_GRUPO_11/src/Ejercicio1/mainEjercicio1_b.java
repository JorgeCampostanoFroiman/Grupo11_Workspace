package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {

		TreeSet<Profesor> listaprofesores = new TreeSet<Profesor>();
		
		
		listaprofesores.add(new Profesor());
		listaprofesores.add(new Profesor("Gustavo", "Vicedirector", 44, 22));
		listaprofesores.add(new Profesor("Nicolás", "Secretario", 37, 12));
		listaprofesores.add(new Profesor("Mariano", "Docente", 42, 18));
		listaprofesores.add(new Profesor("Alfredo", "Docente", 53, 27));
			
		
		
		Iterator<Profesor> iterador = listaprofesores.iterator();
		
		while(iterador.hasNext())
		{
			System.out.println(iterador.next());
		}
		
		
        // Comparar dos objetos profesor
        Profesor profesor1 = new Profesor("Ana",  "Titular", 40, 15);
        Profesor profesor2 = new Profesor("Ana",  "Titular", 40, 15);
        System.out.println("-------");
        if (profesor1.equals(profesor2)) {
            System.out.println("Es el mismo profesor.");
        } else {
            System.out.println("No es el mismo profesor.");
        }
	}

}
