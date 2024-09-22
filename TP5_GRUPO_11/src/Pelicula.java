
public class Pelicula {
    private static int contadorID = 1;
    private int id;
    private String nombre;
    private Categoria categoria;
    
    public Pelicula(String nombre, Categoria categoria) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.categoria = categoria;
    }
}
