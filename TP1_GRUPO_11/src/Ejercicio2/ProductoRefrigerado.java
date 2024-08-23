package Ejercicio2;

public class ProductoRefrigerado extends Producto{
	int codigoOrganismoSupervisor;
	
	//Constructor
	public ProductoRefrigerado(){
		super();
	}
	public ProductoRefrigerado(int codigoOrganismoSupervisor, String fechaCaducidad, int numeroLote){
		super(fechaCaducidad,numeroLote);
		this.codigoOrganismoSupervisor = codigoOrganismoSupervisor;
	}

	
	//Getters & Setters
	public int getCodigoOrganismoSupervisor() {
		return codigoOrganismoSupervisor;
	}
	public void setCodigoOrganismoSupervisor(int codigoOrganismoSupervisor) {
		this.codigoOrganismoSupervisor = codigoOrganismoSupervisor;
	}
	
	//ToString
	
	@Override
	public String toString() {
		 return "Producto Refrigerado\n" +
		           "Fecha de caducidad: " + super.getFechaCaducidad() + "\n" +
		           "Número de lote: " + super.getNumeroLote() + "\n" +
		           "Codigo Organismo alimentario Supervisor: " + getCodigoOrganismoSupervisor() + "\n";
	}
	
	
}