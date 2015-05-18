package ar.edu.um.dao;

import ar.edu.um.model.Persona;

public interface IPersonaDAO {
	void persistPersona (Persona persona);
	Persona findPersonaByClave(String clave);
}
