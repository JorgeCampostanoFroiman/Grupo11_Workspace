package Ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(5);
		
		listaProfesores.add(new Profesor("Osvaldo", "Director", 51, 27));
		listaProfesores.add(new Profesor("Gerardo", "Vicedirector", 44, 22));
		listaProfesores.add(new Profesor("Eustaquio", "Secretario", 37, 12));
		listaProfesores.add(new Profesor("Romualdo", "Docente", 42, 18));
		listaProfesores.add(new Profesor("Berenice", "Docente", 53, 27));
										
        System.out.println("Iteración de Profesores: ");
		
        ListIterator<Profesor> it = listaProfesores.listIterator();
        while(it.hasNext()) {
        	//Profesor profe = it.next();
        	//System.out.println(profe.toString());
        	
        	System.out.println(it.next());
        }
	}

}
