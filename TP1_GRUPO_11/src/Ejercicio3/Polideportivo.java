package Ejercicio3;

public class Polideportivo implements IInstalacionDepotiva , IEdificio  { //Un polideportivo es al mismo tiempo una instalación deportiva y un edificio; en Java interesa conocer la superficie que tiene y el nombre que tiene.

	private int superficie;
	private String nombre;
	private int tipo_instalacion; 
	
	public Polideportivo(){};

	public Polideportivo(int superficie, String nombre, int tipo){
		this.superficie = superficie;
		this.nombre = nombre;
		this.tipo_instalacion = tipo;
	};

	public int getTipo_instalacion() {
		return tipo_instalacion;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo_instalacion(int tipo_instalacion) {
		this.tipo_instalacion = tipo_instalacion;
	}
	
	@Override
	public void getTipoDeInstalacion() {
		System.out.println(tipo_instalacion);
	}
	
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}
	@Override
	public String toString() {
		return "El Polideportivo " + getNombre() + " cuenta con una superficie de: " + getSuperficieEdificio();
	}
	/*@Override
	public double getSuperficieEdificio() { LO CREE SOLO PARA PROBAR. (NO LO SUBI EN EL FORO) MARIANO F.
		return superficie;
	}

	@Override
	public String toString() {
		return "El Polideportivo " + getNombre() + " cuenta con una superficie de " + getSuperficieEdificio() + " .";
	}*/

}
