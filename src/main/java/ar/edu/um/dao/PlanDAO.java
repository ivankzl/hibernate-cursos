package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Plan;

@Service("planDAO")
public class PlanDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistPlan(Plan plan) {
		sessionFactory.getCurrentSession().persist(plan);
	}

}
