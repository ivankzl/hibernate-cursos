package ar.edu.um.dao;
import java.util.List;

import org.hibernate.Session;
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
	
<<<<<<< HEAD
	@SuppressWarnings("unchecked")
	public List<Persona> list() {
		Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        List<Persona> personList = (List<Persona>) session.createQuery("from Persona").list();
        return personList;
    }
=======
	public Persona findPersonaByClave(String clave) {
		return (Persona)sessionFactory.getCurrentSession().get(Persona.class, clave);
	}
>>>>>>> 6b5dab62497abad4e78a40f51f97af7a2740f953
}
