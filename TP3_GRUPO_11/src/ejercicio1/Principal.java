package ejercicio1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Archivo archivoLectura = new Archivo();	
		Archivo archivoEscritura = new Archivo();	
		String ruta = " ";  
		String rutaResultado = " ";
		archivoLectura.setRuta("Personas.txt");
		archivoEscritura.setRuta("Resultado.txt");
		
		
		try 
		{
			Set<Persona> PersonasArchivo = archivoLectura.leerPersonas();
			
			if (!PersonasArchivo.isEmpty()) {
				archivoEscritura.crearArchivoPersonas(PersonasArchivo);		
			}	
			
//			Iterator<Persona> iterador = PersonasArchivo.iterator();
//			
//			while(iterador.hasNext())
//			{
//				Persona p = (Persona) iterador.next();
//				System.out.println(p.toString());
//			}
			
		} 
		catch (RuntimeException e) 
		{
			System.out.println(e.getMessage());
		}	
		
	}
}
