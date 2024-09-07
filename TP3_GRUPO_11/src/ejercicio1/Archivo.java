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
			System.out.println("El archivo no existe " + ruta);
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
					
                    try {
                    	DniValidator.verificarDniInvalido(dniStr);
                        personas.add(new Persona(nombre, apellido, Integer.parseInt(dniStr)));
                    } catch (DniInvalido e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Error al convertir el DNI: " + dniStr);
                    }			
				}
			}
			System.out.println("Archivo leído.");
			buffer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (personas.isEmpty())
			System.out.println("No se han encontrado personas guardadadas en el archivo");
		
		return personas;
	}
	
	// Metodo para crear archivo
	public void crearArchivoPersonas(Set<Persona> personas) {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(ruta))) {
            for (Persona persona : personas) {
            	buffer.write(persona.getNombre() + "-" + persona.getApellido() + "-" + persona.getDni());
            	buffer.newLine();
            }
            System.out.println("Archivo creado. O sobreescrito.");
            buffer.close();
        } catch (IOException e) {
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
