package ar.edu.um.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Carrera;

@Service("carreraDAO")
public class CarreraDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistCarrera(Carrera carrera) {
		sessionFactory.getCurrentSession().persist(carrera);
	}
}
