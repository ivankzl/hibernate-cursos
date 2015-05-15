package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.um.model.Plan;

public class PlanDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistCurso(Plan plan) {
		sessionFactory.getCurrentSession().persist(plan);
	}

}
