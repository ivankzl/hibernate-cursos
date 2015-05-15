package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.GeograficaDAO;
import ar.edu.um.model.Geografica;

@Service("geograficaService")
public class GeograficaService implements IGeograficaService {
	
	@Autowired
	GeograficaDAO geograficaDAO;

	@Transactional 
	public void persistGeografica(Geografica geografica) {
		geograficaDAO.persistGeografica (geografica);
	}
	
}
