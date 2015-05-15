package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.CursosDAO;
import ar.edu.um.dao.FacultadDAO;
import ar.edu.um.model.Aluleg;
import ar.edu.um.model.Facultad;
import ar.edu.um.model.Localidad;

@Service("facultadService")
public class FacultadService implements IFacultadService {
	
	@Autowired
	FacultadDAO facultadDAO;

	@Transactional 
	public void persistFacultad(Facultad facultad) {
		facultadDAO.persistFacultad(facultad);
	}
	
}
