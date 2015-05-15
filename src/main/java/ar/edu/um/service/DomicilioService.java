package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.CursosDAO;
import ar.edu.um.model.Aluleg;
import ar.edu.um.model.Lectivo;
import ar.edu.um.model.Localidad;

@Service("domicilioService")
public class DomicilioService implements IDomicilioService {
	
	@Autowired
	DomicilioDAO domicilioDAO;

	@Transactional 
	public void persistDomicilio(Domicilio domicilio) {
		domicilioDAO.persistDomicilio (domicilio);
	}
	
}
