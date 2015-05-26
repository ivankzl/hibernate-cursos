package ar.edu.um.dao;

import java.util.List;

import ar.edu.um.model.Tracking;


public interface ITrackingDAO {
	void persistTracking (Tracking tracking);
	List<Tracking> list();
}
