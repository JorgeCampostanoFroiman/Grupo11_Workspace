package Ejercicio2;

public final class ProductoFresco extends Producto{
	String fechaEnvasado;
	String paisOrigen;
	
	//Constructor
	public ProductoFresco(){
		super();
	}
	public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen){
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
	
	
    @Override
    public void mostrarInformacion() {
    	System.out.println("Producto Fresco");
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen + "\n");
    }
	
	/*//ToString
	
	@Override
	public String toString() {
		 return "Producto Fresco\n" +         
		           "Fecha de caducidad: " + super.getFechaCaducidad() + "\n" +
		           "Número de lote: " + super.getNumeroLote() + "\n" +
		           "Fecha de envasado: " + getFechaEnvasado() + "\n" +
		           "País de origen: " + getPaisOrigen() + "\n";
	}*/
}