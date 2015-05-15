package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.DomicilioDAO;
import ar.edu.um.model.Domicilio;

@Service("domicilioService")
public class DomicilioService implements IDomicilioService {
	
	@Autowired
	DomicilioDAO domicilioDAO;

	@Transactional 
	public void persistDomicilio(Domicilio domicilio) {
		domicilioDAO.persistDomicilio (domicilio);
	}
	
}
