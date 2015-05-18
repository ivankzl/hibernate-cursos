package ar.edu.um.service;

import ar.edu.um.model.Persona;

public interface IPersonaService {

	void persistPersona(Persona persona);
	Persona findPersonaByClave(String clave);

}
