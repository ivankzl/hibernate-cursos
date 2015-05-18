package ar.edu.um.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.EstadoTipo;

@Service("estadotipoDAO")
public class EstadoTipoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistEstadoTipo(EstadoTipo estadoTipo) {
		sessionFactory.getCurrentSession().persist(estadoTipo);
	}
}
