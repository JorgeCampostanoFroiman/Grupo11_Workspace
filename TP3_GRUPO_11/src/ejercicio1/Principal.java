package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Persona prueba = new Persona ("Jorge", "Campostano", 12345678);
		Archivo archivo = new Archivo();		
		
		
		System.out.println(prueba);
		
		archivo.setRuta("Personas.txt");
		System.out.println(archivo.leerPersonas());

	}
	

}
