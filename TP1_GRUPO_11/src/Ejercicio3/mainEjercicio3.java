package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

import Ejercicio1.Profesor;

public class mainEjercicio3 {

	public static void main(String[] args) {	
		ArrayList<IEdificio> lista = new ArrayList<IEdificio>(5);
		
		lista.add(new Polideportivo(2000, "Del Pilar", 2));
		lista.add(new Polideportivo(1000, "Municial de Moron", 1));
		lista.add(new Polideportivo(5000, "Polideportivo Leonel Messi", 5));
		
		lista.add(new Edifico_de_Oficinas(70));
		lista.add(new Edifico_de_Oficinas(120));

		
		Iterator<IEdificio> iterador = lista.iterator();
		
		while(iterador.hasNext())
		{
			//IEdificio aux = (IEdificio) iterador.next();
			System.out.println(iterador.next().toString());
		}
	}

}
