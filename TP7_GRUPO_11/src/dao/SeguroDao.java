package dao;

import java.util.ArrayList;

import entidad.Seguro;

public interface SeguroDao {

	
	public boolean Insert(Seguro persona);
	public int UltimoId ();
	public ArrayList<String> GetTypeAll();//->Lista tipos de seguros para el combobox
	public ArrayList<Seguro> GetListAll();
}
