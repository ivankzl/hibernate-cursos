package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Geografica;

@Service("geograficaDAO")
public class GeograficaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void persistGeografica(Geografica geografica) {
		sessionFactory.getCurrentSession().persist(geografica);
	}
}
