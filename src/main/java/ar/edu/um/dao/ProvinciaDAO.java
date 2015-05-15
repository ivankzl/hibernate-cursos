package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Provincia;

@Service("provinciaDAO")
public class ProvinciaDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistProvincia(Provincia provincia) {
		sessionFactory.getCurrentSession().persist(provincia);
	}
}
