package ar.edu.um.service;

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

	public Persona findPersona() {
		return personaDAO.findPersona();
	}
	
}
