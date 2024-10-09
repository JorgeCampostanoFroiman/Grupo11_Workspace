package negocio;

import java.util.ArrayList;

import entidad.Persona;

public interface PersonaNegocio {

	// Aqui iran las declaraciones para los metodos de agregar, eliminar y listar (negocio)
	public boolean Insert(Persona persona);
	public boolean Update(Persona persona_modificada);
	public boolean Delete(Persona persona_a_elimianar);
	public ArrayList<Persona> GetListAll();
}
