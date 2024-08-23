package Ejercicio2;

public final class ProductoRefrigerado extends Producto{
	int codigoOrganismoSupervisor;
	
	//Constructor
	public ProductoRefrigerado(){
		super();
	}
	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, int codigoOrganismoSupervisor){
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
	
	
    @Override
    public void mostrarInformacion() {
    	System.out.println("Producto Refrigerado");
        super.mostrarInformacion();
        System.out.println("Código del organismo de supervisión: " + codigoOrganismoSupervisor + "\n");
    }
	
	/*//ToString
	
	@Override
	public String toString() {
		 return "Producto Refrigerado\n" +
		           "Fecha de caducidad: " + super.getFechaCaducidad() + "\n" +
		           "Número de lote: " + super.getNumeroLote() + "\n" +
		           "Codigo Organismo alimentario Supervisor: " + getCodigoOrganismoSupervisor() + "\n";
	}*/
}