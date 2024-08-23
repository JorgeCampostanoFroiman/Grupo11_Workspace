package Ejercicio2;

public class ProductoFresco extends Producto{
	String fechaEnvasado;
	String paisOrigen;
	
	//Constructor
	public ProductoFresco(){
		super();
	}
	public ProductoFresco(String fechaEnvasado, String paisOrigen, String fechaCaducidad, int numeroLote){
		super(fechaCaducidad,numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	
	//Getters & Setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
	//ToString
	
	@Override
	public String toString() {
		 return "Producto Fresco\n" +         
		           "Fecha de caducidad: " + super.getFechaCaducidad() + "\n" +
		           "Número de lote: " + super.getNumeroLote() + "\n" +
		           "Fecha de envasado: " + getFechaEnvasado() + "\n" +
		           "País de origen: " + getPaisOrigen() + "\n";
	}
	
}