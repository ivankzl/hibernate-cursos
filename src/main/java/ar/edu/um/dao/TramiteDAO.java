package ar.edu.um.dao;
import java.util.List;

import org.hibernate.Query;
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
	
	public List<Tramite> list() {
		
        @SuppressWarnings("unchecked")
		List<Tramite> tramiteList = (List<Tramite>) sessionFactory.getCurrentSession().createQuery("from Tramite").list();
        return tramiteList;
    }
	
	public Tramite getTramite(int id) {
		
		 Query query = sessionFactory.getCurrentSession().createQuery("from Tramite where tra_id = :id ");
		 query.setParameter("id", id);
		 Tramite tramite = (Tramite) query.uniqueResult();
		 return tramite;
    }

}
