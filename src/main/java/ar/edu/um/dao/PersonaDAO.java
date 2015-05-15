package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Persona;

@Service("personaDAO")
public class PersonaDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistPersona(Persona persona) {
		sessionFactory.getCurrentSession().persist(persona);
	}
	
	public void findPersona() {
	//	sessionFactory.getCurrentSession().get(clazz, id)
	}
}
