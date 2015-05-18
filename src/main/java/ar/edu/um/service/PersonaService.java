package ar.edu.um.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.PersonaDAO;
import ar.edu.um.model.Persona;

@Service("personaService")
public class PersonaService implements IPersonaService {
	
	@Autowired
	PersonaDAO personaDAO;

	@Transactional 
	public void persistPersona (Persona persona) {
		personaDAO.persistPersona (persona);
	}

<<<<<<< HEAD
	public List<Persona> list() {
		return personaDAO.list();
=======
	public Persona findPersonaByClave(String clave) {
		return (Persona)personaDAO.findPersonaByClave(clave);
>>>>>>> 6b5dab62497abad4e78a40f51f97af7a2740f953
	}
	
}
