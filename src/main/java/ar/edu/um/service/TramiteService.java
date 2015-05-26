package ar.edu.um.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.TramiteDAO;
import ar.edu.um.model.Tramite;

@Service("tramiteService")
public class TramiteService implements ITramiteService {
	@Autowired
	TramiteDAO tramiteDAO;

	@Transactional 
	public void persistTramite(Tramite tramite) {
		tramiteDAO.persistTramite(tramite);
	}
	
	@Transactional 
	public List<Tramite> list() {
		return tramiteDAO.list();
	}
	
	@Transactional
	public Tramite getTramite(int id) {
		return tramiteDAO.getTramite(id);
	}


}
