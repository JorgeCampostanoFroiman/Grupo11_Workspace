package negocioImpl;

import java.util.ArrayList;
import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio{

	private PersonaDao personaDao = new PersonaDaoImpl();
	
    @Override
    public boolean Insert(Persona persona) {
        return personaDao.Insert(persona);
    }

    @Override
    public boolean Update(Persona persona_modificada) {
        return personaDao.Update(persona_modificada);
    }

    @Override
    public boolean Delete(Persona persona_a_elimianar) {
        return personaDao.Delete(persona_a_elimianar);
    }


    @Override
    public ArrayList<Persona> GetListAll() {
        return personaDao.GetListAll();
    }
}
