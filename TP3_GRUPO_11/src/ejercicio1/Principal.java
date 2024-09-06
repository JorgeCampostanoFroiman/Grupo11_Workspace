package ejercicio1;

import java.io.IOException;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Archivo archivoLectura = new Archivo();	
		Archivo archivoEscritura = new Archivo();	
		String ruta = " ";  
		String rutaResultado = " ";
		archivoLectura.setRuta(ruta);
		archivoEscritura.setRuta(rutaResultado);
		
		
		try 
		{
			Set<Persona> PersonasArchivo = archivoLectura.leerPersonas();
			
			if (!PersonasArchivo.isEmpty()) {
				archivoEscritura.crearArchivoPersonas(PersonasArchivo);		
			}	
		} 
		catch (RuntimeException e) 
		{
			System.out.println(e.getMessage());
		}				
	}
}
