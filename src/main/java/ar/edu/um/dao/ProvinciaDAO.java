package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.um.model.Provincia;

public class ProvinciaDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistProvincia(Provincia provincia) {
		sessionFactory.getCurrentSession().persist(provincia);
	}
}
