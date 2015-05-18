package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.TramiteDAO;
import ar.edu.um.model.Tramite;

public class TramiteService implements ITramiteService {
	@Autowired
	TramiteDAO tramiteDAO;

	@Transactional 
	public void persistTramite(Tramite tramite) {
		tramiteDAO.persistTramite(tramite);
	}

}
