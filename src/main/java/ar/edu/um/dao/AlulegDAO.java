package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Aluleg;

@Service("alulegDAO")
public class AlulegDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void persistAluleg(Aluleg aluleg) {
		sessionFactory.getCurrentSession().persist(aluleg);
	}

}
