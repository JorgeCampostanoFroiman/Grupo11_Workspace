
public class Pelicula implements Comparable<Pelicula>{
    private static int contadorID = 1;
    private int id;
    private String nombre;
    private Categoria categoria;
    
    public Pelicula(String nombre, Categoria categoria) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.categoria = categoria;
    }
    
    public Pelicula() {
        
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
	 @Override
	    public String toString() {
	        return "ID: " + id + ", Nombre: " + nombre + ", Genero: " + categoria.getNombre();
	    }

	@Override
	public int compareTo(Pelicula o) {
        return this.nombre.compareToIgnoreCase(o.getNombre());
	}

     
}
