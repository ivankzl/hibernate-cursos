package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.LocalidadDAO;
import ar.edu.um.model.Localidad;

@Service("localidadService")
public class LocalidadService implements ILocalidadService {
	
	@Autowired
	LocalidadDAO localidadDAO;

	@Transactional 
	public void persistLocalidad(Localidad localidad) {
		localidadDAO.persistLocalidad (localidad);
	}
	
}
