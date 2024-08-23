package Ejercicio2;

public final class ProductoCongelado extends Producto{
	private float tempCongelacion;
	
	//Constructor
	public ProductoCongelado(){
		super();
	}
	public ProductoCongelado(String fechaCaducidad, int numeroLote, float tempCongelacion){
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
	
	@Override
    public void mostrarInformacion() {
		System.out.println("Producto Congelado");
        super.mostrarInformacion();
        System.out.println("Temperatura recomendada: " + tempCongelacion + "°C" + "\n");
    }
	
	/*//ToString
	
	@Override
	public String toString() {
		 return "Producto Congelado\n" +
		           "Fecha de caducidad: " + super.getFechaCaducidad() + "\n" +
		           "Número de lote: " + super.getNumeroLote() + "\n" +
		           "Temperatura de congelacion: " + gettempCongelacion() + "\n";
	}*/
}