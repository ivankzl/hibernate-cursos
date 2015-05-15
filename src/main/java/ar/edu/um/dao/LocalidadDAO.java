package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.um.model.Localidad;


public class LocalidadDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistCurso(Localidad localidad) {
		sessionFactory.getCurrentSession().persist(localidad);
	}

}
