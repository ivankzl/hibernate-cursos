package ar.edu.um.service;

import java.util.List;

import ar.edu.um.model.Persona;

public interface IPersonaService {

	void persistPersona(Persona persona);
<<<<<<< HEAD
	List<Persona> list();
=======
	Persona findPersonaByClave(String clave);
>>>>>>> 6b5dab62497abad4e78a40f51f97af7a2740f953

}
