package Ejercicio2;

public class Producto {
	private String fechaCaducidad;
	private int numeroLote;
	
	//Constructor
    public Producto() {
        this.fechaCaducidad = "Si fecha";
        this.numeroLote = -1;
    }
	
    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    
    // Getters y setters
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Fecha de caducidad: " + fechaCaducidad + ", Número de lote: " + numeroLote);
    }
}
