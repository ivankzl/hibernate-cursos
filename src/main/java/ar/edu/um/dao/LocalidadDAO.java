package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Localidad;

@Service("localidadDAO")
public class LocalidadDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistLocalidad(Localidad localidad) {
		sessionFactory.getCurrentSession().persist(localidad);
	}

}
