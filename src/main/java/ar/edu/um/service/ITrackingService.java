package ar.edu.um.service;

import java.util.List;

import ar.edu.um.model.Tracking;

public interface ITrackingService {
	void persistTracking(Tracking tracking);
	List<Tracking> list();
}
