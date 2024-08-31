package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	private String ruta;
	
	// static method
	// public static String rutaEstatica = "prueba.txt";
	
	public boolean existe() {
		File archivo = new File(ruta);
		if(archivo.exists()) 
			return true;
		return false;
		}
	
	
	//getters and setters
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	
}
