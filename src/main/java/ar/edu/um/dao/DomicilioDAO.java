package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Domicilio;

@Service("domicilioDAO")
public class DomicilioDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistDomicilio(Domicilio domicilio) {
		sessionFactory.getCurrentSession().persist(domicilio);
	}
}
