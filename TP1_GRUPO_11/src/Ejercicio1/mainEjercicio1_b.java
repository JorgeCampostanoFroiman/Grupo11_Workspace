package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {

		TreeSet<Profesor> listaprofesores = new TreeSet<Profesor>();
		
		
		listaprofesores.add(new Profesor("Alberto", "Director", 51, 27));
		listaprofesores.add(new Profesor("Gustavo", "Vicedirector", 44, 22));
		listaprofesores.add(new Profesor("Nicolás", "Secretario", 37, 12));
		listaprofesores.add(new Profesor("Mariano", "Docente", 42, 18));
		listaprofesores.add(new Profesor("Alfredo", "Docente", 53, 27));
			
		
		
		Iterator<Profesor> iterador = listaprofesores.iterator();
		
		while(iterador.hasNext())
		{
			Profesor aux = (Profesor) iterador.next();
			System.out.println(aux.toString());
		}
	}

}
