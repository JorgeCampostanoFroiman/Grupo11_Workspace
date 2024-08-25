package Ejercicio3;

public class Edifico_de_Oficinas implements IEdificio{

	private int Cantidad_De_Oficinas;
	private double superficie; 
	
	public Edifico_de_Oficinas() 
	{
		Cantidad_De_Oficinas = 0; 
	}
	
	public Edifico_de_Oficinas(int cant_oficinas) 
	{
		Cantidad_De_Oficinas = cant_oficinas;
	}
	
	public int getCantidad_De_Oficinas() {
		return Cantidad_De_Oficinas;
	}

	public void setCantidad_De_Oficinas(int cantidad_De_Oficinas) {
		Cantidad_De_Oficinas = cantidad_De_Oficinas;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public String toString() {
		return "El edificio cuenta con " + getCantidad_De_Oficinas() + " de oficinas";
	}

}
