package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.CarreraDAO;
import ar.edu.um.model.Carrera;

@Service("carreraService")
public class CarreraService implements ICarreraService {
	
	@Autowired
	CarreraDAO carreraDAO;

	@Transactional 
	public void persistCarrera(Carrera carrera) {
		carreraDAO.persistCarrera (carrera);
	}
	
}
