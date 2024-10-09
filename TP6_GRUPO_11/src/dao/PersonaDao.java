package dao;

import java.util.ArrayList;

import entidad.Persona;

public interface PersonaDao {
	
 // Aqui iran las declaraciones para los metodos de agregar, eliminar y listar
	public boolean Insert(Persona persona);
	public boolean Update(Persona persona_modificada);
	public boolean Delete(Persona persona_a_elimianar);
	public ArrayList<Persona> GetListAll();
}
