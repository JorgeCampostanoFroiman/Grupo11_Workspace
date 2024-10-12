package entidad;

public class Seguro {

	private int id;
	private String descripcion;
	private int tipo;
	private float costo;
	private float costoMaximo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public float getCostoMaximo() {
		return costoMaximo;
	}
	public void setCostoMaximo(float costoMaximo) {
		this.costoMaximo = costoMaximo;
	}
	@Override
	public String toString() {
		return "Seguro [id=" + id + ", descripcion=" + descripcion + ", tipo=" + tipo + ", costo=" + costo
				+ ", costoMaximo=" + costoMaximo + "]";
	}
	
	
}
