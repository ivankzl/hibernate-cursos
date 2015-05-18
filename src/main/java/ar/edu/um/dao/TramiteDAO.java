package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Tramite;

@Service("tramiteDAO")
public class TramiteDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistTramite(Tramite tramite) {
		sessionFactory.getCurrentSession().persist(tramite);
	}
}
