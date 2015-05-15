package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.ProvinciaDAO;
import ar.edu.um.model.Provincia;

@Service("provinciaService")
public class ProvinciaService implements IProvinciaService {
	
	@Autowired
	ProvinciaDAO provinciaDAO;

	@Transactional 
	public void persistProvincia(Provincia provincia) {
		provinciaDAO.persistProvincia(provincia);
	}
	
}
