package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Lectivo;

@Service ("lectivoDAO")
public class LectivoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistLectivo(Lectivo lectivo) {
		sessionFactory.getCurrentSession().persist(lectivo);
	}
}
