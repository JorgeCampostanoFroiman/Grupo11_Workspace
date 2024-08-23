package Ejercicio2;

public class ProductoCongelado extends Producto{
	float tempCongelacion;
	
	//Constructor
	public ProductoCongelado(){
		super();
	}
	public ProductoCongelado(float tempCongelacion, String fechaCaducidad, int numeroLote){
		super(fechaCaducidad,numeroLote);
		this.tempCongelacion = tempCongelacion;
	}

	
	//Getters & Setters
	public float gettempCongelacion() {
		return tempCongelacion;
	}
	public void settempCongelacion(float tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}
	
	//ToString
	
	@Override
	public String toString() {
		 return "Producto Congelado\n" +
		           "Fecha de caducidad: " + super.getFechaCaducidad() + "\n" +
		           "Número de lote: " + super.getNumeroLote() + "\n" +
		           "Temperatura de congelacion: " + gettempCongelacion() + "\n";
	}
	
	
}