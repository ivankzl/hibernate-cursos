package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.TrackingDAO;
import ar.edu.um.model.Tracking;

public class TrackingService implements ITrackingService {
	@Autowired
	TrackingDAO trackingDAO;

	@Transactional 
	public void persistTracking(Tracking tracking) {
		trackingDAO.persistTracking(tracking);
	}

}
