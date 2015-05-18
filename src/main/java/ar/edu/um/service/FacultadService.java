package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.FacultadDAO;
import ar.edu.um.model.Facultad;

@Service("facultadService")
public class FacultadService implements IFacultadService {
	
	@Autowired
	FacultadDAO facultadDAO;

	@Transactional 
	public void persistFacultad(Facultad facultad) {
		facultadDAO.persistFacultad(facultad);
	}
	
	@Transactional
	public Facultad findFacultadByFac_ID(int Fac_ID){
		return facultadDAO.findCursoByFac_ID(Fac_ID);
	}
	
}
