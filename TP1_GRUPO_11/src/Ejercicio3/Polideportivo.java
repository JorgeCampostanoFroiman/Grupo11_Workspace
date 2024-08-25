package Ejercicio3;

public class Polideportivo implements ITipoInstalacion { //Un polideportivo es al mismo tiempo una instalación deportiva y un edificio; en Java interesa conocer la superficie que tiene y el nombre que tiene.

	private int superficie;
	private String nombre;
	
	public Polideportivo(){};

	public Polideportivo(int superficie, String nombre){
		this.superficie = superficie;
		this.nombre = nombre;
	};

	
	public int getSuperficie() {
		return superficie;
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

	
	@Override
	public void getTipoDeInstalacion() {
		System.out.println("Es una Instalacion Deportiva y un Edificio");
	}
	
	/*@Override
	public double getSuperficieEdificio() { LO CREE SOLO PARA PROBAR. (NO LO SUBI EN EL FORO) MARIANO F.
		return superficie;
	}

	@Override
	public String toString() {
		return "El Polideportivo " + getNombre() + " cuenta con una superficie de " + getSuperficieEdificio() + " .";
	}*/
	@Override
	public String toString() {
		return "El Polideportivo " + getNombre() + " cuenta con una superficie XXXYYZZ.";
	}
}
