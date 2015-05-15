package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Facultad;

@Service("facultadDAO")
public class FacultadDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistFacultad(Facultad facultad) {
		sessionFactory.getCurrentSession().persist(facultad);
	}
}
