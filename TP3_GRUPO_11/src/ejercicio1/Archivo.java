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
		if(archivo.exists()) 
			return true;
		return false;
		}
	
	//Metodo para leer personas desde archivo
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

                    try {
                    	//Aca tendriamos que verificar el dni y cargar el objeto
                    } catch () {
                    	//Aca se tendria que mostrar el mensaje del validor.
                    	//Quiza esta de mas
                    } catch () {
                    	//Aca podriamos tirar un mensaje de error por si intentamos
                    	//Convertir el dniStr en int y sale mal.
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personas;
    }
	
	//getters and setters
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}
