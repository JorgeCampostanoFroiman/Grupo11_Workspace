package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

public class Archivo {

	private String ruta;

	public boolean existe() {
		File archivo = new File(ruta);
		if (archivo.exists())
			return true;
		return false;
	}

	// Metodo para leer personas desde archivo
	public Set<Persona> leerPersonas() {
		Set<Persona> personas = new TreeSet<>((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));

		if (!existe()) {
			System.out.println("El archivo no existe: " + ruta);
			return personas;
		}

		try (BufferedReader buffer = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while ((linea = buffer.readLine()) != null) {
				String[] datos = linea.split("-");
				if (datos.length == 3) {
					String nombre = datos[0].trim();
					String apellido = datos[1].trim();
					String dniStr = datos[2].trim();

					Persona aux = new Persona();
					aux.setNombre(nombre);
					aux.setApellido(apellido);
					
					// Si el dni es valido, lo tranformo para seteralo y agrego a la lista
					if (DniValidator.verificarDniInvalido(dniStr)) {
						aux.setDni(Integer.parseInt(dniStr));
						personas.add(aux);
					}				
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (personas.isEmpty())
			System.out.println("No se han encontrado personas guardadadas en el archivo");
		
		return personas;
	}
	
	public void crearArchivoPersonas(String listaPersonas) {
		try {
			FileWriter entrada = new FileWriter("Resultante.txt",true); // no lo sobreescribo.
			BufferedWriter mibuffer = new BufferedWriter(entrada);
			mibuffer.write(listaPersonas);
			mibuffer.close();
			entrada.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	// getters and setters

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	

	
}
