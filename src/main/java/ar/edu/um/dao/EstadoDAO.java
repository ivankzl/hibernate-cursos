package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Estado;

@Service("estadoDAO")
public class EstadoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistEstado(Estado estado) {
		sessionFactory.getCurrentSession().persist(estado);
	}

}
