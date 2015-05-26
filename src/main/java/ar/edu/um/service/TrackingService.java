package ar.edu.um.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.TrackingDAO;
import ar.edu.um.model.Tracking;
import ar.edu.um.model.Tramite;

@Service("trackingService")
public class TrackingService implements ITrackingService {
	@Autowired
	TrackingDAO trackingDAO;

	@Transactional 
	public void persistTracking(Tracking tracking) {
		trackingDAO.persistTracking(tracking);
	}

	@Transactional 
	public List<Tracking> list() {
		return trackingDAO.list();
	}
}
