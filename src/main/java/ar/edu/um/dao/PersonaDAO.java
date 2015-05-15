package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.um.model.Persona;

public class PersonaDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistCurso(Persona persona) {
		sessionFactory.getCurrentSession().persist(persona);
	}
}
