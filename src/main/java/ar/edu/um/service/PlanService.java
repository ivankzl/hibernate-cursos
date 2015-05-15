package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.PlanDAO;
import ar.edu.um.model.Plan;

@Service("planService")
public class PlanService implements IPlanService {
	
	@Autowired
	PlanDAO planDAO;

	@Transactional 
	public void persistPlan(Plan plan) {
		planDAO.persistPlan (plan);
	}
	
}
