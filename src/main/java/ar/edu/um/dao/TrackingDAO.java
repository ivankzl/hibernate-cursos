package ar.edu.um.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Tracking;

@Service("trackingDAO")
public class TrackingDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistTracking(Tracking tracking) {
		sessionFactory.getCurrentSession().persist(tracking);
	}

}
